package Haksa;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		String colName[] = {"이름", "학번", "학과", "주소"};
		DefaultTableModel model = new DefaultTableModel(colName,0);
		
		JTable table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(250, 200));
		add(new JScrollPane(table));
		
		insertBtn = new JButton("입력");
		add(insertBtn);
		
		updateBtn = new JButton("수정");
		add(updateBtn);
		
		deleteBtn = new JButton("삭제");
		add(deleteBtn);
		
		setSize(300, 420);
		setVisible(true);
	}

}
