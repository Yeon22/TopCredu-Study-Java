package test2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
//		1. 학생성적을 입력받고 0~100까지 수를 입력할수 있다고 할때
//		   입력값 예시 
//		   성적 : 
//
//		   성적을 90~100사이로 입력하면 A
//		   성적을 80~89사이로 입력하면 B
//		   성적을 70~79사이로 입력하면 C
//		   성적을 60~69사이로 입력하면 D
//		   그아래면 F로 출력하게 하세요.
//		   if문으로 구현해보기
//		  Scanner s = new Scanner(System.in);
//		  int Score =0;
//		  System.out.print("성적 : ");
//		  Score = s.nextInt();
//		  
//		  if(Score >=90 && Score <=100) {
//			  System.out.println("성적은 A 입니다.");
//		  }else if(Score >=80 && Score <=89) {
//			  System.out.println("성적은 B 입니다.");
//		  }else if(Score >=70 && Score <=79) {
//			  System.out.println("성적은 C 입니다.");
//		  }else if(Score >=60 && Score <=69) {
//			  System.out.println("성적은 D 입니다.");
//		  }else {
//			  System.out.println("성적은 F 입니다.");
//		  }
		  
		
//		  2. 과일가게에서 구입할 과일 이름을 입력 받고
//		   과일 :
//		   사과 는 1000원, 배는 2000원,딸기는 500원, 귤은 300원이 
//		   출력 되게 작성하시오.
		
//		  Scanner input = new Scanner(System.in);
//		  
//		  System.out.println("과일 : ");
//		  String fruit = input.nextLine();
//		  
//		  switch(fruit) {
//		  case "사과":
//			    System.out.println("1000원 입니다.");
//			  break;
//		  case "배":
//			    System.out.println("2000원 입니다.");
//			  break;
//		  case "딸기":
//			    System.out.println("500원 입니다.");
//			  break;
//		  case "귤":
//			    System.out.println("300원 입니다.");
//			  break;
//		  }
		  

//	3. 과일이름도 입력 받고 과일을 몇개까지 살지도 입력을 받아서
//
//   	과일 이름 : 
//   	갯수  : 
//   
//   	과일을 사야할때 가격이 얼마인지 출력하시오. 
		  
//		 Scanner input = new Scanner(System.in);
//		  
//		  System.out.println("과일 : ");
//		  String fruit = input.nextLine();
//		  System.out.println("갯수 : ");
//		  int amount = input.nextInt();
//		  int price = 0;
//		  switch(fruit) {
//		  case "사과":
//			  price = 1000;
//			  break;
//		  case "배":
//			  price = 2000;
//			  break;
//		  case "딸기":
//			  price = 500;
//			  break;
//		  case "귤":
//			  price = 300;
//			  break;
//		  }
//		  
//		  System.out.println(fruit+"지불하실 총 금액은 : "+(price * amount)+"원 입니다.");
//		  
		  

//	4. 국어,영어,수학 점수를 입력받고 총점과 평균을 구한뒤
//   	평균에 맞는 학점을 출력하시오.
//
//   	성적을 90~100사이로 입력하면 A
//   	성적을 80~89사이로 입력하면 B
//   	성적을 70~79사이로 입력하면 C
//   	성적을 60~69사이로 입력하면 D
//   	그아래면 F로 출력하게 하세요.
//   	if문으로 구현
		  
		  
//		  Scanner s = new Scanner(System.in);
//		  int iKor =0;
//		  int iEng =0;
//		  int iMath=0;
//		  int iTotal =0;
//		  float fAvg =0.0f;
//		  System.out.print("국어 : ");
//		  iKor = s.nextInt();
//		  System.out.print("영어 : ");
//		  iEng = s.nextInt();
//		  System.out.print("수학 : ");
//		  iMath = s.nextInt();
//		  
//		  iTotal = iKor+iEng+iMath;
//		  
//		  fAvg = (float)iTotal/3;
//		  
//		  
//		  if(fAvg >=90 && fAvg <=100) {
//			  System.out.println("성적은 A 입니다.");
//		  }else if(fAvg >=80 && fAvg <=89) {
//			  System.out.println("성적은 B 입니다.");
//		  }else if(fAvg >=70 && fAvg <=79) {
//			  System.out.println("성적은 C 입니다.");
//		  }else if(fAvg >=60 && fAvg <=69) {
//			  System.out.println("성적은 D 입니다.");
//		  }else {
//			  System.out.println("성적은 F 입니다.");
//		  }  
		  
		
//		  5. 국어,영어,수학 점수를 입력받고 총점과 평균을 구한뒤
//		   평균에 맞는 학점을 출력하시오.
//
//		   성적을 90~100사이로 입력하면 A
//		   성적을 80~89사이로 입력하면 B
//		   성적을 70~79사이로 입력하면 C
//		   성적을 60~69사이로 입력하면 D
//		   그아래면 F로 출력하게 하세요.
//		   switch문으로 구현
		  
//		 Scanner s = new Scanner(System.in);
//		  int iKor =0;
//		  int iEng =0;
//		  int iMath=0;
//		  int iTotal =0;
//		  float fAvg =0.0f;
//		  System.out.print("국어 : ");
//		  iKor = s.nextInt();
//		  System.out.print("영어 : ");
//		  iEng = s.nextInt();
//		  System.out.print("수학 : ");
//		  iMath = s.nextInt();
//		  
//		  iTotal = iKor+iEng+iMath;
//		  
//		  fAvg = (float)iTotal/3;
//		  int iAvg =(int)fAvg;
//		  switch(iAvg/10) {
//		  case 10:
//		  case 9:
//			  System.out.println("성적은 A 입니다.");
//			  break;
//		  case 8:
//			  System.out.println("성적은 B 입니다.");
//			  break;
//		  case 7:
//			  System.out.println("성적은 C 입니다.");
//			  break;
//		  case 6:
//			  System.out.println("성적은 D 입니다.");
//			  break;
//		  default:
//			  System.out.println("성적은 F 입니다.");
//			  break;
//		  }
		  
		
//		6. 1.스캐너를 이용해 숫자 두개를 입력받습니다.
//		   2.스캐너를 이용해 연산자 하나를 입력받습니다.
//		   입력 받을 수 있는 연산자는 +,-,*,/로 제한합니다.
//		   3.문자열를 입력받는 스캐너 기능은 .nextLine()이 오류가 날경우
//		    .next()를 사용합니다.
//		   4.입력받은 연산자에 해당하는 계산을 한 뒤, 결과를 출렵합니다.
//		   ex) 
//		   두개 숫자를 입력하세요. : 3 5
//		      연산자를 입력하세요. : +
//		   출력: 3 + 5 = 8 입니다.  
		
//		System.out.print("숫자 두개를 입력하세요. : ");
//		Scanner input = new Scanner(System.in);
//		int num1 = input.nextInt();
//		int num2 = input.nextInt();
//		System.out.print("연산자를 입력하세요. : ");
//		String op = input.next();
//		
//		if(op.equals("+")) {
//			System.out.println("결과는 "+num1+"+"+num2+"="+(num1+num2)+" 입니다.");
//		}else if(op.equals("-")) {
//			System.out.println("결과는 "+num1+"-"+num2+"="+(num1-num2)+" 입니다.");
//		}else if(op.equals("*")) {
//			System.out.println("결과는 "+num1+"*"+num2+"="+(num1*num2)+" 입니다.");
//		}else if(op.equals("/")) {
//			System.out.println("결과는 "+num1+"/"+num2+"="+(num1/num2)+" 입니다.");
//		}else {
//			System.out.println("다른기호는 지원안됨");
//		}
		

	}

}
