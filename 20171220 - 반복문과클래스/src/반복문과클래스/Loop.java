package 반복문과클래스;

import java.util.Scanner;

public class Loop {
	Scanner s = new Scanner(System.in);
	
	//5명의 학생의 국어점수 수학점수 영어점수를 입력받기
	int iKor = 0;
	int iEng = 0;
	int iMath = 0;
	
	//입력이 이뤄지는 메소드
	void Score() {
			System.out.print("국어점수 : ");
			iKor = s.nextInt();
			System.out.print("영어점수 : ");
			iEng = s.nextInt();
			System.out.print("수학점수 : ");
			iMath = s.nextInt();
	}
	
	//출력
	void ScorePrint() {
		System.out.println("국어점수 : "+iKor);
		System.out.println("영어점수 : "+iEng);
		System.out.println("수학점수 : "+iMath);
	}

}
