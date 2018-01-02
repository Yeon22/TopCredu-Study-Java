package 과제_20180102;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Book{
	String BookName;
	String Author;
	String Publisher;
	int Price;
	
	public Book(String bookname, String author, String publisher, int price) {
		this.BookName = bookname;
		this.Author = author;
		this.Publisher = publisher;
		this.Price = price;
	}
}

public class Project_20180102_초급 {

	public static void main(String[] args) {
//		1.책제목, 저자, 출판사, 가격을 ArrayList에 저장하고 출력하시오.
		ArrayList<Book> arr = new ArrayList<Book>();
		arr.add(new Book("Policeman", "Mai", "Kyobo", 12900));
		arr.add(new Book("Snowman", "Harry", "Kyobo", 15000));
		arr.add(new Book("Knightkill", "Murakami", "Kyobo", 16000));
		for(int i=0; i<arr.size(); i++) {
			System.out.println("책 제목은 : " + arr.get(i).BookName);
			System.out.println("저자는 : " + arr.get(i).Author);
			System.out.println("출판사는 : " + arr.get(i).Publisher);
			System.out.println("가격은 : " + arr.get(i).Price);
		}
		
		
//		2.책제목, 저자, 출판사, 가격을 ArrayList에 키보드로 입력을 해서
//		데이터를 입력하고  출력하시오. 
		ArrayList<Book> bk = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목을 입력하세요. : ");
		String name = sc.next();
		System.out.print("저자를 입력하세요. : ");
		String auth = sc.next();
		System.out.print("출판사를 입력하세요. : ");
		String pb = sc.next();
		System.out.print("가격을 입력하세요. : ");
		int pri = sc.nextInt();
			
		bk.add(new Book(name, auth, pb, pri));
		
		for(int i=0; i<bk.size(); i++) {
			System.out.println("책 제목은 : " + bk.get(i).BookName);
			System.out.println("저자는 : " + bk.get(i).Author);
			System.out.println("출판사는 : " + bk.get(i).Publisher);
			System.out.println("가격은 : " + bk.get(i).Price);
		}
		
		
//		3. Vector로 1에서 10까지 수를 담고 짝수만 출력하시오.
		Vector<Integer> vc = new Vector<Integer>();
		for(int i=1; i<11; i++) {
			vc.add(i);
		}
		for(int i=0; i<vc.size(); i++) {
			int result = vc.get(i);
			if(result%2 == 0) {
				System.out.println(result);
			}
		}
		
		
//		4. 키보드로 문자열을 입력 받아 ArrayList에 삽입하고 가장 짧은 이름을 출력하시오.
		ArrayList<String> str = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("이름을 입력하세요 : ");
			String pname = scanner.nextLine();
			str.add(pname);
		}
		
		int Minname = 0;
		for(int i=0; i<str.size(); i++) {
			if(str.get(Minname).length() < str.get(i).length()) {
				Minname = i;
			}
		}
		System.out.println("\n가장 짧은 이름은 : " + str.get(Minname));
		
	}

}
