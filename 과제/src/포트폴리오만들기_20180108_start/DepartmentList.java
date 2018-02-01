package 포트폴리오만들기_20180108_start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DepartmentList extends JPanel{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	JButton insertDept;
	JButton allSearch;
	
	public void List() {
		try {
			query = "select department_id, department_name from pofol_department";
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[2];
				row[0] = rs.getString("department_id");
				row[1] = rs.getString("department_name");
				model.addRow(row);
			}
			
			rs.close();
			
		} catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	DepartmentList(){
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
		
		setLayout(null);
		
		String [] colName =  {"학과ID", "학과명"};
		
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300, 200));
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(80, 10, 300, 200);
		add(scrollpane);
		
		JLabel id = new JLabel("학과ID : ");
		id.setBounds(120,250,80,25);
		add(id);
		
		JTextField t_id = new JTextField(15);
		t_id.setBounds(170,250,150,25);
		add(t_id);
		
		JLabel name = new JLabel("학과명 : ");
		name.setBounds(120,290,80,25);
		add(name);
		
		JTextField t_name = new JTextField(15);
		t_name.setBounds(170,290,150,25);
		add(t_name);

		JLabel idAlim = new JLabel ("학과ID는 영어 대문자 1개 +숫자 3개의 조합으로 되어있습니다.");
		idAlim.setBounds(65,215,450,30);
		add(idAlim);
		
		insertDept = new JButton("학과 ID로 학과명 검색하기");
		insertDept.setBounds(130,330,200,30);
		add(insertDept);
		insertDept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학과ID를 입력하세요.");
					t_id.requestFocus();
				} else {
					try {
						query = "select department_id, department_name from pofol_department "+
								"where department_id = '"+t_id.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						model.setNumRows(0);
						
						if(rs.next()) {
							String[] row = new String[2];
							row[0] = rs.getString("department_id");
							row[1] = rs.getString("department_name");
							model.addRow(row);
							
						} else {
							JOptionPane.showMessageDialog(null, "존재하지 않는 학과ID입니다.");
						}
						
						rs.close();
						
					} catch(Exception b) {
						b.getStackTrace();
					}
				}
			}
		});
		
		allSearch = new JButton("전체학과명 조회");
		allSearch.setBounds(157,370,150,30);
		add(allSearch);
		allSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					query = "select department_id, department_name from pofol_department";
					
					ResultSet rs = stmt.executeQuery(query);
					
					model.setNumRows(0);
					
					while(rs.next()) {
						String[] row = new String[2];
						row[0] = rs.getString("department_id");
						row[1] = rs.getString("department_name");
						model.addRow(row);
					}
					
					rs.close();
					
				} catch(SQLException a) {
					a.getStackTrace();
				}
			}
		});
		
		setSize(450, 400);
		setVisible(true);
	}

}
