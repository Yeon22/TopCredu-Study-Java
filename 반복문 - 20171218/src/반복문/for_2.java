package 반복문;

public class for_2 {

	public static void main(String[] args) {
		// 개선된 for문
		//C# foreach문 유사한 형식이다.
		int[] myArr = {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i : myArr) {
			sum += i;
		}
		
		System.out.println(sum);

	}

}
