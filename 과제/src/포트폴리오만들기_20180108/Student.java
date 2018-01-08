package 포트폴리오만들기_20180108;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student extends JPanel {
	
	Student(){
		JTextField id;
		JTextField dept;
		JTextField name;
		JTextField iKor;
		JTextField iEng;
		JTextField iMath;
		JButton insertBtn;
		JButton updateBtn;
		JButton deleteBtn;
		
		add(new JLabel("학번 : "));
		id = new JTextField(20);
		add(id);
		
		add(new JLabel("학과 : "));
		dept = new JTextField(20);
		add(dept);
		
		add(new JLabel("이름 : "));
		name = new JTextField(20);
		add(name);
		
		add(new JLabel("국어 점수 : "));
		iKor = new JTextField(20);
		add(iKor);
		
		add(new JLabel("영어 점수 : "));
		iEng = new JTextField(20);
		add(iEng);
		
		add(new JLabel("수학 점수 : "));
		iMath = new JTextField(20);
		add(iMath);
		
		String colName[] = {"학번", "학과", "이름", "국어", "영어", "수학"};
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
		
		setSize(300, 480);
		setVisible(true);
	}

}
