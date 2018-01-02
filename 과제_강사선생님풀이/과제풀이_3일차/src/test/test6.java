package test;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		//숫자하나를 입력을 받아서
		//삼항연산자를 사용해서
		//홀인지 짝인지 판별 
		//짝이면 true   짝입니다. 
		//false  홀입니다.
		Scanner s = new Scanner(System.in);
		int a =0;
		System.out.print("숫자를 입력하세요 : ");
		a = s.nextInt();
		//삼항연산자
		String str = (a%2==0) ? "짝수입니다.":"홀수입니다.";
		System.out.println(str);

	}

}
