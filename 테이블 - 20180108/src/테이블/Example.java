package 테이블;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Example extends JFrame {
	
	Example(){
		setTitle("테이블 예제");
		setSize(400, 400);
		
		String header[] = {"학생이름", "국어", "영어", "수학"};
		String contents[][] = {
				{"박영수", "90", "87", "98"},
				{"홍길동", "100", "77", "66"},
				{"이순신", "30", "25", "90"}
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scrollpane = new JScrollPane(table);
		
//		2.값을 바꾸고 가져온다.
		table.setValueAt("200", 1, 1);
		System.out.println(table.getValueAt(1, 1));
		
//		3.행의 수, 열의 수
		System.out.println(table.getRowCount());
		System.out.println(table.getColumnCount());
		
//		4.컬럼 이름 가져오기
		System.out.println(table.getColumnName(0));
		System.out.println(table.getColumnName(1));
		
		add(scrollpane);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Example();
	}

}
