package »ó¼Ó;

public class test {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.name = "È«±æµ¿";
		p.age = 22;
		p.weight = 75.0f;
		
		System.out.println(p.eat());
		System.out.println(p.sleep());
		
		
		Student st = new Student();
		
		st.name = "È«ÁØ±â";
		st.age = 10;
		st.weight = 40.0f;
		st.stuNo = 10;
		
		System.out.println(st.eat());
		System.out.println(st.sleep());
		System.out.println(st.study());

	}

}
