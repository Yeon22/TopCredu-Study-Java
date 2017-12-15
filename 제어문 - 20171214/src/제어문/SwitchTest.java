package 제어문;

public class SwitchTest {

	public static void main(String[] args) {
		
//		switch(/*정수, 문자열*/) {
//		case 0:
//			//처리할 명령 문장
//			break; //switch문장을 탈출한다.
//		case 1:
//			//처리할 명령 문장
//			break;
//		default:
//			//위에서 처리 못한 나머지 처리할 명령 문장
//			break;
//		}
		
//		int i = 1;
//		switch(i*5) {
//		case 0:
//			System.out.println("0");
//			break;
//		case 5:
//			System.out.println("5");
//			break;
//		case 10:
//			System.out.println("10");
//			break;
//		default:
//			System.out.println("모름");
//			break;
//		}
		
		//1.7이후
//		String day = "일요일";
//		
//		switch(day) {
//		case "일요일":
//			System.out.println("일요일");
//			break;
//		case "월요일":
//			System.out.println("월요일");
//			break;
//		case "화요일":
//			System.out.println("화요일");
//			break;
//		case "수요일":
//			System.out.println("수요일");
//			break;
//		case "목요일":
//			System.out.println("목요일");
//			break;
//		case "금요일":
//			System.out.println("금요일");
//			break;
//		case "토요일":
//			System.out.println("토요일");
//			break;
//		}
//		System.out.println("스위치문 나옴");
		
		String day = "월요일";
		//안전한 비교 문자열은 이 함수를 제공한다.
		
		if(day.equals("일요일")) {
			System.out.println("일요일");
		} else if(day.equals("월요일")) {
			System.out.println("월요일");
		} 

	}

}
