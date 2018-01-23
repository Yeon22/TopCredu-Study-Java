package Student;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Student extends JFrame{
	JTextField name; //이름
	JTextField dept; //학과
	JTextField id; //아이디
	JTextField address; //주소
	JTextField search; //검색
	JTextArea list; //학생목록
	JButton selectBtn; //조회
	JButton insertBtn; //입력
	JButton updateBtn; //수정
	JButton deleteBtn; //삭제
	JButton idcheckBtn;
	JButton searchBtn;
	
	Connection conn = null;
	Statement stmt = null;
	
	void ListAdd() {
		try {
			list.setText("");
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			String id;
			String name;
			String department_id;
			String address;
			
			list.append("학번"+"\t"+"이름"+"\t"+"학과"+"\t"+"주소"+"\n");
			list.append("==================================================\n");
			
			while(rs.next()) {
				id = rs.getString("id");
				name = rs.getString("name");
				department_id = rs.getString("department_id");
				address = rs.getString("address");
				list.append(id+"\t"+name+"\t"+department_id+"\t"+address+"\n");
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	Student(){
		
		//db연결
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
		
		setTitle("학생관리프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(new JLabel("이름 : "));
		name = new JTextField(20);
		add(name);
		
		add(new JLabel("학과 : "));
		dept = new JTextField(20);
		add(dept);
		
		add(new JLabel("학번 : "));
		id = new JTextField(10);
		add(id);
		
		idcheckBtn = new JButton("학번중복 체크");
		add(idcheckBtn);
		
		add(new JLabel("주소 : "));
		address = new JTextField(20);
		add(address);
		
		list = new JTextArea("", 15, 25);
		add(new JScrollPane(list));
		
		selectBtn = new JButton("목록");
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet rs = stmt.executeQuery("select * from student");
					
					String id;
					String name;
					String department_id;
					String address;
					
					list.append("학번"+"\t"+"이름"+"\t"+"학과"+"\t"+"주소"+"\n");
					list.append("==================================================\n");
					
					while(rs.next()) {
						id = rs.getString("id");
						name = rs.getString("name");
						department_id = rs.getString("department_id");
						address = rs.getString("address");
						list.append(id+"\t"+name+"\t"+department_id+"\t"+address+"\n");
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		insertBtn = new JButton("입력");
		add(insertBtn);
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요");
					name.requestFocus();
				} else if(id.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학번을 입력하세요");
					id.requestFocus();
				} else if(dept.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학과를 입력하세요");
					dept.requestFocus();
				} else if(address.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "주소를 입력하세요");
					address.requestFocus();
				} else {
					//인서트 작업
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
				if(JOptionPane.showConfirmDialog(null, "수정하시겠습니까?","수정"
						,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
				{
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
		
		
		add(new JLabel("ID 검색 : "));
		search = new JTextField(10);
		add(search);
		
		searchBtn = new JButton("검색");
		add(searchBtn);
		searchBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet rs = stmt.executeQuery("select * from student where id = '"
									+ search.getText()+"'");
					String sid;
					String sname;
					String sdepartment_id;
					String saddress;
					
					rs.next();
					
					sid = rs.getString("id");
					sname = rs.getString("name");
					sdepartment_id = rs.getString("department_id");
					saddress = rs.getString("address");
					
					id.setText(sid);
					name.setText(sname);
					dept.setText(sdepartment_id);
					address.setText(saddress);
					
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		setSize(300, 500);
		setVisible(true);
		setResizable(false); //크기변경 불가
		
	}

	public static void main(String[] args) {
		new Student();
	}

}
