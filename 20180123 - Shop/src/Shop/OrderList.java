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

public class OrderList extends JPanel{
	Connection conn = null;
	Statement stmt = null;
	
	DefaultTableModel model;
	JTable table;
	String [] gender = {"남자", "여자"};
	
	String query;
	
	public void list(String squery) {
		try {
			System.out.println("연결되었습니다.....");
			
			query = "select m.name as name, nvl(s.goodName,' ') as goodName, od.qty as qty, od.price as price " + 
					"from member m join orders o " + 
					"on m.id = o.id " + 
					"join ordersDetail od " + 
					"on o.no = od.orderNo " + 
					"join goods " + 
					"on od.goodsno = s.goodsno";
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[4];
				row[0] = rs.getString("name");
				row[1] = rs.getString("goodName");
				row[2] = rs.getString("qty");
				row[3] = rs.getString("price");
				model.addRow(row);
			}
			
			rs.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	OrderList(){
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
		
		
		String colName[] = {"회원", "상품", "주문수량", "가격"};
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
