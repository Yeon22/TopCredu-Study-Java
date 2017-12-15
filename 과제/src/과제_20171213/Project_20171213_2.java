package 과제_20171213;

import java.util.Scanner;

public class Project_20171213_2 {

	public static void main(String[] args) {
		Scanner ID = new Scanner(System.in);
		System.out.println("ID를 입력해주세요.");
		System.out.println("ID : "+ID.nextLine());

		Scanner PW = new Scanner(System.in);
		System.out.println("PW를 입력해주세요.");
		System.out.println("PW : "+PW.nextLine());
		
		Scanner gender = new Scanner(System.in);
		System.out.println("성별을 입력해주세요.");
		System.out.println("성별 : "+gender.nextLine());
		
		Scanner hby = new Scanner(System.in);
		System.out.println("취미를 입력해주세요.");
		System.out.println("취미 : "+hby.nextLine());
		
		Scanner birth = new Scanner(System.in);
		System.out.println("생일을 입력해주세요.");
		System.out.println("생일 : "+birth.nextLine());
		
		Scanner age = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		System.out.println("나이 : "+age.nextInt());
		
		Scanner email = new Scanner(System.in);
		System.out.println("이메일을 입력해주세요.");
		System.out.println("이메일 : "+email.nextLine());

	}

}
