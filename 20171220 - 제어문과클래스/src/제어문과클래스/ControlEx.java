package 제어문과클래스;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		int input;
		
		System.out.println("숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine(); // 3444
		input = Integer.parseInt(tmp); // 문자열을 정수로 변환
		
		System.out.println("Input : "+input);

	}

}
