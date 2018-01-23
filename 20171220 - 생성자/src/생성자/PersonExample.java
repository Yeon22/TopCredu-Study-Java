package 생성자;

//class Person{
//	String name;
//	int age;
//	
//	//생성자는 자기 클래스 이름의 함수다.
//	Person(){
//		name = "홍길동";
//		age = 24;
//	}
//}

public class PersonExample {

	public static void main(String[] args) {
		Person p = new Person("순신",22);
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		Person p2 = new Person();
		
		System.out.println(p2.name);
		System.out.println(p2.age);

	}

}
