package exam_2;

public class Ojcsample {

	public static void main(String[] args) {
		int sum = 0; // 선언문, 로컬변수선언
		
		for(int i = 1; i <= 10; i++) // 반복문
			sum = sum + i; 	// 대입문
			
		if(sum == 0) System.exit(0); // 제어문
			
		System.out.println("합계는 : " + sum); // 출력문
		
	}

}
