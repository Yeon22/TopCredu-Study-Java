package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
//		6.탑크리에듀 회원가입 프로그램 만들기
//		ID : 
//		PW : 
//		성별 : 
//		취미 : 
//		생일 :
//		나이 : 
//		이메일 :
//		을 입력받고 출력하세요.
		
		Scanner s = new Scanner(System.in);
		
		String ID = "";
		String PW = "";
		String 성별 = "";
		String 취미 = "";
		String 나이 = "";
		String 이메일 = "";
		
		//byte -> short ->int-> long->float ->double
		//char 
		//String 클래스 참조변수 (int)나이
		//Integer.parsInt(String)
		
		System.out.print("ID : ");
		ID = s.nextLine();
		
		System.out.print("PW : ");
		PW = s.nextLine();
		
		System.out.print("성별 : ");
		성별 = s.nextLine();
		
		System.out.print("취미 : ");
		취미 = s.nextLine();
		
		System.out.print("나이 : ");
		나이 = s.nextLine();
		int a = Integer.parseInt(나이);
		
		System.out.print("이메일 : ");
		이메일 = s.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
