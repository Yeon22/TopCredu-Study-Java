package 변수2;

public class Student2 {

	public static void main(String[] args) {
		/* 변수로 담고
		 * "Hello"
		 * "Java"
		 * "Nice to meet you"
		 * "Bye"
		 * 
		 * 아래와 같이 출력
		 * 1. Hello Java Nice to meet you Bye
		 * 2. Hello
		 *    Java
		 *    Nice to meet you
		 *    Bye
		 */
		
		String a = "Hello";
		String b = "Java";
		String c = "Nice to meet you";
		String d = "Bye";
		String e = "   ";
		
		System.out.print("1. "+a+" "+b+" "+c+" "+d+"\n\n");
		System.out.println("2. "+a);
		System.out.println(e+b);
		System.out.println(e+c);
		System.out.println(e+d);
	}

}
