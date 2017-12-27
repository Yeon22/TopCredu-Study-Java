package 과제_20171226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Project_20171226_3 extends JFrame{
//	3. ID와 PASSWORD를 입력하고
//	   로그인하기 버튼을 입력하면 미리 저장된 ID와 PASSWORD가 맞았을때
//	   로그인 성공을 콘솔에 출력
//	   틀리면 로그인 실패를 콘솔에 출력
	
	public Project_20171226_3() {
		setTitle("화면 구현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		JLabel la = new JLabel("ID");
		la.setLocation(30,20);
		la.setSize(70, 50);
		add(la);
		JTextField te = new JTextField("");
		te.setLocation(170, 20);
		te.setSize(200, 40);
		add(te);
		
		JLabel la2 = new JLabel("Password");
		la2.setLocation(30,70);
		la2.setSize(70, 50);
		add(la2);
		JTextField te2 = new JTextField("");
		te2.setLocation(170, 70);
		te2.setSize(200, 40);
		add(te2);
		
		JButton btn = new JButton("로그인하기");
		btn.setLocation(155, 155);
		btn.setSize(120, 28);
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id_ck = te.getText();
				String pw_ck = te2.getText();
				if (id_ck.equals("AAA") && pw_ck.equals("111111"))
					System.out.println("로그인 성공");
			    else
			    	System.out.println("로그인 실패");
			}
		});

		setSize(450, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171226_3();

	}

}
