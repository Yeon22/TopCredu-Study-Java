package 포트폴리오만들기_20180108_start;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Absence2 extends JPanel implements Runnable{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	JButton searchBtn = new JButton("조회");
	JLabel timeLabel;

	@Override
	public void run() {
		while(true) {
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR)+"년"
					+(cal.get(Calendar.MONTH)+1)+"월"
					+cal.get(Calendar.DATE)+"일";
			timeLabel.setText(now);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void List(String squery) {
		try {
			if(squery.equals("")) {
				query = "select class_id, name, checkme from pofol_score order by class_id";
			} else {
				query = "select class_id, name, checkme from pofol_score "+squery+" order by class_id";
			}
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[3];
				row[0] = rs.getString("class_id");
				row[1] = rs.getString("name");
				row[2] = rs.getString("checkme");
				
				model.addRow(row);
			}
			
			rs.close();
			
		}catch(SQLException e) {
			e.getStackTrace();
		}
	}
	
	
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
		department.setBounds(28,10,45,25);
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
		
		
		JLabel w_date = new JLabel("오늘 날짜 : ");
		w_date.setBounds(240,8,70,30);
		add(w_date);
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Gothic", Font.BOLD, 16));
		timeLabel.setBounds(305,8,120,30);
		add(timeLabel);
		
		Thread thread = new Thread(this);
		thread.start();
		
		
		
		searchBtn.setBounds(370, 370, 80, 30);
		add(searchBtn);
		searchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_dept.getSelectedIndex();
				String cb_name = cb_dept.getItemAt(index).toString();
				
				if(cb_name.equals("컴퓨터공학과")) {
					String squery = "where department_id = "
							+"(select department_id from pofol_department where department_id = 'C001')";
					List(squery);
				} else if(cb_name.equals("멀티미디어과")) {
					String squery = "where department_id = "
							+"(select department_id from pofol_department where department_id = 'M002')";
					List(squery);
				} else if(cb_name.equals("세무회계과")) {
					String squery = "where department_id = "
							+"(select department_id from pofol_department where department_id = 'T003')";
					List(squery);
				} else if(cb_name.equals("독어독문과")) {
					String squery = "where department_id = "
							+"(select department_id from pofol_department where department_id = 'G004')";
					List(squery);
				} else {
					List("");
				}
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
