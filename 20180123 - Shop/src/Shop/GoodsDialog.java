package Shop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GoodsDialog extends JDialog{
	Connection conn = null;
	Statement stmt = null;
	
	JLabel noLbl = new JLabel("번호");
	JTextField noTxt = new JTextField(10);
	JLabel nameLbl = new JLabel("이름");
	JTextField nameTxt = new JTextField(10);
	JLabel priceLbl = new JLabel("가격");
	JTextField priceTxt = new JTextField(10);
	
	JButton SignBtn = new JButton("등록");
	
	
	public GoodsDialog(JFrame frame, String title){
		super(frame, title, true);
		
		setLayout(null);
		
		ResultSet rs = null;
		String url = null;
		String uid = "h5";
		String pw = "h5";
		
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,uid,pw);
			stmt = conn.createStatement();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		noLbl.setBounds(30,30,80,20);
		noTxt.setBounds(75,30,130,20);
		nameLbl.setBounds(30,30+40,80,20);
		nameTxt.setBounds(75,30+40,130,20);
		priceLbl.setBounds(30,30+40+40,100,20);
		priceTxt.setBounds(75,30+40+40,130,20);
		
		SignBtn.setBounds(100, 300, 85, 32);
		
		add(noLbl);
		add(noTxt);
		add(nameLbl);
		add(nameTxt);
		add(priceLbl);
		add(priceTxt);
		
		add(SignBtn);
		
		SignBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(noTxt.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "번호를 입력하세요.");
					noTxt.requestFocus();
				} else if(nameTxt.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "이름을 입력하세요.");
					nameTxt.requestFocus();
				} else if(priceTxt.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "가격을 입력하세요.");
					priceTxt.requestFocus();
				} else {
					//인서트 작업
					try {
						String sql = "insert into goods values(to_number('"
								+noTxt.getText()+"', '999'), '"
								+nameTxt.getText()+"', to_number('"
								+priceTxt.getText()+"', '999999'))";
						stmt.executeUpdate(sql);
						System.out.println("등록되었습니다.");
						JOptionPane.showMessageDialog(null, "등록되었습니다.");
						
					} catch(Exception a) {
						a.printStackTrace();
					}
				}
			}
		});
		
		setSize(300, 400);
		
	}

}
