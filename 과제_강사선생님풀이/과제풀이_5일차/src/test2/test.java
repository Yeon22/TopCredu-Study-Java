package test2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
//		1. 크기가 10인 배열에 숫자 10개를 저장한 다음 전체 합계를 출력하시오.
//		int arr[] = new int[10];
//		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		arr[5] = 6;
//		arr[6] = 7;
//		arr[7] = 8;
//		arr[8] = 9;
//		arr[9] = 10;
//		
//		int sum =0;
//		
//		sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+
//				arr[6]+arr[7]+arr[8]+arr[9];
//		
//		System.out.println("전체합계 : "+sum);
		
		

//		2. 국어 , 영어, 수학 점수를 배열로 입력받아서 평균을 소수점2자리까지 
//		구해서 출력하시오.
		
//		int student[] = new int[3];
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("국어점수를 입력하세요 : ");
//		student[0] = input.nextInt();
//		
//		System.out.println("영어점수를 입력하세요 : ");
//		student[1] = input.nextInt();
//		
//		System.out.println("수학점수를 입력하세요 : ");
//		student[2] = input.nextInt();
//		
//		
//		float fAvg = (float)(student[0]+student[1]+student[2])/3.0f;
//		
//		System.out.printf("평균 : %.2f", fAvg);
		
		
		
//		3. 3행3열 배열을 만들어서
//		   아래처럼 출력하세요.
//		   01 02 03
//		   04 05 06
//		   07 08 09	
		
//		int arr[][] = new int[3][3];
//		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//		
//		arr[2][0] = 7;
//		arr[2][1] = 8;
//		arr[2][2] = 9;
//
//		
//		System.out.printf("%02d", arr[0][0]);
//		System.out.printf(" %02d", arr[0][1]);
//		System.out.printf(" %02d\n", arr[0][2]);
//		
//		System.out.printf("%02d", arr[1][0]);
//		System.out.printf(" %02d", arr[1][1]);
//		System.out.printf(" %02d\n", arr[1][2]);
//		
//		System.out.printf("%02d", arr[2][0]);
//		System.out.printf(" %02d", arr[2][1]);
//		System.out.printf(" %02d\n", arr[2][2]);
		
		
		
//		4. 회원정보를 문자열 배열로 입력받고 출력해보세요.
//		   이름,주소,직업,나이
		
//		String info[] = new String[4];
//		Scanner input = new Scanner(System.in);
//		
//		
//		System.out.println("이름을 입력하세요 : ");
//		info[0] = input.nextLine();
//		
//		System.out.println("주소를 입력하세요 : ");
//		info[1] = input.nextLine();
//		
//		System.out.println("직업을 입력하세요 : ");
//		info[2] = input.nextLine();
//		
//		System.out.println("나이를 입력하세요 : ");
//		info[3] = input.nextLine();
//		
//		


//		5. 비정방형 배열 사용하여 2차원 배열을 만들고 
//  		 출력을 해보세요.
//   		10 11 12
//   		20 21   
//   		30 31 32
//   		40 41
		
//		int intArray[][] = new int[4][];
//		intArray[0] = new int[3];
//		intArray[1] = new int[2];
//		intArray[2] = new int[3];
//		intArray[3] = new int[2];
//		
//		intArray[0][0] = 10;
//		intArray[0][1] = 11;
//		intArray[0][2] = 12;
//		
//		intArray[1][0] = 20;
//		intArray[1][1] = 21;
//		
//		intArray[2][0] = 30;
//		intArray[2][1] = 31;
//		intArray[2][2] = 32;
//		
//		intArray[3][0] = 40;
//		intArray[3][1] = 41;
//		
//	//   10 11 12
//	//   20 21   
//	//   30 31 32
//	//   40 41
//		
//		System.out.printf("%2d %2d %2d\n", intArray[0][0],intArray[0][1],intArray[0][2]);
//		System.out.printf("%2d %2d\n", intArray[1][0],intArray[1][1]);
//		System.out.printf("%2d %2d %2d\n", intArray[2][0],intArray[2][1],intArray[2][2]);
//		System.out.printf("%2d %2d\n", intArray[3][0],intArray[3][1]);

		
		
//		1.세개의 정수를 배열로 입력받아서 큰수를 출력하시오.
//		2.세개의 정수를 배열로 입력받아서 작은수를 출력하시오.
		
//		Scanner s = new Scanner(System.in);
//		int Max[] = new int[3];
//		System.out.print("숫자를 입력하세요 : ");
//		Max[0] = s.nextInt();
//		Max[1] = s.nextInt();
//		Max[2] = s.nextInt();
//		
//		if(Max[0] > Max[1])
//		{
//			
//			if(Max[0]>Max[2])
//			{
//				System.out.println("Max[0]이 제일큽니다."+Max[0]);
//			}
//			else
//			{
//				System.out.println("Max[2]이 제일큽니다."+Max[2]);
//			}
//		}
//		else  //Max[1]
//		{
//			if(Max[1] > Max[2])
//			{
//				System.out.println("Max[1]이 제일큽니다."+Max[1]);
//			}
//			else
//			{
//				System.out.println("Max[2]이 제일큽니다."+Max[2]);
//			}
//		}
		
		
//		Scanner s = new Scanner(System.in);
//		int Max[] = new int[3];
//		System.out.print("숫자를 입력하세요 : ");
//		Max[0] = s.nextInt();
//		Max[1] = s.nextInt();
//		Max[2] = s.nextInt();
//		
//		if(Max[0] < Max[1])
//		{
//			
//			if(Max[0]<Max[2])
//			{
//				System.out.println("Max[0]이 제일작습니다."+Max[0]);
//			}
//			else
//			{
//				System.out.println("Max[2]이 제일작습니다."+Max[2]);
//			}
//		}
//		else  //Max[1]
//		{
//			if(Max[1] < Max[2])
//			{
//				System.out.println("Max[1]이 제일작습니다."+Max[1]);
//			}
//			else
//			{
//				System.out.println("Max[2]이 제일작습니다."+Max[2]);
//			}
//		}
//		
		

//		3. 문자 배열을 이용해서 'h','e','l','l','o' 를 초기화 하세요.
// 		그 후 int형 배열 5개에 숫자를 입력 받습니다.
// 		입력은 숫자로 이어서 받습니다.
// 		하단처럼 결과가 나올수 있게 알고리즘을 작성합니다.
//  		ex)
//		숫자다섯개를 입력하세요 : 0 1 2 3 4
//		결과 : hello
//		숫자다섯개를 입력하세요 : 2 3 0 1 4
//		결과 : llheo	
//		숫자다섯개를 입력하세요 : 4 3 2 1 1
//		결과 : ollee
		
	//문자 배열 초기화	
	char str[] = {'h','e','l','l','o'};
		
	int array[] = new int[5];
	
	Scanner in = new Scanner(System.in);
	
	System.out.print("숫자다섯개를 입력하세요 : ");
	array[0] = in.nextInt();
	array[1] = in.nextInt();
	array[2] = in.nextInt();
	array[3] = in.nextInt();
	array[4] = in.nextInt();
	
	//str[0]
	System.out.println(""+str[array[0]]
			+str[array[1]]
			+str[array[2]]
			+str[array[3]]
			+str[array[4]]);	

	}

}
