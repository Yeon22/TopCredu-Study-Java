package 과제_20171212;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//숫자 하나를 입력을 받아서 삼항 연산자를 사용해서
		//홀인지 짝인지 판별
		//짝이면 true	짝입니다.
		//홀이면 false	홀입니다.
		
		Scanner s = new Scanner(System.in);
		int a = 0;
		System.out.print("숫자를 입력해 주세요.");
		a = s.nextInt();
		String str = (a%2 == 0)?"짝수입니다.":"홀수입니다.";
		
		System.out.println(str);

	}

}
