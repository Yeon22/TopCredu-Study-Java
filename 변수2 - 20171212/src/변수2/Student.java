package 변수2;

public class Student {

	public static void main(String[] args) {
		//이름 : 홍길동
		//나이: 28
		//키 : 173.9
		//성별: 남자
		//직업: 회사원 
		//뒤의 데이터는 변수명으로 만들어서 이 내용을 출력문으로 출력하기

		
		String name = "홍길동";
		int age = 28;
		float height = 173.9f;
		String sex = "남자";
		String job = "회사원";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + sex);
		System.out.println("직업 : " + job);
	}

}
