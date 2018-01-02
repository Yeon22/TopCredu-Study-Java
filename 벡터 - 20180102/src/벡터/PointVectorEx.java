package 벡터;

import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class PointVectorEx {

	public static void main(String[] args) {
		// Point 객체를 요소로만 가지는 Vector 생성
		Vector<Point> v = new Vector<Point>();
		
		// 3개의 Point객체 삽입
		v.add(new Point(2,3));
		Point a = new Point(-5, 20);
		v.add(a);
		v.add(new Point(30,-8));
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // 벡터에서 i번체 Point 객체 얻어오기
			System.out.println(p);
		}
	}

}
