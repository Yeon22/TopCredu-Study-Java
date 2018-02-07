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

public class FindPW extends JDialog{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	FindID findIDdialog;
	
	JLabel id;
	JLabel name;
	JLabel phone;
	JTextField t_id = new JTextField(15);
	JTextField t_name = new JTextField(15);
	JTextField t_phone = new JTextField(15);
	
	JButton pwFindcheck = new JButton("비밀번호 찾기");
	
	FindPW(){
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
		
		setTitle("비밀번호 찾기 화면");
		setLayout(null);
		
		id = new JLabel ("아이디 : ");
		id.setBounds(40,10,50,25);
		add(id);
		t_id.setBounds(93,10,130,25);
		add(t_id);
		
		name = new JLabel("이름 : ");
		name.setBounds(52,45,50,25);
		add(name);
		t_name.setBounds(93,45,130,25);
		add(t_name);
		
		phone = new JLabel("전화번호 : ");
		phone.setBounds(26,80,80,25);
		add(phone);
		t_phone.setBounds(93,80,130,25);
		add(t_phone);
		JLabel phoneAlim = new JLabel("전화번호 예시 : 01012345678 / 숫자만 작성!");
		phoneAlim.setBounds(10,108,250,25);
		add(phoneAlim);
		
		pwFindcheck.setBounds(65, 145, 130, 30);
		add(pwFindcheck);
		pwFindcheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
					t_id.requestFocus();
				} else if(t_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요.");
					t_name.requestFocus();
				} else if(t_phone.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.");
					t_phone.requestFocus();
				} else {
					//모든 항목을 입력했을 때
					try {
						query = "select pw from pofol_professor "+
								"where LOGIN_ID = '"
								+t_id.getText()+"' and pro_name = '"
								+t_name.getText()+"' and PHONE_NUMBER = '"
								+t_phone.getText()+"'";
						
						ResultSet rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "찾으시는 비밀번호는 "+rs.getString(1)+" 입니다.");
							setVisible(false);
						} else {
							if(JOptionPane.showConfirmDialog(null, "입력하신 내용을 찾을 수 없습니다. \nID찾기 화면으로 가시겠습니까?","알림",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
								findIDdialog = new FindID();
								findIDdialog.setVisible(true);
								setVisible(false);
							}
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
