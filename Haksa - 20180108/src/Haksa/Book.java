package Haksa;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Book extends JPanel {
	DefaultTableModel model; //모델 데이터
	JTable table; //테이블
	
	Book(){
		setLayout(null);
		
		JLabel l_dept = new JLabel("학과");
		l_dept.setBounds(10, 10, 30, 30);
		add(l_dept);
		
		String[] dept = {"전체", "컴퓨터시스템", "멀티미디어", "컴퓨터공학"};
		JComboBox cb_dept = new JComboBox(dept);
		cb_dept.setBounds(45, 10, 100, 20);
		add(cb_dept);
		
		String colName[] = {"학번", "이름", "도서명", "대출일"};
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(470, 200));
		add(table);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(10, 40, 460, 250);
		add(sp);
		
		JButton ListButton = new JButton("조회");
		ListButton.setBounds(10, 300, 70, 20);
		add(ListButton);
		
		setSize(490, 400);
		setVisible(true);
	}

}
