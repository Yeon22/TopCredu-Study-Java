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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score extends JPanel {
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	Score(){
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
		
		setLayout(null);
		
		JLabel S_dept = new JLabel("학과");
		S_dept.setBounds(10,10,30,30);
		add(S_dept);
		
		String dept[] = {"전체", "컴퓨터공학과", "멀티미디어과", "세무회계과", "독어독문과"};
		JComboBox Cb_dept = new JComboBox(dept);
		Cb_dept.setBounds(45, 10, 120, 20);
		add(Cb_dept);
		
		String [] colName =  {"학번", "이름", "태도점수", "출결점수", "시험점수", "과제점수"};
		
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(470, 200));
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(10, 40, 460, 250);
		add(scrollpane);
		
		JButton selectBtn = new JButton("조회");
		selectBtn.setBounds(10, 300, 70, 20);
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = Cb_dept.getSelectedIndex();
				String Cb_name = Cb_dept.getItemAt(index).toString();
				
				if(Cb_name.equals("컴퓨터공학과")) {
					
				} else if(Cb_name.equals("멀티미디어과")) {
					
				} else if(Cb_name.equals("세무회계과")) {
					
				} else if(Cb_name.equals("독어독문과")) {
					
				} else if(Cb_name.equals("전체")){
					try {
						System.out.println("연결되었습니다.......");
						
						query = "select class_id, name, score_attitude, score_check, score_exam, score_work "
								+ "from pofol_score";
						
						ResultSet rs = stmt.executeQuery(query);
						
						model.setNumRows(0);
						
						while(rs.next()) {
							String[] row = new String[6];
							row[0] = rs.getString("class_id");
							row[1] = rs.getString("name");							
							row[2] = rs.getString("score_attitude");						
							row[3] = rs.getString("score_check");							
							row[4] = rs.getString("score_exam");							
							row[5] = rs.getString("score_work");
							
							model.addRow(row);
						}
						
						rs.close();
					} catch(SQLException a) {
						a.getStackTrace();
					}
				}
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
