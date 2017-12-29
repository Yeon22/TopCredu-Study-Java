package 스윙그리기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import 스윙그리기.GraphicsDrawLineEx.MyPanel;

public class GraphicsFillEx extends JFrame {
	Container contentPane;
	
	public GraphicsFillEx() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(100,350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.DARK_GRAY);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.RED);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLUE);
			g.fillRoundRect(10, 130, 50, 50, 20, 20);
			g.setColor(Color.GREEN);
			g.fillArc(10, 190, 50, 50, 0, 270);
			g.setColor(Color.orange);
			int [] x = {30, 10, 30, 60};
			int [] y = {250, 275, 300, 275};
			g.fillPolygon(x, y, 4);
		}
	}

	public static void main(String[] args) {
		new GraphicsFillEx();
	}

}
