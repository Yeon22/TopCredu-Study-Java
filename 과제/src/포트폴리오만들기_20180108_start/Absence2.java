package 포트폴리오만들기_20180108_start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Absence2 extends JPanel{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	JButton searchBtn = new JButton("조회");
	
	Absence2(){
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
		
		JLabel department = new JLabel("학과 : ");
		department.setBounds(20,10,45,25);
		add(department);
		
		String dept[] = {"전체", "컴퓨터공학과", "멀티미디어과","세무회계과","독어독문과"};
		JComboBox cb_dept = new JComboBox(dept);
		cb_dept.setBounds(68,12,120,20);
		add(cb_dept);
		
		String[] colName = {"학번","이름","출석여부"};
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(420, 300));
		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(20,40,430,320);
		add(jsp);
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		
		JLabel w_date = new JLabel("날짜 : ");
		w_date.setBounds(48,370,70,30);
		add(w_date);
		
		
		
		searchBtn.setBounds(370, 370, 80, 30);
		add(searchBtn);
		searchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
