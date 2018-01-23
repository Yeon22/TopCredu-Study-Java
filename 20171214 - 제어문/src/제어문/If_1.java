package 제어문;

public class If_1 {

	public static void main(String[] args) {
		//If it rains,
		//만약 비가온다면
		
//		int i = 7;
//		
//		//i가 5보다 작거나 같으면 true
//		if(i <= 5) {
//			//처리할 명령어들 써주면 된다.
//			System.out.println("5보다 작거나 같다.");
//		}
//		
//		if(i > 6) {
//			System.out.println("6보다 클 때");
//		}
		
//		int i = 10;
//		
//		if(i<=5) {
//			System.out.println("i가 5보다 작거나 같은 경우");
//		} else {
//			System.out.println("6~... true조건과 반대되는 모든 경우");
//		}
		
		int i = 8;
		
		if(i<=5) {
			System.out.println("i가 5보다 작거나 같다.");
		} else if(i==6) {
			System.out.println("i가 6일 때");
		} else {
			System.out.println("5보다 작거나 같고 i가 6일 때가 아닌 경우");
		}
		

	}

}
