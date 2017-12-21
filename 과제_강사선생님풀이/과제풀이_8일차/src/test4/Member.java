package test4;

import java.util.Scanner;

public class Member {
	//중급
	//5. Member클래스를 만드시오.
	//멤버변수 : name, address, job, age
	//멤버함수 : showInfo() - 전체 데이터 출력
	
	String name;
	String address;
	String job;
	int age;
	Scanner s = new Scanner(System.in);
	
	void Input() {
		System.out.print("이름을 입력하세요 : ");
		name = s.nextLine();
		System.out.print("주소을 입력하세요 : ");
		address = s.nextLine();
		System.out.print("직업을 입력하세요 : ");
		job = s.nextLine();
		System.out.print("나이을 입력하세요 : ");
		age = s.nextInt();
	}
	
	void ShowInfo() {
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("일 : "+job);
		System.out.println("나이 : "+age);
	}
	
	
}
