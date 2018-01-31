package 포트폴리오만들기_20180108_start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Student extends JPanel {
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	JTextField id;
	JTextField name;
	JButton selectBtn;
	JButton insertBtn;
	JButton updateBtn;
	JButton deleteBtn;
	JButton searchBtn;
	JButton deptListBtn;
	
	String [] score = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E", "F"};
	String [] dept_name = {"C001", "M002", "T003", "G004"};

	JComboBox attitudeCombo = new JComboBox(score);
	JComboBox checkCombo = new JComboBox(score);
	JComboBox examCombo = new JComboBox(score);
	JComboBox workCombo = new JComboBox(score);
	JComboBox deptCombo = new JComboBox(dept_name);
	
	DefaultTableModel model;
	JTable table;
	
	public void AllList(String squery) {
		try {
			System.out.println("연결되었습니다.....");
			
			if(squery.equals("")) {
				query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work "
						+"from pofol_score order by class_id";
			} else {
				query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work "
						+"from pofol_score"+ squery + " order by class_id";
			}
			
			ResultSet rs = stmt.executeQuery(query);
			
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[7];
				row[0] = rs.getString("class_id");
				row[1] = rs.getString("department_id");
				row[2] = rs.getString("name");
				row[3] = rs.getString("score_attitude");
				row[4] = rs.getString("score_check");
				row[5] = rs.getString("score_exam");
				row[6] = rs.getString("score_work");
				model.addRow(row);
			}
			
			rs.close();
			
		} catch(SQLException e) {
			e.getStackTrace();
		}
	}

	Student(){
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
		
		JLabel h_id = new JLabel("학번 : ");
		h_id.setBounds(20,10,50,25);
		add(h_id);
		
		id = new JTextField(25);
		id.setBounds(60,10,150,25);
		add(id);
		
		JButton classBtn = new JButton("학번 중복 체크");
		classBtn.setBounds(230,10,120,25);
		add(classBtn); 
		classBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학번을 입력해주세요.");
					id.requestFocus();
				} else {
					try {
						query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work" + 
								" from pofol_score where class_id = '"+id.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "이미 사용중인 학번입니다.");
							id.setText("");
							id.requestFocus();
						} else {
							JOptionPane.showMessageDialog(null, "사용 가능한 학번입니다.");
						}
						
						rs.close();
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		JLabel h_dept = new JLabel("학과 : ");
		h_dept.setBounds(20,45,50,25);
		add(h_dept);
		
		deptCombo.setBounds(60,45,90,25);
		add(deptCombo);
		
		JLabel deptAlim = new JLabel("학과ID별 학과명은 학과 리스트 메뉴를 참고해 주세요.");
		deptAlim.setBounds(170,45,400,30);
		add(deptAlim);
		
		JLabel h_name = new JLabel("이름 : ");
		h_name.setBounds(20,80,50,25);
		add(h_name);
		
		name = new JTextField(25);
		name.setBounds(60,80,150,25);
		add(name);
		
		JLabel h_attitude = new JLabel("태도 점수 : ");
		h_attitude.setBounds(10,115,80,25);
		add(h_attitude);
		
		attitudeCombo.setBounds(80,115,50,25);
		add(attitudeCombo);
		
		JLabel h_check = new JLabel("출결 점수 : ");
		h_check.setBounds(150,115,80,25);
		add(h_check);
		
		checkCombo.setBounds(220,115,50,25);
		add(checkCombo);
		
		JLabel h_exam = new JLabel("시험 점수 : ");
		h_exam.setBounds(10,150,80,25);
		add(h_exam);
		
		examCombo.setBounds(80,150,50,25);
		add(examCombo);
		
		JLabel h_work = new JLabel("과제 점수 : ");
		h_work.setBounds(150,150,80,25);
		add(h_work);
		
		workCombo.setBounds(220,150,50,25);
		add(workCombo);
		
		String colName[] = {"학번", "학과", "이름", "태도", "출결", "시험","과제"};
		
		model = new DefaultTableModel(colName,0);
		
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300, 200));
		JScrollPane h_jp = new JScrollPane(table);
		h_jp.setBounds(20,200,350,200);
		add(h_jp);
		
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				table = (JTable)e.getComponent();
				model = (DefaultTableModel)table.getModel();
				
				String sid = (String)model.getValueAt(table.getSelectedRow(), 0);
				id.setText(sid);
				String sname = (String)model.getValueAt(table.getSelectedRow(), 2);
				name.setText(sname);
			}
		});
		
		selectBtn = new JButton("조회");
		selectBtn.setBounds(395,208,70,25);
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work" + 
							" from pofol_score where class_id = '"+id.getText()+"'";
					
					ResultSet rs;
					rs = stmt.executeQuery(query);
					
					model.setNumRows(0);
					
					if(rs.next()) {
						String[] row = new String[7];
						row[0] = rs.getString("class_id");
						row[1] = rs.getString("department_id");
						row[2] = rs.getString("name");
						row[3] = rs.getString("score_attitude");
						row[4] = rs.getString("score_check");
						row[5] = rs.getString("score_exam");
						row[6] = rs.getString("score_work");
						model.addRow(row);
					} else {
						AllList("");
					}
					
					rs.close();
					
				} catch(Exception b) {
					b.getStackTrace();
				}
			}
		});
		
		insertBtn = new JButton("입력");
		insertBtn.setBounds(395,258,70,25);
		add(insertBtn);
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학번을 입력하세요.");
					id.requestFocus();
				} else if(name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요.");
					name.requestFocus();
				} else {
					try {
						query = "select class_id, department_id, name, score_attitude, score_check, score_exam, score_work" + 
								" from pofol_score where class_id = '"+id.getText()+"'";
						
						ResultSet rs;
						rs = stmt.executeQuery(query);
						
						if(!rs.next()) {
							String sql = "insert into pofol_score values('"
									+id.getText()+"', '"
									+deptCombo.getSelectedItem()+"', '"
									+name.getText()+"', '"
									+attitudeCombo.getSelectedItem()+"', '"
									+checkCombo.getSelectedItem()+"', '"
									+examCombo.getSelectedItem()+"', '"
									+workCombo.getSelectedItem()+"')";
							stmt.executeUpdate(sql);
							
							AllList("");
							
						} else {
							JOptionPane.showMessageDialog(null, "이미 존재하는 학번입니다.");
							id.setText("");
							id.requestFocus();
							name.setText("");
						}
						
						rs.close();
						
					} catch(Exception b) {
						b.getStackTrace();
					}
				}
			}
		});
		
		updateBtn = new JButton("수정");
		updateBtn.setBounds(395,308,70,25);
		add(updateBtn);
		updateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "수정하시겠습니까?", "수정", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					try {
						stmt.executeUpdate("update pofol_score set CLASS_ID = '"
								+id.getText()+"', DEPARTMENT_ID = '"
								+deptCombo.getSelectedItem()+"', NAME = '"
								+name.getText()+"', SCORE_ATTITUDE = '"
								+attitudeCombo.getSelectedItem()+"', SCORE_CHECK = '"
								+checkCombo.getSelectedItem()+"', SCORE_EXAM = '"
								+examCombo.getSelectedItem()+"', SCORE_WORK = '"
								+workCombo.getSelectedItem()+"' where CLASS_ID = '"
								+id.getText()+"'");
						JOptionPane.showMessageDialog(null, "수정되었습니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
						AllList("");
						
					} catch(Exception a1) {
						a1.getStackTrace();
					}
				}
			}
		});
		
		deleteBtn = new JButton("삭제");
		deleteBtn.setBounds(395,358,70,25);
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					try {
						stmt.executeUpdate("delete from pofol_score where class_id = '"+id.getText()+"'");
						JOptionPane.showMessageDialog(null, "삭제되었습니다.");
						AllList("");
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		setSize(480, 480);
		setVisible(true);
	}

}
