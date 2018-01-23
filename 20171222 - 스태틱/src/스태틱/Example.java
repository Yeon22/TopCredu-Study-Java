package 스태틱;

class Book{
	String name;
	static int price;
	static int count;
	
	Book(){
		count++;
	}
	
	void printInfo() {
		System.out.println(name+":"+price);
	}
}

public class Example {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.name = "Java";
		b1.price = 10000;
		
		b2.name = "C";
		b2.price = 15000;
		
		b1.printInfo();
		b2.printInfo();
		
		System.out.println("몇개 생성되었냐 : "+b1.count);
		Book.count = 3;
		System.out.println("카운트 : "+Book.count);

	}

}
