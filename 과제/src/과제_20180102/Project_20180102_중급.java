package 과제_20180102;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project_20180102_중급 extends JFrame {
//	1. 마우스를 이용해서 사각형을 그리시오. (그래픽예제 12-9 예제 참고)
	
	public Project_20180102_중급() {
		setTitle("2018-01-02 중급문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel, BorderLayout.CENTER);
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();
		
		Point startP = null;
		Point endP = null;
		
		MyPanel(){
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
				}
				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for(int i=0; i<vs.size(); i++) {
				Point st = vs.elementAt(i);
				Point ed = ve.elementAt(i);
				
				g.drawRect((int)st.getX(), (int)ed.getY(), 150, 150);
			}
		}
	}
	
	
//	2. 벡터로 아래의 기능이 모두 가능한 학생관리 프로그램을 만드세요. (콘솔)
//		1. 추가 2.삭제 3. 출력 4. 검색 5. 정렬 6.수정 7.종료 

	public static void main(String[] args) {
		new Project_20180102_중급();
	}

}
