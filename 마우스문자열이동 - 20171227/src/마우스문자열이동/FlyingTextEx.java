package 마우스문자열이동;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlyingTextEx extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel("HELLO");
	final int FLYING_UNIT = 10;
	
	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50);
		la.setSize(100, 20);
		contentPane.add(la);
		
		setSize(300, 300);
		setVisible(true);
		
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+FLYING_UNIT, la.getY());
				break;	
			}
		}
	}

	public static void main(String[] args) {
		new FlyingTextEx();

	}

}
