package 스윙그리기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineEx extends JFrame {
	Container contentPane;
	
	public GraphicsDrawLineEx() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.DARK_GRAY);
			g.drawLine(20, 20, 100, 100);
			g.setColor(Color.RED);
			g.drawOval(150, 20, 80, 80);
			g.setColor(Color.BLUE);
			g.drawRect(20, 140, 80, 80);
			g.setColor(Color.GREEN);
			g.drawRoundRect(120, 140, 120, 80, 40, 60);
			g.setColor(Color.RED);
			g.drawArc(20, 250, 80, 80, 90, 270);
			g.setColor(Color.DARK_GRAY);
			int [] x = {200, 150, 200, 250};
			int [] y = {250, 300, 350, 300};
			g.drawPolygon(x, y, 4);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
