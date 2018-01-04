package Thread;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable {
	public FlickeringLabel(String text) {
		super(text); // JLabel 생성자 호출
		setOpaque(true); // 배경색 변경이 가능하도록 설정
		
		Thread th = new Thread(this);
		th.start();
	}

	public void run() {
		int n = 0;
		while(true) {
			if(n == 0)
				setBackground(Color.yellow);
			else
				setBackground(Color.GREEN);
			if(n == 0)
				n = 1;
			else
				n = 0;
			try {
				Thread.sleep(500); // 0.5초 동안 잠을 잔다.
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("깜박");
		
		JLabel label = new JLabel("안깜박");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박");
		
		add(fLabel);
		add(label);
		add(fLabel2);
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
