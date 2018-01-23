package 마우스이용선그리기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEx extends JFrame {
	public MouseEx() {
		setTitle("Drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();
		
		Point startP = null;
		Point endP = null;
		
		MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
				}
				
				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint(); //끝 부분 좌표  x, y
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			
			for(int i=0; i<vs.size(); i++) {
				Point s = vs.elementAt(i);
				Point e = ve.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}

	public static void main(String[] args) {
		new MouseEx();
	}

}
