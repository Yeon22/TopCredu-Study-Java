package 반복문;

public class while_1 {

	public static void main(String[] args) {
		// while(조건문){
		//		작업할 문장
		// }
		
//		int i=0;
//		
//		while(i<5) {
//			System.out.println("안녕하세요. i = "+i);
//			i++;
//		}
		
//		int i=0;
//		boolean flag = true;
//		while(true) { 
//			i++;
//			if(i==10) {
////				flag = false;
//				break;
//			}
//			System.out.println("안녕하세요.");
//		}
		
//		int i=0;
//		int sum=0;
//		
//		while(i<5) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("합계 : "+sum);
		
		
//		do {
//			
//		} while(조건식);
		
//		boolean flag = false;
//		while(flag) {
//			System.out.println("안녕하세요.");
//		}
		
//		int i=0;
//		do {
//			System.out.println("안녕하세요."+i);
//			i++;
//		} while(i<5);
		
		
		//break; 반복문에서 탈출하는 명령어
//		for(int i=0; i<10; i++) {
//			if(i==3) {
//				System.out.println("3일 때 종료");
//				break;
//			}
//			System.out.println("안녕하세요."+i);
//		}
		
//		int i=0;
//		while(i<10) {
//			if(i==3) {
//				System.out.println("3일 때 종료");
//				break;
//			}
//			System.out.println("안녕하세요.");
//			i++;
//		}
		
		
		//continue 만나면 반복문 처음으로 되돌아간다.
//		for(int i=0; i<10; i++) {
//			if(i == 3) {
//				continue;
//			}
//			System.out.println("i = "+i);
//		}
		
		
		//라벨로 분기하는 경우
		//continue 라벨;
		//특징은 특정 라벨의 다음 반복으로 분기
		//중첩 반복에서 바깥의 반복문으로 빠져 나갈 때 주로 사용
		
//		int count=1;
//		LABEL:
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j==3) {
//					continue LABEL;
//				}
//				System.out.println("안녕하세요."+(count++));
//			}
//		}
//		System.out.println("반복문 끝난 코드");
		
		
		//break 라벨;
		//반복문의 벗어나는 라벨이 붙은 곳으로 바로 벗어남
		//중첩 반복문을 한 번에 벗어날 때 주로 사용
		
		int count=1;
		LABEL:
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					break LABEL;
				}
				System.out.println("안녕하세요."+(count++));
			}
		}
		System.out.println("반복문 끝난 코드");
		

	}

}
