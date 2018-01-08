package 포트폴리오만들기_20180108;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScoreManager extends JFrame {
	JPanel panel;
	
	ScoreManager(){
		setTitle("성적관리시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ScoreManager();
	}

}
