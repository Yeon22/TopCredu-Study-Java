package 과제_20171213;

import java.util.Scanner;

public class Project_20171213_3 {

	public static void main(String[] args) {
		float nl = 0;
		float meth = 0;
		float eng = 0;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요.");
		nl = inp.nextFloat();
		System.out.println("수학점수를 입력하세요.");
		meth = inp.nextFloat();
		System.out.println("영어점수를 입력하세요.");
		eng = inp.nextFloat();
		
		System.out.println("총점은 : "+(nl+meth+eng));
		System.out.println("평균은 : "+(nl+meth+eng)/3);
		
	}

}

