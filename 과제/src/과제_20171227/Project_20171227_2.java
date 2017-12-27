package 과제_20171227;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Project_20171227_2 extends JFrame {
	public Project_20171227_2() {
//	2. BoaderLayout을 사용하여 컴포넌트 사이의 수평간격이 5픽셀, 
//	수직간격이 7픽셀이 되도록 다음 그림과 같은 스윙 응용프로그램을 작성하라
		
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(5,7));
		
		add(new JButton("NORTH"),BorderLayout.NORTH);
		add(new JButton("SOUTH"),BorderLayout.SOUTH);
		add(new JButton("EAST"),BorderLayout.EAST);
		add(new JButton("WEST"),BorderLayout.WEST);
		add(new JButton("CENTER"),BorderLayout.CENTER);
		
		setSize(400, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Project_20171227_2();
	}

}
