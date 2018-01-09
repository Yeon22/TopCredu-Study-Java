package 과제_20171212;

public class Test1 {

	public static void main(String[] args) {
		
		// 2017.12.12일 과제는 변수2 directory에 있음
		
		int x = 8;
		int y = 3;
		int result = x++ + --y - ++x + --x + y++;
		// 8 + 2 - 10 + 9 + 2;
		
		System.out.println(result);

	}

}

