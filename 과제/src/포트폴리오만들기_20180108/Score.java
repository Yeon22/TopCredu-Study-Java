package 포트폴리오만들기_20180108;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score extends JPanel {
	DefaultTableModel model;
	JTable table;
	
	Score(){
		setLayout(null);
		
		JLabel S_dept = new JLabel("학과");
		S_dept.setBounds(10,10,30,30);
		add(S_dept);
		
		String dept[] = {"컴퓨터공학과", "국어국문학과", "세무회계과", "식품영양과"};
		JComboBox Cb_dept = new JComboBox(dept);
		Cb_dept.setBounds(45, 10, 120, 20);
		add(Cb_dept);
		
		String colName[] = {"이름", "국어", "영어", "수학", "합계", "평균"};
		model = new DefaultTableModel(colName, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(470, 200));
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(10, 40, 460, 250);
		add(scrollpane);
		
		JButton selectBtn = new JButton("조회");
		selectBtn.setBounds(10, 300, 70, 20);
		add(selectBtn);
		
		setSize(490, 400);
		setVisible(true);
	}

}
