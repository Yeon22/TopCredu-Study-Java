package 변수;

public class Variables {

	public static void main(String[] args) {
		//변수가 어떤 타입의 데이터를 담을 것인지 명시
		//변수의 이름을 정의
		//;세미콜론 닫아줌
		//정수 값을 담는 a라는 이름의 변수를 선언한다.
		int a = 100;
		//출력문
		System.out.println(a);
		
		//문자
		char b = '가';
		System.out.println(b);
		
		//문자열
		String test = "안녕하세요.";
		System.out.println(test);
		
		float pi = 3.14f;
		System.out.println(pi);
		
		//정수 i에 10을 담겠다.
		int i = 10;
		int j = i;
		System.out.println("i = "+i+", j = "+j);
	}

}
