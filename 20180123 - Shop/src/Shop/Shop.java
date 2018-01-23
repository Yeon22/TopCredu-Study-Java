package Shop;

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

public class Shop extends JFrame {
	Connection conn;
	JPanel panel;
	
	//회원가입 다이얼로그 생성
	MemDialog dialog = new MemDialog(null, "회원가입");
	
	//상품등록 다이얼로그 생성
	
	Shop(){
		setTitle("샵");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu m_member = new JMenu("회원            ");
		bar.add(m_member);
		
		JMenuItem m_MemSign = new JMenuItem("회원가입");
		m_member.add(m_MemSign);
		
		m_MemSign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		//회원목록
		JMenuItem m_MemList = new JMenuItem("회원등록");
		m_member.add(m_MemList);
		
		m_MemList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //모든 컴포넌트 삭제
				panel.revalidate(); //다시 활성화
				panel.repaint(); //다시 그리기
				panel.add(new MemList());
				panel.setLayout(null);
			}
		});
		
		//성별조회
		JMenuItem m_MemSearch = new JMenuItem("성별조회");
		m_member.add(m_MemSearch);
		
		m_MemSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //모든 컴포넌트 삭제
				panel.revalidate(); //다시 활성화
				panel.repaint(); //다시 그리기
//				panel.add(new GenderList());
				panel.setLayout(null);
			}
		});
		
		//종료이벤트
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
		
		JMenu m_Goods = new JMenu("상품            ");
		bar.add(m_Goods);
		
		JMenuItem m_GoodSign = new JMenuItem("상품등록");
		m_Goods.add(m_GoodSign);
		
		m_GoodSign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JMenu m_Orders = new JMenu("주문            ");
		bar.add(m_Orders);
		
		JMenuItem m_OrderList = new JMenuItem("주문목록");
		m_Orders.add(m_OrderList);
		
		m_Orders.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); //모든 컴포넌트 삭제
				panel.revalidate(); //다시 활성화
				panel.repaint(); //다시 그리기
//				panel.add(new OrderList());
				panel.setLayout(null);
			}
		});
		
		panel = new JPanel();
		add(panel);
		
		setJMenuBar(bar);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		new Shop();
	}

}
