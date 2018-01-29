package 포트폴리오만들기_20180108_start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawal extends JDialog{
	Connection conn;
	Statement stmt = null;
	String query;
	
	JLabel id;
	JLabel pw;
	JLabel name;
	JButton outBtn;
	
	JTextField t_id = new JTextField(14);
	JTextField t_pw = new JTextField(14);
	JTextField t_name = new JTextField(14);
	
	Withdrawal(){
		ResultSet rs = null;
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
		
		setTitle("회원탈퇴화면");
		setLayout(null);
		
		id = new JLabel("아이디 : ");
		id.setBounds(24,10,70,25);
		add(id);
		t_id.setBounds(80,10,120,25);
		add(t_id);
		
		pw = new JLabel("비밀번호 : ");
		pw.setBounds(10,45,80,25);
		add(pw);
		t_pw.setBounds(80,45,120,25);
		add(t_pw);
		
		name = new JLabel("이름 : ");
		name.setBounds(35,80,70,25);
		add(name);
		t_name.setBounds(80,80,120,25);
		add(t_name);
		
		outBtn = new JButton("회원 탈퇴하기");
		outBtn.setBounds(50,118,120,35);
		add(outBtn);
		outBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디는 필수 입력사항입니다.");
				} else if(t_pw.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호는 필수 입력사항입니다.");
				} else if(t_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "교수이름은 필수 입력사항입니다.");
				} else {
					// 모든 입력사항을 작성 한 후
					try {
						query = "select login_id, pw, pro_name, address, email, TO_DATE(birth, 'RRRR-MM-DD') as birth, phone_number, gender" + 
								" from pofol_professor "
								+ "where login_id = '"+t_id.getText()+"' and pw = '"+t_pw.getText()+"' and pro_name = '"+t_name.getText()+"'";
						
						ResultSet rs;
						
						rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							if(JOptionPane.showConfirmDialog(null, "정말로 탈퇴하시겠습니까?", "회원탈퇴화면", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
								try {
									stmt.executeUpdate("delete from pofol_professor where login_id = '"+t_id.getText()+"'");
									JOptionPane.showMessageDialog(null, "회원 탈퇴되었습니다.");
									
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							}
						} else {
							JOptionPane.showMessageDialog(null, "입력된 값이 존재하지 않습니다. \n다시 한번 확인해 주시기 바랍니다.");
						}
						
						rs.close();
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
		}
	});
		
		setSize(250, 220);
	}

}
