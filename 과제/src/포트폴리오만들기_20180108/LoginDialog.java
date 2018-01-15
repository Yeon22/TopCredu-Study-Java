package 포트폴리오만들기_20180108;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 class dialog_ex {
	String d_id;
	String d_pw;
	String pw_check;
	String name;
	String address;
	String birth;
	String email;
	
	public dialog_ex(String d_id, String d_pw, String pw_check, String name, String address, String email, String birth) {
		super();
		this.d_id = d_id;
		this.d_pw = d_pw;
		this.pw_check = pw_check;
		this.name = name;
		this.address = address;
		this.email = email;
		this.birth = birth;
	}

	public String getD_id() {
		return d_id;
	}
	
	public void setD_id(String d_id) {
		this.d_id = d_id;
	}
	
	public String getD_pw() {
		return d_pw;
	}
	
	public void setD_pw(String d_pw) {
		this.d_pw = d_pw;
	}
	
	public String getPw_check() {
		return pw_check;
	}
	
	public void setPw_check(String pw_check) {
		this.pw_check = pw_check;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
}

public class LoginDialog  extends JDialog{
	
	public static Vector<dialog_ex> dialog_vector = new Vector<dialog_ex>();
	
	LoginDialog(JFrame frame, String title){
		super(frame, title, true);
		JTextField d_id = new JTextField(12);
		JTextField d_pw = new JTextField(12);
		JTextField pw_check = new JTextField(12);
		JTextField name = new JTextField(12);
		JTextField address = new JTextField(12);
		JTextField email = new JTextField(12);
		JTextField birth = new JTextField(12);
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
		add(new JLabel("  email     : "));
		add(email);
		add(new JLabel("  생일      :"));
		add(birth);
		
		
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
				} else if(email.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "이메일은 필수 입력사항입니다.");
				} else if(birth.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "생일은 필수 입력사항입니다.");
				} else {
					// 모든 입력사항을 작성 한 후
					if(pw_check.getText().equals(d_pw.getText())) {
						dialog_ex dex = new dialog_ex(d_id.getText(), d_pw.getText(), pw_check.getText(), name.getText(), address.getText(), email.getText(), birth.getText());
						dialog_vector.add(dex);
						
						JOptionPane.showConfirmDialog(null, "회원가입이 정상적으로 완료되었습니다. \n가입해 주셔서 감사합니다.");
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
		
		setSize(250, 280);
		setResizable(false);
	}
}
