package 과제_20171227;

import javax.swing.JFrame;

public class Project_20171227_1 extends JFrame {
	public Project_20171227_1() {
//	1. 다음 그림과 같이 "Hello Embedded"라는 문자열을 
//	타이틀로 가지고 프레임의 크기가 400x200인 스윙프로그램을 작성하라.
		
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171227_1();
	}

}
