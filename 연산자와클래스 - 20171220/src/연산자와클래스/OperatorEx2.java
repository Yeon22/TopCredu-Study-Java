package 연산자와클래스;

public class OperatorEx2 {

	public static void main(String[] args) {
		Operator2 op2 = new Operator2();
		int a = 7;
		op2.Operation(a);
		op2.Print();
		
		Operator2 op3 = new Operator2();
		op3.PreOperation(a);
		op3.Print2();

	}

}
