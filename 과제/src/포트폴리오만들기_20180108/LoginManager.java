package 포트폴리오만들기_20180108;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	MyDialog(JFrame frame, String title){
		super(frame, title, true);
		JTextField d_id = new JTextField(12);
		JTextField d_pw = new JTextField(12);
		JTextField pw_check = new JTextField(12);
		JTextField name = new JTextField(12);
		JTextField address = new JTextField(12);
		JButton okBtn;
		JButton cancelBtn;
		
		setTitle("회원가입");
		setLayout(new FlowLayout());
		
		add(new JLabel("  아이디    : "));
		add(d_id);
		add(new JLabel("비밀번호 : "));
		add(d_pw);
		add(new JLabel("비번확인 : "));
		add(pw_check);
		add(new JLabel("   이름      : "));
		add(name);
		add(new JLabel("   주소      : "));
		add(address);
		
		okBtn = new JButton("회원가입하기");
		add(okBtn);
		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(d_id.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "아이디는 필수 입력사항입니다.");
				} else if(d_pw.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "비밀번호는 필수 입력사항입니다.");
				} else if(name.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "이름은 필수 입력사항입니다.");
				} else if(address.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "주소는 필수 입력사항입니다.");
				} else {
					// 모든 입력사항을 작성 한 후
					if(pw_check.getText().equals(d_pw.getText())) {
						JOptionPane.showConfirmDialog(null, "회원가입이 정상적으로 완료되었습니다.");
						setVisible(false);
					} else {
						JOptionPane.showConfirmDialog(null, "비밀번호가 같지 않습니다.");
					}
				}
			}
		});
		
		cancelBtn = new JButton("취소");
		add(cancelBtn);
		cancelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		setSize(230, 230);
	}
}

public class LoginManager extends JFrame {
	JTextField id_text;
	JTextField pw_text;
	JButton login;
	JButton member;
	
	MyDialog dialog = new MyDialog(this, "회원가입화면");
	
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
		
		login = new JButton("로그인");
		add(login);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id_text.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "아이디를 입력해주세요.");
				} else if(pw_text.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "비밀번호를 입력해주세요.");
				} else {
					// 아이디, 비밀번호 입력했을 때
					if(!id_text.getText().equals("kkk")) {
						JOptionPane.showConfirmDialog(null, "아이디가 잘못되었습니다.");
					} else if(!pw_text.getText().equals("123456")){
						JOptionPane.showConfirmDialog(null, "비밀번호가 잘못되었습니다.");
					} else {
						// 로그인에 성공한 후 화면
						JOptionPane.showConfirmDialog(null, "로그인에 성공하였습니다.");
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
		
		setSize(260,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginManager();
	}

}
