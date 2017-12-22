package 객체의타입구별;

class Person{};
class Student extends Person{};
class Researcher extends Person{};
class Professor extends Researcher{};

public class InstanceofExample {

	public static void main(String[] args) {
		Person jee = new Student();
		Person kim = new Professor();
		Person lee = new Researcher();
		
		if(jee instanceof Student) //jee는 Student 타입이므로 true
			System.out.println("jee는 Student 타입");
		if(jee instanceof Researcher) //jee는 Researcher 타입이 아니므로 false
			System.out.println("jee는 Researcher 타입");
		if(kim instanceof Student) //kim은 Student 타입이 아니므로 false
			System.out.println("kim은 Student 타입");
		if(kim instanceof Professor) //kim은 Professor 타입이므로 true
			System.out.println("kim은 Professor 타입");
		if(kim instanceof Researcher) //kim은 Researcher 타입이기도 하므로 true
			System.out.println("kim은 Researcher 타입");
		if(kim instanceof Person) //kim은 Person 타입이기도 하므로 true
			System.out.println("kim은 Person 타입");
		if(lee instanceof Professor) //lee는 Professor 타입이 아니므로 false
			System.out.println("lee는 Professor 타입");
		if("java" instanceof String) //"java"는 String 타입의 인스턴스이므로 true
			System.out.println("java는 String 타입");
	}

}
