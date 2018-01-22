package 포트폴리오만들기_20180108_start;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Score extends JPanel {
	Vector<Object> dataVector = new Vector<Object>();
	Vector<String> title = new Vector<String>();
	DefaultTableModel model;
	JTable table;
	
	Score(){
		setLayout(null);
		
		JLabel S_dept = new JLabel("학과");
		S_dept.setBounds(10,10,30,30);
		add(S_dept);
		
		String dept[] = {"전체", "컴퓨터공학과", "멀티미디어과", "세무회계과", "독어독문과"};
		JComboBox Cb_dept = new JComboBox(dept);
		Cb_dept.setBounds(45, 10, 120, 20);
		add(Cb_dept);
		
		title.add("학번");
		title.add("이름");
		title.add("출결점수");
		title.add("시험점수");
		title.add("과제점수");
		
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		table.setPreferredScrollableViewportSize(new Dimension(470, 200));
		JScrollPane scrollpane = new JScrollPane(table);
		scrollpane.setBounds(10, 40, 460, 250);
		add(scrollpane);
		
		JButton selectBtn = new JButton("조회");
		selectBtn.setBounds(10, 300, 70, 20);
		add(selectBtn);
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = Cb_dept.getSelectedIndex();
				String Cb_name = Cb_dept.getItemAt(index).toString();
				
				if(Cb_name.equals("컴퓨터공학과")) {
					
				} else if(Cb_name.equals("멀티미디어과")) {
					
				} else if(Cb_name.equals("세무회계과")) {
					
				} else if(Cb_name.equals("독어독문과")) {
					
				} else {
					for(int i =0; i< Student.m_Vector.size(); i++) {
						Info fo = Student.m_Vector.get(i);
						Vector<String> temp = new Vector<String>();
						temp.addElement(fo.getId());
						temp.addElement(fo.getName());
						temp.addElement(fo.getattend());
						temp.addElement(fo.geta_exam());
						temp.addElement(fo.getattitude());
						dataVector.addElement(temp);
					}
					model.setDataVector(dataVector, title);
				}
			}
		});
		
		setSize(490, 400);
		setVisible(true);
	}

}
