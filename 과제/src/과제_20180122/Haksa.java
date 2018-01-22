package 과제_20180122;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Haksa extends JFrame {
	Connection conn;
	JPanel panel;
	
	Haksa(){
		setTitle("학사관리시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu m_student = new JMenu("학생관리"); //메뉴
		bar.add(m_student);
		JMenu m_book = new JMenu("도서관리"); //2번째 메뉴
		bar.add(m_book);
		
		JMenuItem mi_list = new JMenuItem("학생정보");
		m_student.add(mi_list);
		JMenuItem mi_bookRent = new JMenuItem("대출현황");
		m_book.add(mi_bookRent);
		
		//메뉴아이템 이벤트처리
		mi_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //모든 컴포넌트 삭제
				panel.revalidate(); //다시 활성화
				panel.repaint(); //다시 그리기
				panel.add(new Student()); //학생정보에 대한 화면을 구현할 클래스를 생성
				panel.setLayout(null); //레이아웃 적용 안함.
			}
		});
		
		//대출현황 아이템 이벤트 처리
		mi_bookRent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //모든 컴포넌트 삭제
				panel.revalidate(); //다시 활성화
				panel.repaint(); //다시 그리기
				panel.add(new Book()); //대출현황에 대한 화면을 구현할 클래스를 생성
				panel.setLayout(null); //레이아웃 적용 안함.
			}
		});
		
		panel = new JPanel();
		add(panel);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					if(conn!=null) {
						conn.close();
					}
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		setJMenuBar(bar);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa();
	}

}
