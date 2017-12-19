package 네이버;

//회원가입
public class Join {
	//필드
	String id;
	String pw;
	String pwCheck;
	String name;
	char mf;
	int birthday;
	String emailCheck;
	String phone;
	String phoneCheck;
	
	//메소드
	//출력하기 함수
	void Print() {
		System.out.println("네이버 아이디는? "+id);
		System.out.println("네이버 비번은? "+pw);
		System.out.println("생년월일은? "+birthday);
		System.out.println("이름은? "+name);
		System.out.println("성별은? "+mf);
		System.out.println("핸드폰 번호는? "+phone);
		System.out.println("이메일은? "+emailCheck);
	}
	//가입하기
	String 가입하기(String pen) {
		System.out.println(pen);
		System.out.println("가입하셨습니다.");
		return pen;
	}
}
