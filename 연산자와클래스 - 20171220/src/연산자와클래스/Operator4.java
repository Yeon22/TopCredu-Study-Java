package 연산자와클래스;

public class Operator4 {
	int a = 10;
	int b = 4;
	int c = 0;
	
	void SetA(int sa) {
		a = sa;
	}
	
	void SetB(int sb) {
		b = sb;
	}
	
	void Plus() {
		c = a + b;
		System.out.println("a + b = "+c);
	}
	
	void Minus() {
		c = a - b;
		System.out.println("a - b = "+c);
	}
	
	void Multiply() {
		c = a * b;
		System.out.println("a * b = "+c);
	}
	
	void Divide() {
		c = a / b;
		System.out.println("a / b = "+c);
	}
	
	void Remainder() {
		c = a % b;
		System.out.println("a % b = "+c);
	}

}
