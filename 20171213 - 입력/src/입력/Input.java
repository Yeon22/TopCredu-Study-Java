package 입력;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//ctrl + shift + o
		//입력을 위한 명령어 줄
		Scanner a = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		System.out.println("나이 : "+a.nextInt());

		Scanner b = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		System.out.println("당신의 주소는 : "+b.nextLine());


	}

}
