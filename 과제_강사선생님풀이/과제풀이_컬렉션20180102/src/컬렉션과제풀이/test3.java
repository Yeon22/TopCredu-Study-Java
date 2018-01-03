package 컬렉션과제풀이;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
//		4. 키보드로 문자열을 입력 받아 ArrayList에 삽입하고 가장 짧은 이름을 출력하시오.
		
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			a.add(s);
		}
		
		for(int i =0; i<a.size(); i++)
		{
			String name = a.get(i);
			System.out.println(name);
		}
		
		int lowIndex =0;
		
		for(int i =1; i<a.size(); i++) {
			if(a.get(lowIndex).length()>a.get(i).length()) {
				lowIndex = i;
			}
		}
		System.out.println("가장 짧은 이름은?"+a.get(lowIndex));
		
	}

}
