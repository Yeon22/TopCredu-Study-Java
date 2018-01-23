package 생성자;

public class Person {
	String name;
	int age;
	
	//함수의 이름이 같고 매개변수, 인자 갯수가 다르면 
	//함수 오버로딩

	//기본생성자 안만들면 자동으로 만들어진다.
	//생성자 오버로딩
	Person() { //앞에 public은 붙여도 되고 생략해도 된다.
		name = "철수";
		age = 17;
	}
	
	//인자 있는 생성자 수동으로 만들어줘야된다.
	//기본생성자 자동으로 안만들어짐.
	//생성자 오버로딩
	Person(String sName, int iAge){
		name = sName;
		age = iAge;
	}

}
