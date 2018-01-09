package Haksa;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	
	DefaultTableModel model; //모델, 데이터
	JTable table; //테이블
	Vector<String> title = new Vector<String>();
	Vector<Info> m_Vec = new Vector<Info>(); //데이터 저장하거나 수정, 삭제를 위한 벡터
	Vector<Object> dataVector = new Vector<Object>();
	
	Student() {
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
		
//		String colName[] = {"이름", "학번", "학과", "주소"};
		title.add("이름");
		title.add("학번");
		title.add("학과");
		title.add("주소");
		
		model = new DefaultTableModel();
		
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
				
				//학번
				String sname = (String)model.getValueAt(table.getSelectedRow(), 0);
				name.setText(sname); //id텍스트필드에 표에서 가져온 데이터를 넣어주자.
				//이름
				String sid = (String)model.getValueAt(table.getSelectedRow(), 1);
				id.setText(sid);
				//학과
				String sdept = (String)model.getValueAt(table.getSelectedRow(), 2);
				dept.setText(sdept);
				//주소
				String saddress = (String)model.getValueAt(table.getSelectedRow(), 3);
				address.setText(saddress);
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
					name.requestFocus(); //필드로 커서가 가진다.
				} else if(dept.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "학과를 입력하세요.");
					name.requestFocus(); //필드로 커서가 가진다.
				} else if(address.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "주소를 입력하세요.");
					name.requestFocus(); //필드로 커서가 가진다.
				} else {
					//표에 데이터를 넣어주는 곳
					Info cInfo = new Info(name.getText(), id.getText(), dept.getText(), address.getText());
					m_Vec.add(cInfo);
					dataVector.clear();
					
					for(int i=0; i<m_Vec.size(); i++) {
						Info st = m_Vec.get(i); //벡터에서 하나 꺼냄
						Vector<String> temp = new Vector<String>();
						temp.addElement(st.getName());
						temp.addElement(st.getId());
						temp.addElement(st.getDepartment());
						temp.addElement(st.getAddress());
						dataVector.addElement(temp); //Vector<Object>에 넣어주면 표에 들어감.
					}
					
					model.setDataVector(dataVector, title);
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
					Info student = new Info(name.getText(), id.getText(), dept.getText(), address.getText());
					
					m_Vec.setElementAt(student, table.getSelectedRow());
					
					Vector<String> temp = new Vector<String>();
					temp.addElement(name.getText());
					temp.addElement(id.getText());
					temp.addElement(dept.getText());
					temp.addElement(address.getText());
					//그 위치에 다시 넣어서 수정
					dataVector.setElementAt(temp, table.getSelectedRow()); 
					
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		deleteBtn = new JButton("삭제");
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					m_Vec.remove(table.getSelectedRow());
					dataVector.clear();
					
					for(int i=0; i<m_Vec.size(); i++) {
						Info st = m_Vec.get(i);
						Vector<String> temp = new Vector<String>();
						temp.addElement(st.getName());
						temp.addElement(st.getId());
						temp.addElement(st.getDepartment());
						temp.addElement(st.getAddress());
						dataVector.addElement(temp);
					}
					
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		setSize(300, 420);
		setVisible(true);
	}

}
