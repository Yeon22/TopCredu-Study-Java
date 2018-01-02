package 새로운버튼생성;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class paintComponentEx extends JFrame {
	public paintComponentEx() {
		setTitle("paintComponent 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.cyan);
		add(b);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyButton extends JButton {
		MyButton(String s){
			super(s);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth(), this.getHeight());
		}
	}

	public static void main(String[] args) {
		new paintComponentEx();
	}

}
