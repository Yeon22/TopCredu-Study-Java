package Iterator;

import java.util.Iterator;
import java.util.Vector;

import Iterator.Book;

class Book{
	String Title;
	String Author;
	String Company;
	int Price;
	
	public Book(String title, String author, String company, int price) {
		this.Title = title;
		this.Author = author;
		this.Company = company;
		this.Price = price;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Vector<Book> book = new Vector<Book>();
		
		book.add(new Book("Police man", "Mai", "Kyobo", 12700));
		book.add(new Book("Knight kill", "Murasaki", "Kyobo", 13000));
		book.add(new Book("papago", "Naver", "Kyobo", 10000));
		
		// 이터레이터 사용해보기
		Iterator<Book> it = book.iterator();
		while(it.hasNext()) {
			Book bk = it.next();
			System.out.println("책이름 : "+bk.Title);
			System.out.println("저자 : "+bk.Author);
			System.out.println("출판사 : "+bk.Company);
			System.out.println("가격 : "+bk.Price);
		}
	}

}
