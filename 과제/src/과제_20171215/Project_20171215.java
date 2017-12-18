package 과제_20171215;

import java.util.Scanner;

public class Project_20171215 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		1. 크기가 10인 배열에 숫자 10개를 저장한 다음 전체 합계를 출력하시오.
		
		int i[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("배열 크기 : "+i.length);
		int total = i[0]+i[1]+i[2]+i[3]+i[4]+i[5]+i[6]+i[7]+i[8]+i[9];
		System.out.print("합게 : "+total);
		
//		2. 국어 , 영어, 수학 점수를 배열로 입력받아서 평균을 소수점2자리까지 구해서 출력하시오.
		
		int score[] = new int[3];
		
		System.out.print("국어, 영어, 수학 점수를 차례로 입력하여 주세요. : ");
		score[0] = s.nextInt();
		score[1] = s.nextInt();
		score[2] = s.nextInt();
		
		int total2 = score[0]+score[1]+score[2];
		float avg = total2/3.0f;
		
		System.out.printf("평균은 : "+"%.2f \n", avg);
		
//		3. 3행3열 배열을 만들어서
//		   아래처럼 출력하세요.
//
//		   01 02 03
//
//		   04 05 06
//
//		   07 08 09
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.printf("%02d ", arr[0][0]);
		System.out.printf("%02d ", arr[0][1]);
		System.out.printf("%02d \n", arr[0][2]);
		System.out.printf("%02d ", arr[1][0]);
		System.out.printf("%02d ", arr[1][1]);
		System.out.printf("%02d \n", arr[1][2]);
		System.out.printf("%02d ", arr[2][0]);
		System.out.printf("%02d ", arr[2][1]);
		System.out.printf("%02d \n", arr[2][2]);
		
//		4. 회원정보를 문자열 배열로 입력받고 출력해보세요.
//		   이름,주소,직업,나이
		
		String member[] = new String[4];
		System.out.print("이름을 입력해주세요 : ");
		member[0] = s.nextLine();
		System.out.print("주소를 입력해주세요 : ");
		member[1] = s.nextLine();
		System.out.print("직업을 입력해주세요 : ");
		member[2] = s.nextLine();
		System.out.print("나이를 입력해주세요 : ");
		member[3] = s.nextLine();
		
		System.out.println("이름 : "+member[0]);
		System.out.println("주소 : "+member[1]);
		System.out.println("직업 : "+member[2]);
		System.out.println("나이 : "+member[3]);
		
//		5. 비정방형 배열 사용하여 2차원 배열을 만들고 
//		   출력을 해보세요.
//		   10 11 12
//		   20 21
//		   30 31 32
//		   40 41
		
		int i2[][];
		i2 = new int[4][];
		i2[0] = new int[3];
		i2[1] = new int[2];
		i2[2] = new int[3];
		i2[3] = new int[2];
		
		i2[0][0] = 10;
		i2[0][1] = 11;
		i2[0][2] = 12;
		i2[1][0] = 20;
		i2[1][1] = 21;
		i2[2][0] = 30;
		i2[2][1] = 31;
		i2[2][2] = 32;
		i2[3][0] = 40;
		i2[3][1] = 41;
		
		System.out.printf("%2d ",i2[0][0]);
		System.out.printf("%2d ",i2[0][1]);
		System.out.printf("%2d \n",i2[0][2]);
		System.out.printf("%2d ",i2[1][0]);
		System.out.printf("%2d \n",i2[1][1]);
		System.out.printf("%2d ",i2[2][0]);
		System.out.printf("%2d ",i2[2][1]);
		System.out.printf("%2d \n",i2[2][2]);
		System.out.printf("%2d ",i2[3][0]);
		System.out.printf("%2d ",i2[3][1]);
		
	}

}
