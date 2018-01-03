package 컬렉션과제풀이;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	String BookName;
	String Name;
	String Publisher;
	int Price;
	
	public Book() {
	}
	
	public Book(String bookName, String name, String publisher, int price) {
		BookName = bookName;
		Name = name;
		Publisher = publisher;
		Price = price;
	}
}


public class test {

	public static void main(String[] args) {
//		1.책제목, 저자, 출판사, 가격을 ArrayList에 저장하고 출력하시오.
		
//		ArrayList<Book> arr = new ArrayList<Book>();
//		
//		arr.add(new Book("Policeman", "Mai", "Kyobo", 12900));
//		arr.add(new Book("Snowman", "Harry", "Kyobo", 15000));
//		arr.add(new Book("Knightkill", "Murakami", "Kyobo", 16000));
//		
//		for(int i =0; i<arr.size(); i++) {
//			System.out.println("책이름 : "+arr.get(i).BookName);
//			System.out.println("저자    : "+arr.get(i).Name);
//			System.out.println("출판사 : "+arr.get(i).Publisher);
//			System.out.println("가격    : "+arr.get(i).Price);			
//		}
		
		
		
//		2.책제목, 저자, 출판사, 가격을 ArrayList에 키보드로 입력을 해서
//		데이터를 입력하고  출력하시오.
		
		ArrayList<Book> arr = new ArrayList<Book>();
		Scanner s = new Scanner(System.in);
		
		for(int i =0; i<3; i++) {
			Book b = new Book();
			System.out.println((i+1)+" 책이름 : ");
			b.BookName = s.next();
			System.out.println((i+1)+" 저자 : ");
			b.Name = s.next();
			System.out.println((i+1)+" 출판사: ");
			b.Publisher = s.next();
			System.out.println((i+1)+" 가격 : ");
			b.Price = s.nextInt();
			arr.add(b);
		}
		
		for(int i =0; i<arr.size(); i++) {
			System.out.println("책이름 : "+arr.get(i).BookName);
			System.out.println("저자    : "+arr.get(i).Name);
			System.out.println("출판사 : "+arr.get(i).Publisher);
			System.out.println("가격    : "+arr.get(i).Price);			
		}
		
	}

}
