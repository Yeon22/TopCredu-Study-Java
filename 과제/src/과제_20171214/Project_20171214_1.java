package 과제_20171214;

import java.util.Scanner;

public class Project_20171214_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		1번 문제
//		int grades = 0;
//		System.out.print("성적 : ");
//		grades = s.nextInt();
//		
//		if (grades>=90 && grades<=100) {
//			System.out.println("A");
//		} else if(grades>=80 && grades<=89) {
//			System.out.println("B");
//		} else if(grades>=70 && grades<=79) {
//			System.out.println("C");
//		} else if(grades>=60 && grades<=69) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		
//		2번문제
//		String fruit = "";
//		System.out.print("과일 : ");
//		fruit = s.nextLine();
//		switch(fruit) {
//		case "사과":
//			System.out.println("1000원");
//			break;
//		case "배":
//			System.out.println("2000원");
//			break;
//		case "딸기":
//			System.out.println("500원");
//			break;
//		case "귤":
//			System.out.println("300원");
//			break;
//		}
		
		
//		3번문제
//		String fruit2 = "";
//		System.out.print("과일 : ");
//		fruit2 = s.nextLine();
//		int count = 0;
//		System.out.print("갯수 : ");
//		count = s.nextInt();
//		switch(fruit2) {
//		case "사과":
//			System.out.println(count*1000+"원입니다.");
//			break;
//		case "배":
//			System.out.println(count*2000+"원입니다.");
//			break;
//		case "딸기":
//			System.out.println(count*500+"원입니다.");
//			break;
//		case "귤":
//			System.out.println(count*300+"원입니다.");
//			break;
//		}
		
		
//		4번문제
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0.0f;
		
		System.out.print("국어 점수 : ");
		kor = s.nextInt();
		System.out.print("영어 점수 : ");
		eng = s.nextInt();
		System.out.print("수학 점수 : ");
		math = s.nextInt();
		
		total = kor+eng+math;
		System.out.println("총점 : "+total);
		avg = total/3.0f;
		System.out.println("평균 : "+avg);
		
		if(avg>=90 && avg<=100) {
			System.out.println("A");
		} else if(avg>=80 && avg<=89) {
			System.out.println("B");
		} else if(avg>=70 && avg<=79) {
			System.out.println("C");
		} else if(avg>=60 && avg<=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
