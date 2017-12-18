package 과제_20171218;

public class Project_20171218_초급 {

	public static void main(String[] args) {
		// 1. for문을 이용해서 1부터 10까지 수를 출력하시오.
		for(int i=1; i<=10; i++) {
			System.out.println("i = "+i);
		}
		
		// 2. while문을 이용해서 1부터 10까지 수의 합을 출력하시오.
		int i=1;
		int sum = 0;
		while(i<=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("합계 : " + sum);
		
		// 3 . do-while문을 이용해서 0부터 9까지의 수를 출력하세요.
//		int i = 0;
//		do {
//			System.out.println("i = "+i);
//			i++;
//		}while(i<10);
		
		// 4. 1부터 100까지 짝수를 출력하시오.
//		for(int i=1; i<=100; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		// 5. 0부터 99까지 홀수를 출력하시오.
//		for(int i=0; i<100; i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}

	}

}
