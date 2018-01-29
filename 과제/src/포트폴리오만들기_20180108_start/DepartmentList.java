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
	JButton deleteDept;
	
	public void List() {
		try {
			System.out.println("연결되었습니다.....");
			
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
		
		insertDept = new JButton("학과 ID 및 학과명 추가하기");
		insertDept.setBounds(130,330,200,30);
		add(insertDept);
		insertDept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학과ID를 입력하세요.");
					t_id.requestFocus();
				} else if(t_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학과명을 입력하세요.");
					t_name.requestFocus();
				} else {
					try {
						query = "select department_id, department_name from pofol_department "+
								"where department_id = '"+t_id.getText()+"'"
								+" and department_name = '"+t_name.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						if(!rs.next()) {
							String sql = "insert into pofol_department values('"
									+t_id.getText()+"', '"
									+t_name.getText()+"')";
							stmt.executeUpdate(sql);
							
							List();
							
						} else {
							JOptionPane.showMessageDialog(null, "이미 존재하는 학과입니다.");
							t_id.setText("");
							t_id.requestFocus();
							t_name.setText("");
						}
						
						rs.close();
						
					} catch(Exception b) {
						b.getStackTrace();
					}
				}
			}
		});
		
		deleteDept = new JButton("학과 삭제하기");
		deleteDept.setBounds(150,370,150,30);
		add(deleteDept);
		deleteDept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t_id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학과ID를 입력해주세요.");
					t_id.requestFocus();
				} else {
					if(JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						try {
							stmt.executeUpdate("delete from pofol_department where department_id = '"+t_id.getText()+"'");
							JOptionPane.showMessageDialog(null, "삭제되었습니다.");
							List();
							
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		
		JLabel idAlim = new JLabel ("학과ID는 최대 문자+숫자 조합으로 4자까지만 입력가능합니다.");
		idAlim.setBounds(65,215,450,30);
		add(idAlim);
		
		setSize(450, 400);
		setVisible(true);
	}

}
