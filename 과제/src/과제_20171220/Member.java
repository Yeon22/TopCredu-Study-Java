package 과제_20171220;

import java.util.Scanner;

public class Member {
	
//	5. Member클래스를 만드시오.
//	멤버변수 : name, address, job, age
//	멤버함수 : showInfo() - 전체 데이터 출력
	
	String name;
	String address;
	String job;
	int age;
	
	void showInfo() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(job);
		System.out.println(age);
	}
	
//	7. 4번클래스를 이용해서 이름,주소,직업,나이를 키보드로 입력받는
//	함수와 출력하는 함수로 만들어서 출력하세요.
	Scanner s = new Scanner(System.in);
	
	void Input() {
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		System.out.print("나이를 입력하세요 : ");
		age = s.nextInt();
		System.out.print("직업을 입력하세요 : ");
		job = s.next();
		System.out.print("주소를 입력하세요 : ");
		address = s.next();
	}
	
	void Output() {
		System.out.println("이름은 : "+name);
		System.out.println("주소는 : "+address);
		System.out.println("직업은 : "+job);
		System.out.println("나이는 : "+age);
	}

}
