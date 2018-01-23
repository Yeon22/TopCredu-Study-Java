package 스윙;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LayoutTest extends JFrame {
	LayoutTest(){
		setTitle("None Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		// 85*20
		JLabel l = new JLabel("나는");
//		l.setLocation(85,20);
//		l.setSize(50,20);
		l.setBounds(85, 20, 50, 20);
		add(l);
		
		// 85*42
		JButton b = new JButton("None"); //버튼
		b.setLocation(85, 42); //좌표
		b.setSize(100,20); //사이즈
		add(b); //붙이기
		
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new LayoutTest();

	}

}
