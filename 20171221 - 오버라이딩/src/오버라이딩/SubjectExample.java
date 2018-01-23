package 오버라이딩;

//오버라이딩 override 오버라이드
//슈퍼 클래스의 메소드를 서브 클래스에서 다시 정의하는 것을 말한다.

class Subject{
	String name;
	
	void printInfo() {
		System.out.println("과목명 : "+name);
	}
}

class MajorSubject extends Subject{
	String targetGrader;
	
	void printInfo() {
//		super.printInfo();
		System.out.println("대상 학년 : "+targetGrader);
	}
}

public class SubjectExample {

	public static void main(String[] args) {
		Subject sb = new Subject();
		sb.name = "자바";
		sb.printInfo();
		
		MajorSubject msb = new MajorSubject();
		msb.targetGrader = "오버라이딩";
		msb.printInfo();
		
		//업캐스팅
		Subject ss = new MajorSubject();
		ss.name = "자바";
		ss.printInfo();
		
		Subject ss2 = new Subject();
		ss2.name = "자바1111";
		ss2.printInfo();
		
		MajorSubject ms = new MajorSubject();
		ms.targetGrader = "111";
		ms.printInfo();
		
		//업캐스팅
		Subject sb2 = new MajorSubject();
		sb2.name = "java";
		
		//다운캐스팅
		MajorSubject msb2 = (MajorSubject)sb2;
		msb2.targetGrader = "dd";
		msb2.printInfo();

	}

}
