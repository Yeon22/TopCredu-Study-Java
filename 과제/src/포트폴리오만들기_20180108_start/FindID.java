package 포트폴리오만들기_20180108_start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FindID extends JDialog{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	FindPW pwDialog = new FindPW();
	
	JLabel name;
	JLabel birth;
	JLabel email;
	JTextField t_name = new JTextField(15);
	JTextField t_birth = new JTextField(15);
	JTextField t_email = new JTextField(15);
	
	JButton idFindcheck = new JButton("아이디 찾기");
	
	FindID(){
		//DB연결
		String url = null;
		String uid = "h5";
		String upw = "h5";
		
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,uid,upw);
			stmt = conn.createStatement();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		setTitle("아이디 찾기 화면");
		setLayout(null);
		
		name = new JLabel("이름 : ");
		name.setBounds(50,10,50,25);
		add(name);
		t_name.setBounds(93,10,130,25);
		add(t_name);
		
		birth = new JLabel("생일 : ");
		birth.setBounds(50,45,50,25);
		add(birth);
		t_birth.setBounds(93,45,130,25);
		add(t_birth);
		
		JLabel birthAlim = new JLabel("생일 작성 예시 : 19yy/mm/dd (예시 참고!)");
		birthAlim.setBounds(15,70,250,25);
		add(birthAlim);
		
		email = new JLabel("email 주소 : ");
		email.setBounds(15,110,70,25);
		add(email);
		t_email.setBounds(93,110,130,25);
		add(t_email);
		
		idFindcheck.setBounds(55, 150, 150, 30);
		add(idFindcheck);
		idFindcheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요.");
					t_name.requestFocus();
				} else if(t_birth.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "생일을 입력해주세요.");
					t_birth.requestFocus();
				} else if(t_email.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이메일 주소를 입력해주세요.");
				} else {
					//모든 항목을 입력했을 때
					try {
						query = "select login_id from pofol_professor " + 
								"where pro_name = '"
								+t_name.getText()+"' and birth = '"
								+t_birth.getText()+"' and email = '"
								+t_email.getText()+"'";
						
						ResultSet rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							if(JOptionPane.showConfirmDialog(null, "찾으시는 ID는 "+rs.getString(1)+" 입니다. \n비밀번호 찾기로 이동하시겠습니까?", "알림", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
								pwDialog.setVisible(true);
								setVisible(false);
							} else {
								setVisible(false);
							}
						} else {
							JOptionPane.showMessageDialog(null, "가입하신 회원이 아니거나 입력하신 값이 틀렸습니다.");
						}
						
						rs.close();
						
					} catch(Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		setSize(280, 250);
		setResizable(false);
	}

}
