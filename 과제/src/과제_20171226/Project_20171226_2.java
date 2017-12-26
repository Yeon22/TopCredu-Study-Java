package 과제_20171226;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Project_20171226_2 extends JFrame {
//	2. 회원가입 화면을 구현하시오.
	
	public Project_20171226_2() {
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		JLabel title = new JLabel("정확한 정보를 입력해주세요.");
		title.setLocation(1, 1);
		title.setSize(200,20);
		add(title);
		
		JLabel ID = new JLabel("아이디");
		ID.setLocation(75,30);
		ID.setSize(100,20);
		add(ID);
		JTextField ID2 = new JTextField("");
		ID2.setLocation(205, 30);
		ID2.setSize(100, 20);
		add(ID2);
		
		JLabel pw = new JLabel("비밀번호");
		pw.setLocation(75,60);
		pw.setSize(100,20);
		add(pw);
		JTextField pw2 = new JTextField("");
		pw2.setLocation(205,60);
		pw2.setSize(100, 20);
		add(pw2);
		
		JLabel pwcheck = new JLabel("비밀번호 확인");
		pwcheck.setLocation(75,90);
		pwcheck.setSize(100,20);
		add(pwcheck);
		JTextField pwcheck2 = new JTextField("");
		pwcheck2.setLocation(205,90);
		pwcheck2.setSize(100, 20);
		add(pwcheck2);
		
		JLabel name = new JLabel("이름");
		name.setLocation(75,120);
		name.setSize(100,20);
		add(name);
		JTextField name2 = new JTextField("");
		name2.setLocation(205,120);
		name2.setSize(100, 20);
		add(name2);
		
		JLabel email = new JLabel("E-Mail");
		email.setLocation(75,150);
		email.setSize(100,20);
		add(email);
		JTextField email2 = new JTextField("");
		email2.setLocation(205,150);
		email2.setSize(200, 20);
		add(email2);
		
		JLabel phone = new JLabel("핸드폰");
		phone.setLocation(75,180);
		phone.setSize(100,20);
		add(phone);
		JTextField phone2 = new JTextField("");
		phone2.setLocation(205,180);
		phone2.setSize(50, 20);
		add(phone2);
		JLabel phone3 = new JLabel("-");
		phone3.setLocation(265,185);
		phone3.setSize(10,10);
		add(phone3);
		JTextField phone4 = new JTextField("");
		phone4.setLocation(275,180);
		phone4.setSize(50, 20);
		add(phone4);
		JLabel phone5 = new JLabel("-");
		phone5.setLocation(335,185);
		phone5.setSize(10,10);
		add(phone5);
		JTextField phone6 = new JTextField("");
		phone6.setLocation(345,180);
		phone6.setSize(50, 20);
		add(phone6);
		
		JLabel address = new JLabel("주소");
		address.setLocation(75,210);
		address.setSize(100,20);
		add(address);
		JTextField address2 = new JTextField("");
		address2.setLocation(205,210);
		address2.setSize(200, 20);
		add(address2);
		JTextField address3 = new JTextField("");
		address3.setLocation(205,240);
		address3.setSize(200, 20);
		add(address3);
		
		JButton btn = new JButton("가입하기");
		btn.setLocation(120, 300);
		btn.setSize(88, 28);
		add(btn);
		JButton btn2 = new JButton("가입취소");
		btn2.setLocation(220, 300);
		btn2.setSize(88, 28);
		add(btn2);
		
		setSize(500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171226_2();

	}

}
