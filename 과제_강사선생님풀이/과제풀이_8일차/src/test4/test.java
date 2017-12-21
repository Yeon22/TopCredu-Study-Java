package test4;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
//		1. 크기가 10인 배열에 숫자 10개를 저장한 다음 전체 합계를
//		    출력하시오. for문 사용

//		int nArr[] = {10,20,30,40,50,60,70,80,90,100};
//		int Sum = 0;
//		
//		for(int i=0; i<10;i++) {
//			Sum += nArr[i];
//		}
//
//		System.out.println("합계 : "+Sum);

		
		
		
//		2. 1번문제를 향상된 for문으로 출력하시오.
		
//		int nArr[] = {10,20,30,40,50,60,70,80,90,100};
//		int Sum = 0;
//		
//		for(int n : nArr) {
//			Sum +=n;
//		}
//		
//		System.out.println("합계 : "+Sum);
		
		
		
		
//		3. 키를 센티미터 단위로 입력하세요.
//		   출력 키가 m  cm 이시군요.
//		   입력 예시 ) 173
//		   1m 73cm
		
		Scanner s = new Scanner(System.in);
		System.out.print("키를 센티미터 단위로 입력하세요: ");
		int height = s.nextInt();
	
		System.out.printf("키가 %dm %dcm 입니다.",height/100,height%100);
		
		
		
//		4. 태어나서 지금까지 내가 먹은 밥값이
//		    얼마나 되는지 계산 하는 프로그램을 
//		   작성하세요. 나이는 사용자로부터입력
//		   받고 하루 3끼 식사를 하되 한끼 식사
//		   5천원으로 계산하세요.
		
		
//		int age; //나이입력받을 변수
//		int cost; //밥값
//		Scanner s = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 : ");
//		age  = s.nextInt();
//		cost = age * 365 * 3 * 5000;
//		System.out.printf("지금까지 밥값은 %d입니다.", cost);
		  
		  	
		
		
		
//		6. 5번에서 만든 Member클래스를 사용해서
//	  		"홍길동","이순신" 객체를 생성해보세요.
//
//		Member m = new Member();
//		m.name = "홍길동";
//		m.age = 23;
//		
//		Member m2 = new Member();
//		m2.name = "이순신";
//		m2.age = 45;
		
		
		
		
		
//		7. 5번클래스를 이용해서 이름,주소,직업,나이를 키보드로 입력받는
//			  함수와 출력하는 함수로 만들어서 출력하세요.

//		Member m = new Member();
//		m.Input();
//		m.ShowInfo();
		
		
//		8. 로또 번호 생성기를 완성하시오, for문, 배열 사용 (중복없이 만들어보기)
// 		배열  1~45 담고
		
		int iLotto[] = new int[45];
    
		for(int i=0; i<45; i++)
		{
			iLotto[i] = i+1;
		}
    
		//셔플   배열의 인덱스를 섞어준다.
		for(int i =0; i<100; i++)
		{
			int iFirst = (int)(Math.random()*45); //0~44
			int iSecond = (int)(Math.random()*45); //0~44
			int iDest =0;
    	
			iDest           = iLotto[iFirst];
			iLotto[iFirst]  = iLotto[iSecond];
			iLotto[iSecond] = iDest;
		}
    
    
		for(int i =0; i<6; i++){
			System.out.println(iLotto[i]);
		}
    
    
//		int a = 10;
//		int b = 20;
//		int c =0;
//		//서로 값을 바꾸는 스왚 기법
//		c = a;
//		a = b;
//		b = c;
//	    
//		System.out.println("a = "+a+"b = "+b);

	}

}
