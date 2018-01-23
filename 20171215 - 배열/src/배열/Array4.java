package 배열;

public class Array4 {

	public static void main(String[] args) {
//		//반드시 배열 생성 후 메모리도 넣어주고 값을 주어야 된다.
//		int intArray[];
//		intArray = new int[10];
//		
//		intArray[4] = 8; //오류 intArray 배열의 메모리가 할당되지 않았음
//		System.out.println(intArray[4]);
		
		int intArray[] = new int[5]; //인덱스는 0~4까지 가능
		int n = intArray[4];
		System.out.println(n);
		
		//배열의 크기
		int size = intArray.length;
		System.out.println(size);
		
		
		int i[][] = new int[2][5];
		int size1 = i.length; //2
		int size2 = i[0].length; //5
		int size3 = i[1].length; //5
		
		System.out.println(size1); // 2차원 배열의 행의 갯수
		System.out.println(size2); // 0번째 행의 열의 대한 갯수
		System.out.println(size3); // 1번째 행의 열의 대한 객수
		
	}

}
