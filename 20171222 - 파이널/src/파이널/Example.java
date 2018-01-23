package 파이널;

import java.util.Scanner;

//상속 불가능한 클래스
//final class Person{
//	
//}

public class Example {

	public static void main(String[] args) {
//		final String name = "홍길동";
//		final float pi = 3.14f;

		//원의 반지름을 실수로 입력 받아 원의 둘레의 길이와
		//면적을 소수점 둘째 자리까지 출력하는 프로그램을 작성해보기
		Scanner sc = new Scanner(System.in);
		float radius; //반지름
		final float pi = 3.14f; //파이널키워드로 고정 	상수
		float perimeter; //원의 둘레
		float area; // 원의 면적
		
		System.out.print("반지름을 입력하세요 : ");
		radius = sc.nextFloat();
		
		perimeter = 2*pi*radius;
		area = pi*radius*radius;
		
		System.out.printf("원의 둘레 : %.2f \n", perimeter);
		System.out.printf("원의 면적 : %.2f", area);
	}

}
