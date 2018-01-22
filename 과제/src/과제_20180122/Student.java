package 과제_20180122;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class MyDialog extends JDialog {
	JTextField idText = new JTextField(10);
	JButton okBtn = new JButton("확인");
	
	MyDialog(){
		setLayout(new FlowLayout());
		add(idText);
		add(okBtn);
		
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		setSize(200, 100);
	}
}

class Info {
	String name;
	String id;
	String department;
	String address;
	
	public Info(String name, String id, String department, String address) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}

public class Student extends JPanel {
	JTextField name; //이름
	JTextField dept; //학과
	JTextField id; //아이디
	JTextField address; //주소
	JTextField Search; //검색
	JTextArea list; //학생목록
	JButton selectBtn; //조회버튼
	JButton insertBtn; //입력버튼
	JButton updateBtn; //수정버튼
	JButton deleteBtn; //삭제버튼
	JButton idCheckBtn; //학번 중복 체크
	MyDialog dialog = new MyDialog();
	
	Connection conn = null;
	Statement stmt = null;
	
	DefaultTableModel model; //모델, 데이터
	JTable table; //테이블
	
	void ListAdd() {
		try {
			ResultSet rs = stmt.executeQuery("select * from student");
			
//			String id;
//			String name;
//			String department_id;
//			String address;
//			
//			list.append("학번"+"\t"+"이름"+"\t"+"학과"+"\t"+"주소"+"\n");
//			list.append("==================================================\n");
//			
//			while(rs.next()) {
//				id = rs.getString("id");
//				name = rs.getString("name");
//				department_id = rs.getString("department_id");
//				address = rs.getString("address");
//				list.append(id+"\t"+name+"\t"+department_id+"\t"+address+"\n");
//			}
			
			//JTable 초기화
			model.setNumRows(0);
			
			while(rs.next()) {
				String[] row = new String[4];
				row[0] = rs.getString("name");
				row[1] = rs.getString("id");
				row[2] = rs.getString("department_id");
				row[3] = rs.getString("address");
				model.addRow(row);
			}
			rs.close();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	Student() {
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
		
		
		add(new JLabel("이름 : ")); //이름 라벨 추가
		name = new JTextField(20);
		add(name); //이름 TextField 추가
		
		add(new JLabel("학번 : ")); //학번 라벨 추가
		id = new JTextField(10);
		add(id); // 학번 TextField 추가
		
		idCheckBtn = new JButton("학번중복체크");
		add(idCheckBtn);
		idCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		add(new JLabel("학과 : ")); //학과 라벨 추가
		dept = new JTextField(20);
		add(dept); //학과 TextField 추가
		
		add(new JLabel("주소 : ")); //주소 라벨 추가
		address = new JTextField(20);
		add(address); // 주소 TextField 추가
		
		String colName[] = {"이름", "학번", "학과", "주소"};
		
		model = new DefaultTableModel(colName, 0);
		
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(250, 200));
		add(new JScrollPane(table));
		
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
				
				//이름
				String sname = (String)model.getValueAt(table.getSelectedRow(), 0);
				name.setText(sname); 
				//학번
				String sid = (String)model.getValueAt(table.getSelectedRow(), 1);
				id.setText(sid); //id텍스트필드에 표에서 가져온 데이터를 넣어주자.
				//학과
				String sdept = (String)model.getValueAt(table.getSelectedRow(), 2);
				dept.setText(sdept);
				//주소
				String saddress = (String)model.getValueAt(table.getSelectedRow(), 3);
				address.setText(saddress);
			}
		});
		
		
		selectBtn = new JButton("조회");
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ListAdd();
			}
		});
		
		
		insertBtn = new JButton("입력");
		add(insertBtn);
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//이름필드가 비어있는지 입력이 되어있는지 체크
				if(name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요.");
					name.requestFocus(); //필드로 커서가 가진다.
				} else if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학번을 입력하세요.");
					id.requestFocus(); //필드로 커서가 가진다.
				} else if(dept.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학과를 입력하세요.");
					dept.requestFocus(); //필드로 커서가 가진다.
				} else if(address.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "주소를 입력하세요.");
					address.requestFocus(); //필드로 커서가 가진다.
				} else {
					
					try {
						String sql = "insert into student values('"
										+id.getText()+"','"
										+name.getText()+"','"
										+dept.getText()+"','"
										+address.getText()+"')";
						stmt.executeUpdate(sql);
						System.out.println("입력되었습니다.");
						JOptionPane.showMessageDialog(null, "입력되었습니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
						
						//조회
						ListAdd();
						
					} catch(Exception e2) {
						e2.printStackTrace();
					}
					
				}
			}
		});
		
		
		updateBtn = new JButton("수정");
		add(updateBtn);
		updateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//YES버튼을 눌렀을 때
				if(JOptionPane.showConfirmDialog(null, "수정하시겠습니까?", "수정", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					try 
					{
						stmt.executeUpdate("update student set name = '"
								+name.getText() +"'," + "department_id='"
								+ dept.getText()+"'," + "address = '"
								+ address.getText()+"'" + "where id = '"
								+ id.getText()+"'");
						JOptionPane.showMessageDialog(null, "수정이되었습니다.","알림"
								,JOptionPane.INFORMATION_MESSAGE);
						
						ListAdd();
						
					} catch(Exception a) {
						a.printStackTrace();
					}
				}
			}
		});
		
		
		deleteBtn = new JButton("삭제");
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(result == JOptionPane.YES_OPTION) {
					try {
						stmt.executeUpdate("delete from student where id= '"
								+ id.getText()+"'");
						JOptionPane.showMessageDialog(null, "삭제되었습니다.");
						ListAdd();
						
					}catch(Exception a) {
						a.printStackTrace();
					}
					
				} else if(result == JOptionPane.CLOSED_OPTION) {
					System.out.println("취소");
				}
			}
		});
		
		setSize(300, 420);
		setVisible(true);
	}

}
