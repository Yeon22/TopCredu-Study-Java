package exam1;

public class Operator_3 {

	public static void main(String[] args) {
		//++ 1을 더한다.   x++, ++x   변수x에 1을 더한다. (x = x + 1)
		//-- 1을 뺀다.    x--, --x   변수 x에서 1을 뺀다. (x = x - 1)
		//전위 ++a
		//후위 a++
		int a = 10, b = 10;
		System.out.println(++a);
		
		System.out.println(a++);
		
		System.out.println(--b);
		
		System.out.println(b--);

	}

}
