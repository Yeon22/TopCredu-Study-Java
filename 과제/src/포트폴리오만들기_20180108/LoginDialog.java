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

public class LoginDialog  extends JDialog{
	LoginDialog(JFrame frame, String title){
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
