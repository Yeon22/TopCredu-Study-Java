package 과제_20171215;

import java.util.Scanner;

public class Project_20171215_중급 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 1.세개의 정수를 배열로 입력받아서 큰수를 출력하시오.
		int arr[] = new int[3];
		int max = 0;
		System.out.print("세 개의 정수를 차례로 입력하세요. : ");
		int num1 = arr[0] = s.nextInt();
		int num2 = arr[1] = s.nextInt();
		int num3 = arr[2] = s.nextInt();
		if(num1 > num2 && num1 > num3) {
			max = num1;
		} else if(num2 > num1 && num2 > num3) {
			max = num2;
		} else if(num3 > num1 && num3 > num2) {
			max = num3;
		}
		System.out.println("가장 큰 수는 : "+max+" 입니다.");
		
//		2.세개의 정수를 배열로 입력받아서 작은수를 출력하시오.
		int arr2[] = new int[3];
		int min = 0;
		System.out.print("세 개의 정수를 차례로 입력하세요. : ");
		int num4 = arr2[0] = s.nextInt();
		int num5 = arr2[1] = s.nextInt();
		int num6 = arr2[2] = s.nextInt();
		if(num4 < num5 && num4 < num6) {
			min = num4;
		} else if(num5 < num4 && num5 < num6) {
			min = num5;
		} else if(num6 < num4 && num6 < num5) {
			min = num6;
		}
		
		System.out.println("가장 작은 수는 : "+min+" 입니다.");
		
//		3. 문자 배열을 이용해서 'h','e','l','l','o' 를 초기화 하세요.
//		 그 후 int형 배열 5개에 숫자를 입력 받습니다.
//		 입력은 숫자로 이어서 받습니다.
//		 하단처럼 결과가 나올수 있게 알고리즘을 작성합니다.
//		  ex)
//		숫자다섯개를 입력하세요 : 0 1 2 3 4
//		결과 : hello
//		숫자다섯개를 입력하세요 : 2 3 0 1 4
//		결과 : llheo 
//		숫자다섯개를 입력하세요 : 4 3 2 1 1
//		결과 : ollee
		
		char str[] = {'h','e','l','l','o'};
		int ii[] = new int[5];
		System.out.print("숫자 5개를 차례로 입력해주세요. : ");
		int n1 = ii[0] = s.nextInt();
		int n2 = ii[1] = s.nextInt();
		int n3 = ii[2] = s.nextInt();
		int n4 = ii[3] = s.nextInt();
		int n5 = ii[4] = s.nextInt();
		
		System.out.print("결과 : "+str[n1]+str[n2]+str[n3]+str[n4]+str[n5]);
		
	}

}
