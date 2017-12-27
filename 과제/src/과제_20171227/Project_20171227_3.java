package 과제_20171227;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Project_20171227_3 extends JFrame {
	public Project_20171227_3() {
//	3.GridLayout을 사용하여 다음 그림과 같이 한줄에 10개의 
//		버튼을 동일한 크기로 배치하는 스윙 프로그램을 작성하여라.
		
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1, 10));
		
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("10"));
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171227_3();
	}

}
