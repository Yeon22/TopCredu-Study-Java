package 포트폴리오만들기_20180108_start;

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

public class ScoreManager extends JFrame {
	Connection conn;
	JPanel panel = new JPanel();
	
	ScoreManager(){
		setTitle("학생성적관리시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu student = new JMenu("학생성적관리    ");
		menubar.add(student);
		JMenu score = new JMenu("성적관리    ");
		menubar.add(score);
		JMenu department = new JMenu("학과 리스트   ");
		menubar.add(department);
		
		JMenuItem student_info = new JMenuItem("학생성적등록");
		student.add(student_info);
		JMenuItem score_info = new JMenuItem("성적현황");
		score.add(score_info);
		JMenuItem dept_info = new JMenuItem("학과ID별 학과명");
		department.add(dept_info);
		
		student_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				panel.repaint();
				panel.add(new Student());
				panel.setLayout(null);
			}
		});
		
		score_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				panel.repaint();
				panel.add(new Score());
				panel.setLayout(null);
			}
		});
		
		dept_info.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				panel.repaint();
				panel.add(new DepartmentList());
				panel.setLayout(null);
			}
		});
		
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
		
		add(panel);
		setJMenuBar(menubar);
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScoreManager();
	}

}
