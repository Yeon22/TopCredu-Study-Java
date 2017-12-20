package 과제_20171220;

import java.util.Scanner;

public class Project_20171220 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//	 1. 크기가 10인 배열에 숫자 10개를 저장한 다음 전체 합계를 출력하시오. for문 사용
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i=0;i<10;i++) {
			sum += arr[i];
		}
		System.out.println("합계 : "+sum);
		
		
//	 2. 1번문제를 향상된 for문으로 출력하시오.
		
		int myArr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum2=0;
		for(int i : myArr) {
			sum2 += i;
		}
		System.out.println("합계 : "+sum2);
		
		
//	3. 키를 센티미터 단위로 입력하세요.
//		출력 키가 m  cm 이시군요.
//		입력 예시 ) 173
//		1m 73cm
		
		int m;
		System.out.print("당신의 키를 입력해주세요(예시:180) : ");
		m = sc.nextInt();
		System.out.println("당신의 키는 "+m/100+"m "+m%100+"cm이시군요.");
		
		
//	4. 태어나서 지금까지 내가 먹은 밥값이 얼마나 되는지 계산 하는 프로그램을 작성하세요. 
//		나이는 사용자로부터 입력 받고 하루 3끼 식사를 하되 한끼 식사 5천원으로 계산하세요.
		
		int age = 0;
		int meal;
		System.out.print("당신의 나이를 입력하세요 : ");
		age = sc.nextInt();
		meal = age*3*365*5000;
		System.out.print("당신이 지금까지 먹은 밥값은 약 "+meal+" 입니다.");
		
	}

}
