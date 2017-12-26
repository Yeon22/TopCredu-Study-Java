package 과제_20171226;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Project_20171226_1 extends JFrame {
//	1. ID와 password를 입력하는 화면을 구현하시오.

	Project_20171226_1(){
		setTitle("화면 구현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		JLabel la = new JLabel("ID");
		la.setLocation(30,20);
		la.setSize(70, 50);
		add(la);
		JTextField te = new JTextField("");
		te.setLocation(170, 20);
		te.setSize(300, 40);
		add(te);
		
		JLabel la2 = new JLabel("Password");
		la2.setLocation(30,70);
		la2.setSize(70, 50);
		add(la2);
		JTextField te2 = new JTextField("");
		te2.setLocation(170, 70);
		te2.setSize(300, 40);
		add(te2);
		
		setSize(500, 170);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171226_1();

	}

}
