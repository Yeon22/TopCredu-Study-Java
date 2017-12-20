package 연산자와클래스;

public class OperatorEx {

	public static void main(String[] args) {
		Operator oper = new Operator();
		oper.Operation(); //증가
		oper.Print(); //출력
		
		Operator plus = new Operator();
		plus.PreOperation();
		plus.Print();

	}

}
