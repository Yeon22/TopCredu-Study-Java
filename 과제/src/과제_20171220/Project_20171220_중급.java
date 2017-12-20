package 과제_20171220;

public class Project_20171220_중급 {

	public static void main(String[] args) {
//	 6. 4번에서 만든 Member클래스를 사용해서
//		"홍길동","이순신" 객체를 생성해보세요.

		Member 홍길동 = new Member();
		Member 이순신 = new Member();
		
		
//	7. 4번클래스를 이용해서 이름,주소,직업,나이를 키보드로 입력받는
//		함수와 출력하는 함수로 만들어서 출력하세요.
		
		홍길동.Input();
		홍길동.Output();
		
		이순신.Input();
		이순신.Output();
		
		
//	8. 로또 번호 생성기를 완성하시오, for문, 배열 사용 (중복 안되게 만들어보기)
		
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					--i;
					break;
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
