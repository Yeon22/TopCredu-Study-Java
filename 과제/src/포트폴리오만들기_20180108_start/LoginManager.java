package 포트폴리오만들기_20180108_start;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginManager extends JFrame {
	JTextField id_text;
	JTextField pw_text;
	JButton login;
	JButton member;
	
	LoginDialog dialog = new LoginDialog(this, "회원가입화면");
	ScoreManager sm;
	
	LoginManager(){
		setTitle("로그인화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel l_id = new JLabel("아이디      : ");
		id_text = new JTextField(10);
		add(l_id);
		add(id_text);
		
		JLabel l_pw = new JLabel("비밀번호  : ");
		pw_text = new JTextField(10);
		add(l_pw);
		add(pw_text);
		
		login = new JButton("관리자로그인");
		add(login);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id_text.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "아이디를 입력해주세요.");
				} else if(pw_text.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "비밀번호를 입력해주세요.");
				} else {
					for(int i =0; i< LoginDialog.dialog_vector.size(); i++) {
						dialog_ex de = LoginDialog.dialog_vector.get(i);
						
						// 아이디, 비밀번호 입력했을 때
						if(!id_text.getText().equals(de.getD_id())) {
							JOptionPane.showConfirmDialog(null, "아이디가 잘못되었습니다.");
						} else if(!pw_text.getText().equals(de.getD_pw())){
							JOptionPane.showConfirmDialog(null, "비밀번호가 잘못되었습니다.");
						} else {
							// 로그인에 성공한 후 화면
							if((JOptionPane.showConfirmDialog(null, "로그인에 성공하였습니다.", "로그인성공", JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION) {
								sm = new ScoreManager();
								setVisible(false);
							} else {
								setVisible(false);
							}
						}
					}
				}
			}
		});
		
		member = new JButton("회원가입");
		add(member);
		member.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		JLabel advice = new JLabel(" * 회원가입을 먼저 해주세요! * ");
		advice.setFont(new Font("HY견고딕", Font.BOLD, 16));
		advice.setForeground(Color.RED);
		add(advice);
		
		setSize(260,160);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginManager();
	}

}
