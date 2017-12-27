package 과제_20171227;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Project_20171227_4 extends JFrame{
	public Project_20171227_4() {
//	4.문제3을 수정하여 다음결과와 같이 각 버튼의 배경색을 서로 다르게 설정하라.
		
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1, 10));
		
		add(new JButton("1")).setBackground(Color.WHITE);;
		add(new JButton("2")).setBackground(Color.RED);;
		add(new JButton("3")).setBackground(Color.ORANGE);;
		add(new JButton("4")).setBackground(Color.YELLOW);;
		add(new JButton("5")).setBackground(Color.GREEN);;
		add(new JButton("6")).setBackground(Color.BLUE);;
		add(new JButton("7")).setBackground(Color.magenta);;
		add(new JButton("8")).setBackground(Color.PINK);;
		add(new JButton("9")).setBackground(Color.LIGHT_GRAY);;
		add(new JButton("10")).setBackground(Color.BLACK);;
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171227_4();
	}

}
