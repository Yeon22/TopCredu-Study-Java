package 배열;

public class Array5 {

	public static void main(String[] args) {
		// 정방향 배열
		// 각 행의 열의 갯수가 같은 배열
		// int a[2][3]
		
		
		// 비정방형 배열
		// 각 행의 열의 갯수가 다른 배열
		// 비정방형 배열의 생성
		int i[][];
		i = new int[4][];
		i[0] = new int[1];
		i[1] = new int[2];
		i[2] = new int[3];
		i[3] = new int[4];
		
		//비정방형 배열 length
		System.out.println(i.length); //2차원 행의 갯수 4
		System.out.println(i[0].length); //0번째 행의 열의 갯수 1
		System.out.println(i[1].length); //1번째 행의 열의 갯수 2
		System.out.println(i[2].length); //2번째 행의 열의 갯수 3
		System.out.println(i[3].length); //3번째 행의 열의 갯수 4
		
	}

}
