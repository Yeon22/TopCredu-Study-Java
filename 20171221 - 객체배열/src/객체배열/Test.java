package 객체배열;

import java.util.Scanner;

class Member{
	String name;
	String address;
	String job;
	int age;
	
	public void ShowInfo() {
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("일    : "+job);
		System.out.println("나이 : "+age);
	}
}

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Member MemArr[] = new Member[6];
		
		for(int i=0; i<MemArr.length; i++) {
			MemArr[i] = new Member();
			System.out.print("이름을 입력하세요 : ");
			MemArr[i].name = s.next();
			System.out.print("주소를 입력하세요 : ");
			MemArr[i].address = s.next();
			System.out.print("하는일을 입력하세요 : ");
			MemArr[i].job = s.next();
			System.out.print("나이를 입력하세요 : ");
			MemArr[i].age = s.nextInt();
		}
		
		for(int i=0; i<MemArr.length;i++) {
			MemArr[i].ShowInfo();
		}

	}

}
