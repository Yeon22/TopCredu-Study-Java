package 클래스;

public class PersonExample {

	public static void main(String[] args) {
		Person a; //클래스 타입으로 선언
		
		a = new Person(); // 객체 만들었다. == 인스턴스 만들었다.

		a.name = "홍길동";
		a.age = 23;
		a.job = "백수";
		a.height = 180.3f;
		a.weight = 75.0f;
		a.area = "서울시 강남구";
		
		//클래스 선언 후 객체로 만듬
		Person Student = new Person();
		Person Student1 = new Person();
		Student.name = "홍길동";
		Student.age = 11;
		Student.job = "의적";
		Student.height = 175.0f;
		Student.weight = 80.0f;
		Student.area = "평양시";
		
		Student1.name = "이순신";
		Student1.age = 23;
		Student1.job = "장군";
		Student1.height = 177.0f;
		Student1.weight = 70.0f;
		Student1.area = "남양시";
		
		
//		System.out.println("사람 a의 이름은? "+a.name);
//		System.out.println("사람 a의 나이는? "+a.age);
//		System.out.println("사람 a의 직업은? "+a.job);
//		System.out.println("사람 a의 키는? "+a.height);
//		System.out.println("사람 a의 몸무게는? "+a.weight);
//		System.out.println("사람 a의 지역은? "+a.area);
//		System.out.println();
//		
//		System.out.println("사람 Student의 이름은? "+Student.name);
//		System.out.println("사람 Student의 나이는? "+Student.age);
//		System.out.println("사람 Student의 직업은? "+Student.job);
//		System.out.println("사람 Student의 키는? "+Student.height);
//		System.out.println("사람 Student의 몸무게는? "+Student.weight);
//		System.out.println("사람 Student의 지역은? "+Student.area);
//		System.out.println();
//		
//		System.out.println("사람 Student1의 이름은? "+Student1.name);
//		System.out.println("사람 Student1의 나이는? "+Student1.age);
//		System.out.println("사람 Student1의 직업은? "+Student1.job);
//		System.out.println("사람 Student1의 키는? "+Student1.height);
//		System.out.println("사람 Student1의 몸무게는? "+Student1.weight);
//		System.out.println("사람 Student1의 지역은? "+Student1.area);
//		System.out.println();
		
		
		
		//커피클래스 만든 후
		//객체로도 만들고
		//데이터를 넣어주고
		//출력도 하기
		Coffee cafe = new Coffee();
		cafe.name = "블루마운틴";
		cafe.smell = "초콜릿 향";
		cafe.taste = "신맛, 단맛, 쓴맛";
		cafe.price = 30;
		cafe.origin = "블루산";
		
		System.out.println("커피 이름은? "+cafe.name);
		System.out.println("커피 냄새는? "+cafe.smell);
		System.out.println("커피 맛은? "+cafe.taste);
		System.out.println("커피 가격은? "+cafe.price);
		System.out.println("커피 원산지는? "+cafe.origin);
		
	}

}
