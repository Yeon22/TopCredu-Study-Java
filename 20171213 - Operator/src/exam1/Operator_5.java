package exam1;

public class Operator_5 {

	public static void main(String[] args) {
		//논리연산자
		// ||  또는  or    (a==2) || (a==10) 
		// &&  그리고 and   (a>2) && (a<10)
		// !  ~아니다            !(a==2)
		
		int a = 10, b = 10;
		System.out.println((a==10)&&(b==5));
		System.out.println((a==10)||(b==5));
		System.out.println(!(a==10));

	}

}
