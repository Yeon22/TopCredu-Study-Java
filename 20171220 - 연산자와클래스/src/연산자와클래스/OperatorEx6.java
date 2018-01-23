package 연산자와클래스;

import java.util.Scanner;

public class OperatorEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		System.out.println("문자 : "+ch);
		
	}

}
