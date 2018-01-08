package 포트폴리오만들기_20180108;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Graph extends JPanel {
	DefaultTableModel model;
	JTable table;
	
	Graph(){
		setLayout(null);
		
		JLabel S_dept = new JLabel("과목");
		S_dept.setBounds(10,10,30,30);
		add(S_dept);
		
		String dept[] = {"국어", "영어", "수학"};
		JComboBox Cb_dept = new JComboBox(dept);
		Cb_dept.setBounds(45, 10, 70, 20);
		add(Cb_dept);
		
		JLabel avg_graph = new JLabel("평균 그래프");
		avg_graph.setBounds(10, 50, 100, 20);
		add(avg_graph);
		
		JLabel com_dept = new JLabel("컴퓨터공학과");
		com_dept.setBounds(10, 100, 80, 20);
		add(com_dept);
		
		JLabel kor_dept = new JLabel("국어국문학과");
		kor_dept.setBounds(10, 140, 80, 20);
		add(kor_dept);
		
		JLabel tax_dept = new JLabel("세무회계과");
		tax_dept.setBounds(10, 170, 80, 20);
		add(tax_dept);
		
		JLabel food_dept = new JLabel("식품영양과");
		food_dept.setBounds(10, 200, 80, 20);
		add(food_dept);
		
		JButton selectBtn = new JButton("조회");
		selectBtn.setBounds(10, 250, 70, 20);
		add(selectBtn);
		
		setSize(490, 400);
		setVisible(true);
	}

}
