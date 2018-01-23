package 연산자와클래스;

public class Operator {
	int i = 5;
	
	//증가를 하는 동작
	void Operation() {
		i++;
	}
	
	void PreOperation() {
		++i;
	}
	
	//출력 함수
	void Print() {
		System.out.println("i = "+i);
	}

}
