package 과제_20171218;

public class Project_20171218_중급 {

	public static void main(String[] args) {
//		1. 구구단을 만들고 
//		2 x 1 = 1 2 x 2 = 4 .......2 x 9 = 18
//		3 x 1 = 3 3 x 2 = 6 ......
//		4 x 1 = 4 4 x 2 = 8 ......
//		출력을 가로로 출력해주세요.	
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+" x "+j+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
		
//		2. 1~20까지 5의 배수만 출력하기 for문
		for(int i=1; i<21; i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
		
//		3. 구구단을 세로로 출력하기 그림참고!
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+" x "+i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
		

//		4.다음과 같은 형태로 출력하시오.이중 for문 사용
//		*
//		**
//		***
//		****
//		*****


//		*****
//		****
//		***
//		**
//		*
		
		
// 	      *
//  	 **
//  	***
//     ****
//	  *****
//
//
//	  *****
// 	   ****
//      ***
//   	 **
//        *

		

	}

}
