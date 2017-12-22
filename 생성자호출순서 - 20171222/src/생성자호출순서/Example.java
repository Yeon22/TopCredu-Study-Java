package 생성자호출순서;

class A{
	int age;
	
	public A() {
		System.out.println("생성자 A실행");
	}
	public A(int age) {
		this.age = age;
		System.out.println("생성자A(age)"+age);
	}
}

class B extends A{
	public B() {
		System.out.println("생성자 B실행");
	}
	public B(int age) {
		super(age);
		System.out.println("인자 있는 생성자 B실행");
	}
}

class C extends B{
	public C() {
		System.out.println("생성자 C실행");
	}
	public C(int age) {
		super(age);
		System.out.println("인자 있는 생성자 C실행");
	}
}

public class Example {

	public static void main(String[] args) {
		C c = new C(200);

	}

}
