package 다운캐스팅;

class DObject{
	void draw() {
		System.out.println("도형");
	}
}

class Line extends DObject{
	@Override
	void draw() {
		System.out.println("라인");
	}
}

class Rectangle extends DObject{
	@Override
	void draw() {
		System.out.println("사각형");
	}
}

public class Example {

	public static void main(String[] args) {
//		DObject d = new DObject();
//		d.draw(); //도형
		
//		Line l = new Line();
//		l.draw(); //라인
		
//		DObject d = new Line();
//		d.draw(); 
//		
//		Line l = (Line)d;
//		l.draw(); //다운캐스팅
		
//		DObject d2 = new Rectangle();
//		d2.draw(); //업캐스팅
//		
//		Rectangle r = (Rectangle)d2;
//		r.draw(); //다운캐스팅
		
		DObject d2 = new Line();
		d2 = new Rectangle();
		Rectangle r = (Rectangle)d2;
		r.draw(); //다운 캐스팅 메모리를 잘 넣어줘야 한다.

	}

}
