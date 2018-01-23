package 스윙이벤트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class InnerClassListener extends JFrame {
	InnerClassListener(){
		setTitle("Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		//액션클래스 객체
		MyActionListener listner = new MyActionListener();
		//리스너 붙영주는 함수
		btn.addActionListener(listner);
		
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	//내부로 옮겼다. 내부클래스
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action")) {
				b.setText("액션");
			} else {
				b.setText("Action");
			}
			
		}
	}

	
	public static void main(String[] args) {
		new InnerClassListener();

	}

}
