package 스윙이벤트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestClass extends JFrame {
	TestClass(){
		setTitle("익명클래스연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		//익명클래스
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("액션");
				} else {
					b.setText("Action");
				}
			}
		});
		
		add(btn);
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new TestClass();

	}

}
