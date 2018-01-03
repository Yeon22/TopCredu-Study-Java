package 컬렉션과제풀이;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseRect extends JFrame{
	
//	1. 마우스를 이용해서 사각형을 그리시오. (그래픽예제 12-9 예제 참고)
	
	MouseRect(){
		setTitle("Drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();
		
		Point startP = null;
		Point endP = null;
		
		public MyPanel(){
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint(); //20,20
				}
				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint(); //끝부분 좌표 x,y
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for(int i =0; i<vs.size(); i++) {
				Point s = vs.elementAt(i);
				Point e = ve.elementAt(i);
				
				int Width = (int)e.getX() - (int)s.getX();
				int Height = (int)e.getY() - (int)s.getY();
				
				g.drawRect((int)s.getX(), (int)s.getY(), Width, Height);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new MouseRect();
	}

}
