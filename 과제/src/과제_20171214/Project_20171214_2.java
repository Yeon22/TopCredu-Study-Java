package 과제_20171214;

import java.util.Scanner;

public class Project_20171214_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
//		5번 문제
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		int total = 0;
//		float avg = 0.0f;
//		
//		System.out.print("국어 점수 : ");
//		kor = s.nextInt();
//		System.out.print("영어 점수 : ");
//		eng = s.nextInt();
//		System.out.print("수학 점수 : ");
//		math = s.nextInt();
//		
//		total = kor+eng+math;
//		System.out.println("총점 : "+total);
//		avg = (float)total/3;
//		System.out.println("평균 : "+avg);
//		
//		switch((int)avg/10) {
//		case 10:
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		}
		
		
//		6번 문제
//		int first = 0;
//		int second = 0;
//		String operator = "";
//		
//		System.out.print("두 개의 숫자를 입력하세요. : ");
//		first = s.nextInt();
//		second = s.nextInt();
//		
//		System.out.print("연산자를 입력하세요. : ");
//		operator = s.next();
//		
//		if(operator.equals("+")) {
//			System.out.println("출력 : "+first+operator+second+" = "+(first+second)+" 입니다.");
//		} else if(operator.equals("-")) {
//			System.out.println("출력 : "+first+operator+second+" = "+(first-second)+" 입니다.");
//		} else if(operator.equals("*")) {
//			System.out.println("출력 : "+first+operator+second+" = "+(first*second)+" 입니다.");
//		} else if(operator.equals("/")) {
//			System.out.println("출력 : "+first+operator+second+" = "+(first/second)+" 입니다.");
//		} else {
//			System.out.println("연산자를 잘 못 입력하였습니다.");
//		}

		
//		7번 문제
		int first2 = 0;
		int second2 = 0;
		String operator2 = "";
		
		System.out.print("두 개의 숫자를 입력하세요. : ");
		first2 = s.nextInt();
		second2 = s.nextInt();
		
		System.out.print("연산자를 입력하세요. : ");
		operator2 = s.next();
		
		switch(operator2) {
		case "+":
			System.out.println("출력 : "+first2+operator2+second2+" = "+(first2+second2)+" 입니다.");
			break;
		case "-":
			System.out.println("출력 : "+first2+operator2+second2+" = "+(first2-second2)+" 입니다.");
			break;
		case "*":
			System.out.println("출력 : "+first2+operator2+second2+" = "+(first2*second2)+" 입니다.");
			break;
		case "/":
			System.out.println("출력 : "+first2+operator2+second2+" = "+(first2/second2)+" 입니다.");
			break;
		default:
			System.out.println("연산자를 잘 못 입력하였습니다.");
			break;
		}
	}

}
