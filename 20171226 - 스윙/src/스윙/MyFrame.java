package 스윙;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		setTitle("프로그램 제목"); //윈도우의 제목
		setSize(800,600); //윈도우 사이즈
		setVisible(true); //윈도우 보여달라
	}

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();

	}

}
