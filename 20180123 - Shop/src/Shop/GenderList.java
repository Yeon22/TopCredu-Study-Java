package Shop;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GenderList extends JPanel{
	Connection conn = null;
	Statement stmt = null;
	
	DefaultTableModel model;
	JTable table;
	String [] gender = {"남자", "여자"};
	
	String query;
	
	public void list(String squery) {
		try {
			System.out.println("연결되었습니다.....");
			
			if(squery.equals("")) {
				query = "select id, name, gender, TO_DATE(joindate, 'RRRR-MM-DD') as joindate" + 
						" from member";
			} else {
				query = "select id, name, gender, TO_DATE(joindate, 'RRRR-MM-DD') as joindate" + 
						" from member" + squery;
			}
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[4];
				row[0] = rs.getString("id");
				row[1] = rs.getString("name");
				row[2] = rs.getString("gender");
				row[3] = rs.getString("joindate");
				model.addRow(row);
			}
			
			rs.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	GenderList(){
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
		
		JComboBox strCombo = new JComboBox(gender);
		
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				System.out.println(index);
				
				if(index == 0) {
					String squery = " where gender = 'm'";
					list(squery);
				} else {
					String squery = " where gender = 'f'";
					list(squery);
				}
			}
		});
		
		add(strCombo);
		
		String colName[] = {"아이디", "이름", "성별", "날짜"};
		model = new DefaultTableModel(colName, 0);
		
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300, 200));
		add(table);
		add(new JScrollPane(table));
		
		setSize(320, 300);
		setVisible(true);
		
		list("");
		
	}

}
