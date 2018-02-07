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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javafx.scene.paint.Color;

public class Absence extends JPanel implements Runnable{
	Connection conn = null;
	Statement stmt = null;
	String query;
	
	DefaultTableModel model;
	JTable table;
	
	String class_id;
	String name;
	String checkme;
	String department_id;
	
	JLabel timerLabel;
	JLabel timerLabel2;
	JButton alreadycheck = new JButton("미체크");
	JButton search = new JButton ("조회");
	JButton check = new JButton("출석");
	JButton uncheck = new JButton("결석");
	JButton sick = new JButton("병가");
	JButton jotai = new JButton("조퇴");
	

	@Override
	public void run() {
		while(true) {
			Calendar calendar = Calendar.getInstance();
			String now = calendar.get(Calendar.YEAR)+"년"
					+(calendar.get(Calendar.MONTH)+1)+"월"
					+calendar.get(Calendar.DATE)+"일";
			
			String now2 = calendar.get(Calendar.HOUR)+"시"
					+calendar.get(Calendar.MINUTE)+"분"
					+calendar.get(Calendar.SECOND)+"초";
			
			timerLabel.setText(now);
			timerLabel2.setText(now2);
			
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
	
	Absence(){
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
		
		JLabel time = new JLabel("날짜 및 시간");
		time.setBounds(360,10,150,25);
		time.setFont(new Font("굴림",Font.BOLD, 14));
		add(time);
		

		timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.BOLD, 16));
		timerLabel.setBounds(350,44,150,25);
		add(timerLabel);
		
		timerLabel2 = new JLabel();
		timerLabel2.setFont(new Font("Gothic", Font.BOLD, 16));
		timerLabel2.setBounds(356,69,150,25);
		add(timerLabel2);
		
		Thread thread = new Thread(this);
		thread.start();
		
		
		JLabel depart = new JLabel("학과 : ");
		depart.setBounds(10,10,35,30);
		add(depart);
		
		String dept[] = {"전체", "컴퓨터공학과", "멀티미디어과", "세무회계과", "독어독문과"};
		JComboBox cb_depart = new JComboBox(dept);
		cb_depart.setBounds(48,12,120,20);
		add(cb_depart);
		
		String [] colName = {"학번", "이름","출석체크"};
		
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(300, 350));
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(10,40,300,350);
		add(scroll);
		
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
				table = (JTable)e.getComponent();
				model = (DefaultTableModel)table.getModel();
				
				String sid = (String)model.getValueAt(table.getSelectedRow(), 0);
				class_id = sid;
				String sname = (String)model.getValueAt(table.getSelectedRow(), 1);
				name = sname;
				String scheckme = (String)model.getValueAt(table.getSelectedRow(), 2);
				checkme = scheckme;
				
			}
		});
		
		//미체크 버튼
		alreadycheck.setBounds(195, 10, 80,25);
		add(alreadycheck);
		alreadycheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "미체크 처리할 학생을 선택하신 후 \n버튼을 눌러주시기 바랍니다.","경고",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '미체크' " + 
								"where class_id = '"+class_id+"'");
						
						JOptionPane.showMessageDialog(null, "미체크처리되었습니다.","알림",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("전체")) {
							List("");
						} else if(cb_name.equals("컴퓨터공학과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("멀티미디어과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("세무회계과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("독어독문과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		//조회
		search.setBounds(350, 110, 100, 35);
		add(search);
		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(cb_name.equals("전체")) {
					List("");
				} else if(cb_name.equals("컴퓨터공학과")) {
					String squery = "where department_id = "
							+ "(select department_id from pofol_department where department_id = 'C001')";
					List(squery);
					
				} else if(cb_name.equals("멀티미디어과")) {
					String squery = "where department_id = "
							+ "(select department_id from pofol_department where department_id = 'M002')";
					List(squery);
					
				} else if(cb_name.equals("세무회계과")) {
					String squery = " where department_id = "
							+ "(select department_id from pofol_department where department_id = 'T003')";
					List(squery);
					
				} else if(cb_name.equals("독어독문과")) {
					String squery = " where department_id = "
							+ "(select department_id from pofol_department where department_id = 'G004')";
					List(squery);
				}
				
			}
			
		});
		
		
		//출석
		check.setBounds(350, 170, 100, 35);
		add(check);
		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "출석 처리할 학생을 선택하신 후 \n버튼을 눌러주시기 바랍니다.","경고",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '출석' " + 
								"where class_id = '"+class_id+"'");
						
						JOptionPane.showMessageDialog(null, "출석처리되었습니다.","알림",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("전체")) {
							List("");
						} else if(cb_name.equals("컴퓨터공학과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("멀티미디어과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("세무회계과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("독어독문과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		
		//결석
		uncheck.setBounds(350, 230, 100, 35);
		add(uncheck);
		uncheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "결석 처리할 학생을 선택하신 후 \n버튼을 눌러주시기 바랍니다.","경고",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '결석' " + 
								"where class_id = '"+class_id+"'");

						JOptionPane.showMessageDialog(null, "결석처리되었습니다.","알림",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("전체")) {
							List("");
						} else if(cb_name.equals("컴퓨터공학과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("멀티미디어과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("세무회계과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("독어독문과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		
		//병가
		sick.setBounds(350, 290, 100, 35);
		add(sick);
		sick.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "병가 처리할 학생을 선택하신 후 \n버튼을 눌러주시기 바랍니다.","경고",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '병가' " + 
								"where class_id = '"+class_id+"'");

						JOptionPane.showMessageDialog(null, "병가처리되었습니다.","알림",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("전체")) {
							List("");
						} else if(cb_name.equals("컴퓨터공학과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("멀티미디어과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("세무회계과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("독어독문과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		
		//조퇴
		jotai.setBounds(350, 350, 100, 35);
		add(jotai);
		jotai.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cb_depart.getSelectedIndex();
				String cb_name = cb_depart.getItemAt(index).toString();
				
				if(class_id == null) {
					JOptionPane.showMessageDialog(null, "조퇴 처리할 학생을 선택하신 후 \n버튼을 눌러주시기 바랍니다.","경고",JOptionPane.INFORMATION_MESSAGE);
				} else {
					try {
						stmt.executeQuery("update pofol_score set checkme = '조퇴' " + 
								"where class_id = '"+class_id+"'");

						JOptionPane.showMessageDialog(null, "조퇴처리되었습니다.","알림",JOptionPane.INFORMATION_MESSAGE);
						
						if(cb_name.equals("전체")) {
							List("");
						} else if(cb_name.equals("컴퓨터공학과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'C001')";
							List(squery);
							
						} else if(cb_name.equals("멀티미디어과")) {
							String squery = "where department_id = "
									+ "(select department_id from pofol_department where department_id = 'M002')";
							List(squery);
							
						} else if(cb_name.equals("세무회계과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'T003')";
							List(squery);
							
						} else if(cb_name.equals("독어독문과")) {
							String squery = " where department_id = "
									+ "(select department_id from pofol_department where department_id = 'G004')";
							List(squery);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
