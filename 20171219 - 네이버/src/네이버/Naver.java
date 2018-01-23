package 네이버;

public class Naver {

	public static void main(String[] args) {
		System.out.println("네이버에 오신것을 환영합니다.");
		Join member = new Join();
		
		member.id = "abcd";
		member.pw = "*****";
		member.pwCheck = "*****";
		member.name = "홍길동";
		member.mf = '남';
		member.phone = "010-3333-3333";
		member.phoneCheck = "5678";
		member.emailCheck = "abcd@naver.com";
		
		//출력하기
		member.Print();
		
		String pen = member.가입하기("펜을 던졌습니다.");
		System.out.println(pen);
		
		
		//메소드
		//함수
		
//		void 함수명() {
//			
//		}
		
//		int 합수명(int a){
//			return 1;
//		}
		
	}

}
