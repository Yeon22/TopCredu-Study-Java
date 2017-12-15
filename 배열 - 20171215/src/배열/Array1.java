package 배열;

public class Array1 {

	public static void main(String[] args) {
		//문자열형을 담는 배열 4개 크기만큼 선언하겠다.
		//String arr2[] = new String[4];
		
		// 자료형 배열이름[요소 번호]
		//정수 값을 담는 배열을 3개 크기만큼 선언하겠다.
//		int arr[] = new int[3];
//		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;

//		int arr[] = new int[] {1,2,3};
		
//		int arr[] = {1,2,3};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
//		String str[] = {"Hello", "Java", "Nice to meet you", "Bye"};
//		System.out.println(str[0]);
//		System.out.println(str[1]);
//		System.out.println(str[2]);
//		System.out.println(str[3]);
		
		String str[] = new String[4];
		str[0] = "안녕";
		str[1] = "반갑습니다.";
		str[2] = "하이";
		str[3] = "헬로우";
		
		System.out.println(str[0]+str[1]+str[2]+str[3]);
		System.out.println();
		
		int i = 2;
		System.out.println(str[i]);
		
	}

}
