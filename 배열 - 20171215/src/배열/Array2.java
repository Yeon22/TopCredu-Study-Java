package ¹è¿­;

public class Array2 {

	public static void main(String[] args) {
		
		int arr[][] = new int [2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		System.out.println("arr[0][0] = "+arr[0][0]);
		System.out.println("arr[0][1] = "+arr[0][1]);
		System.out.println("arr[0][2] = "+arr[0][2]);
		System.out.println("arr[1][0] = "+arr[1][0]);
		System.out.println("arr[1][1] = "+arr[1][1]);
		System.out.println("arr[1][2] = "+arr[1][2]);
		
		int arr2[][] = {
						{1,2,3},
						{4,5,6}
						};
		
		System.out.println("arr2[0][0] = "+arr2[0][0]);
		System.out.println("arr2[0][1] = "+arr2[0][1]);
		System.out.println("arr2[0][2] = "+arr2[0][2]);
		System.out.println("arr2[1][0] = "+arr2[1][0]);
		System.out.println("arr2[1][1] = "+arr2[1][1]);
		System.out.println("arr2[1][2] = "+arr2[1][2]);

	}

}
