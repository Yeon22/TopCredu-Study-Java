package 추상클래스;

////추상클래스
//abstract class DObject{
//	//추상메소드
//	abstract public void draw();
//}

interface DObject{
	abstract public void draw();
}

class Line implements DObject{
	public void draw() {
		System.out.println("직선");
	}
}

class Rectangle implements DObject{
	public void draw() {
		System.out.println("사각형");
	}
}

public class Example {

	public static void main(String[] args) {
		//추상클래스는 인스턴스 불가
//		DObject d = new DObject();
		
		Line l = new Line();
		l.draw();
		
		DObject d = new Line();
		d.draw();

	}

}
