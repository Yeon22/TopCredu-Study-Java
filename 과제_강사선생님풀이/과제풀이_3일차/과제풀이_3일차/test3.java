package 과제풀이_3일차;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
//		1. 국어, 영어, 수학 점수를 입력받고 총점을 출력하세요.
//		2. 국어, 영어, 수학 점수를 입력받고 평균을 출력하세요. 
//		 (소수점까지 정확한 값이 나올수 있게 해보세요.)
		Scanner s = new Scanner(System.in);
		int iKor = 0;
		int iEng = 0;
		int iMath = 0;
		int iTotal = 0;
		float fAvg = 0.0f;
		
		System.out.print("국어 영어 수학 : ");
		iKor = s.nextInt();
		iEng = s.nextInt();
		iMath= s.nextInt();
		System.out.println("국어 : "+iKor+"영어 : "+iEng+"수학 : "+iMath);
		iTotal = iKor + iEng + iMath;
		System.out.println("총점 : "+iTotal);
		fAvg  = iTotal/3.0f;
		System.out.println("평균 : "+fAvg);
		//쉬었다가 이어서...
		
	}

}
