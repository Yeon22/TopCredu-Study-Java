package 스윙;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("컨텐트 패인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이전 버젼
//		Container contentPane = getContentPane();
//		contentPane.setBackground(Color.orange);
//		contentPane.setLayout(new FlowLayout());
//		contentPane.add(new JButton("OK"));
//		contentPane.add(new JButton("Cancel"));
//		contentPane.add(new JButton("Ignore"));
		
		//1.5이후 버젼 8버젼
		setLayout(new FlowLayout());
		add(new JButton("OK"));
		add(new JButton("Cancel"));
		
		setSize(350,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
