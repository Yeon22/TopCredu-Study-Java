package 테이블;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Example2 extends JFrame {
	
	Example2(){
		setTitle("테이블 예제2");
		setSize(450, 400);
		
		String header[] = {"학생이름", "국어", "영어", "수학"};
		String contents[][] = {
				{"박영수", "90", "87", "98"},
				{"홍길동", "100", "77", "66"},
				{"이순신", "30", "25", "90"}
		};
		
		DefaultTableModel model = new DefaultTableModel(contents, header);
		JTable table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JTextField nameField = new JTextField(5);
		JTextField subject1 = new JTextField(5);
		JTextField subject2 = new JTextField(5);
		JTextField subject3 = new JTextField(5);
		
		panel.add(nameField);
		panel.add(subject1);
		panel.add(subject2);
		panel.add(subject3);
		
		JButton addBtn = new JButton("추가");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputStr[] = new String[4];
				inputStr[0] = nameField.getText();
				inputStr[1] = subject1.getText();
				inputStr[2] = subject2.getText();
				inputStr[3] = subject3.getText();
				
				model.addRow(inputStr);
				
				nameField.setText("");
				subject1.setText("");
				subject2.setText("");
				subject3.setText("");
			}
		});
		
		JButton cancelBtn = new JButton("삭제");
		cancelBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(table.getSelectedRow() == -1) {
					return;
				} else {
					model.removeRow(table.getSelectedRow());
				}
				
			}
			
		});
		
		panel.add(addBtn);
		panel.add(cancelBtn);
		add(scrollpane, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Example2();
	}

}
