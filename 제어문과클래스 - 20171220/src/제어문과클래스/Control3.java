package 제어문과클래스;

import java.util.Scanner;

public class Control3 {
	char gender;
	String regNo = "";
	Scanner scanner = new Scanner(System.in);
	
	//메소드
	void Jumin() {
		System.out.print("당신의 주민번호를 입력하세요.(011231-1112248)> ");
		
		regNo = scanner.nextLine();
		
		gender = regNo.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
			break;
		}
	}

}
