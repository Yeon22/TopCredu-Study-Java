package test3;

public class test2 {

	public static void main(String[] args) {
		
		//구구단
//		for(int i =2; i<10; i++)//i는 2~9 (앞에나올수)
//		{
//			for(int j =1; j<10;j++) //j는 1~9(단)
//			{
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		//구구단 세로
//		for(int i =1; i<10; i++)//i는 1~9 (뒤에나오게)
//		{
//			for(int j =2; j<10;j++) //j는 2~9(단)
//			{
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		
//		*
//		**
//		***
//		****
//		*****		
		
//		for(int i=0; i<5; i++) {
//			for(int j=0;j<5;j++) {
//				if(i>=j)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		for(int i=0; i<5; i++) {
//			for(int j=0;j<5;j++) {
//				if(i<=j)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		

//		*****
//		****
//		***
//		**
//		*
		
		
//		for(int i=0; i<5; i++) {
//			for(int j=0;j<5;j++) {
////				System.out.printf("%d%d ",i,j);
//				if(i+j<=4)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}	
		
		
		
//	     *
//	    **
//	   ***
//	  ****
//	 *****
	 
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
//				System.out.printf("%d%d ",i,j);
				if(i+j>=4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
		

	}

}
