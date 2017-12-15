package 제어문;

public class IfTest {

	public static void main(String[] args) {
//		boolean b = true;
//		if(b) {
//			System.out.println("참입니다.");
//		} else {
//			System.out.println("거짓입니다.");
//		}
//		System.out.println("종료");
		
		//2로 나누어서 나머지가 0이면 짝수이다.
		int i = 11;
//		if(i % 2 == 0) {
//			System.out.println("짝수");
//		}
//		if(i % 3 == 0) { //3의 배수라면 
//			System.out.println("3의 배수");
//		}
		
		if(i % 5 == 0)  //5의 배수라면
			System.out.println("5의 배수");
		else if(i % 5 == 1)
			System.out.println("5의 배수 + 1");
		else
			System.out.println("5의 배수 + 2 혹은 3 혹은 4");
	}

}
