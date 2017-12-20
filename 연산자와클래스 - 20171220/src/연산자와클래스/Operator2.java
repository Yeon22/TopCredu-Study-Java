package 연산자와클래스;

public class Operator2 {
	int i=0, j=0;
	
	//후위 연산
	void Operation(int a) {
		i = a;
		j = i++;
	}
	
	//전위 연산
	void PreOperation(int a) {
		i = a;
		j = ++i;
	}
	
	//출력
	void Print(){
		System.out.println("j = i++; 실행 후, i="+i+", j="+j);
	}
	
	void Print2(){
		System.out.println("j = ++i; 실행 후, i="+i+", j="+j);
	}

}
