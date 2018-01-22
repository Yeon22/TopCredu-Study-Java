package 과제_20180122;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Book extends JPanel {
	Connection conn;
	Statement stmt;
	
	DefaultTableModel model; //모델 데이터
	JTable table; //테이블
	
	String query;
	
	Book(){
		query = "select student.id, student.name, bookrent.title, bookrent.rdate "
				+ "from student join bookrent "
				+ "on student.id = bookrent.id";
		
		ResultSet rs = null;
		String url = null;
		
		String id = "h5";
		String pw = "h5";
		
		url = "jdbc:oracle:thin:@192.168.0.27:1521:topcredu";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			stmt = conn.createStatement();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		setLayout(null);
		
		JLabel l_dept = new JLabel("학과");
		l_dept.setBounds(10, 10, 30, 30);
		add(l_dept);
		
		
		String[] dept = {"전체", "컴퓨터시스템", "멀티미디어", "컴퓨터공학"};
		JComboBox cb_dept = new JComboBox(dept);
		cb_dept.setBounds(45, 10, 107, 20);
		add(cb_dept);
		
		
		cb_dept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				System.out.println(cb.getSelectedIndex());
				int deptIndex = cb.getSelectedIndex();
				
				query = "select student.id, student.name, bookrent.title, bookrent.rdate "
						+ "from student join bookrent "
						+ "on student.id = bookrent.id";
				
				if(deptIndex == 0) { //전체
					query += " order by student.name";
					List();
				} else if(deptIndex == 1) { //컴퓨터시스템
					query += " where student.department_id = 'A002'";
					query += " order by student.name";
					List();
				} else if(deptIndex == 2) {
					query += " where student.department_id = 'R0013'";
					query += " order by student.name";
					List();
				} else if(deptIndex == 3) {
					query += " where student.department_id = 'R0012'";
					query += " order by student.name";
					List();
				}
			}
		});
		
		
		String colName[] = {"학번", "이름", "도서명", "대출일"};
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(470, 200));
		add(table);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(10, 40, 460, 250);
		add(sp);
		
		JButton ListButton = new JButton("조회");
		ListButton.setBounds(10, 300, 70, 20);
		add(ListButton);
		ListButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				query = "select student.id, student.name, bookrent.title, bookrent.rdate "
						+ "from student join bookrent "
						+ "on student.id = bookrent.id";
				List();
			}
		});
		
		setSize(490, 400);
		setVisible(true);
		List();
	}

	public void List() {
		try {
			ResultSet rs = stmt.executeQuery(query);
			
			//JTable 초기화
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[4];
				row[0] = rs.getString("id");
				row[1] = rs.getString("name");
				row[2] = rs.getString("title");
				row[3] = rs.getString("rdate");
				model.addRow(row);
			}
			rs.close();
			
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	};

}
