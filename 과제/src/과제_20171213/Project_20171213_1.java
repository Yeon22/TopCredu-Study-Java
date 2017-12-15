package 과제_20171213;

import java.util.Scanner;

public class Project_20171213_1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		Scanner p1 = new Scanner(System.in);
		Scanner p2 = new Scanner(System.in);
		System.out.println("숫자를 2번 입력해주세요.");
		a = p1.nextInt();
		b = p2.nextInt();
		System.out.println("두 수를 더한 값은 = "+(a+b)+" 입니다.");

		System.out.println("두 수를 뺀 값은 = "+(a-b)+" 입니다.");
		
		System.out.println("두 수를 곱한 값은 = "+(a*b)+" 입니다.");

		System.out.println("두 수를 나눈 값은 = "+(a/b)+" 입니다.");

		System.out.println("두 수를 나눈 나머지 값은 = "+(a%b)+" 입니다.");
	}

}
