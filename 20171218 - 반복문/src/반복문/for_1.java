package 반복문;

public class for_1 {

	public static void main(String[] args) {
		// for
		// for(초기값; 조건식; 증감식){
		// }
		// for 블럭이 없으면 한줄까지 로직이 탄다.
		
//		for(int i=0; i<100; i++) {
//			System.out.println("안녕하세요. i = "+i);
//		}
		
//		String str[] = {"안","녕","하","세","요"};
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(str[i]);
//		}
		
		//for(1.초기문;2.조건식;3.반복하기위한 증감식)
		//1.for문 실행할 훈 오직 한번만 실행되는 초기화 작업
		//;구분되고 여러문장 아력가능
		
//		for(int i=0,j=0; i<5; i++) {
//		}	
//		int i = 0;
//		for( ;i<10;i++) {
//			
//		}
		
		//2.논리형 변수나 논리 연산만 가능
		//반복조건이 true이면 반복 계속, false이면 종료
		//반복 조건이 true 상수인 경우, 무한 반복
		//반복 조건이  비어 있으면 true로 간주
		
//		for(int i=0; true; i++) {
//			System.out.println("무한반복");
//		}
//		
//		for(;;) {
//			System.out.println("무한반복");
//		}
		
		//3.반복 작업 문장들의 실행 후 처리 작업
		//, 구분해서 여러 문장 나열 가능
		
//		for(int i=0,j=0; i<5; i++,j=j+1) {
//			System.out.println("i = "+i+",j = "+j);
//		}
		
//		int sum=0;
//
//		for (int i=0; i<5; i++) {
//			sum = sum + i;
//		}
//		System.out.println("합계 : "+sum);
		
//		for(int i=5; i>=1; i--) {
//			System.out.println("i = "+i);
//		}
		
//		int array[] = {1,2,3,4,5};
//		for(int i=0; i<5; i++) {
//			System.out.println("array = "+array[i]);
//		}
//		for(int i=4; i>=0; i--) {
//			System.out.println("array = "+array[i]);
//		}
		
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		
		int array[][] = new int[3][3];
		int count = 1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				array[i][j] = count++;
				System.out.println("array["+i+"]"+"["+j+"]="+array[i][j]);
			}
		}

	}

}
