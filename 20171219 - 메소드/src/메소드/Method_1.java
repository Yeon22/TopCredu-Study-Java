package 메소드;

class test{
	void Hello() {
		System.out.println("하이");
		System.out.println("헬로우 함수다.");
	}
	
	// String hi = "하이";
	void Hello_2(String hi) {
		System.out.println(hi);
		System.out.println("헬로우 함수2다.");
	}
	
	String Hello_3(String hi) {
		System.out.println(hi);
		hi = "벽돌";
		return hi;
	}
}

public class Method_1 {

	public static void main(String[] args) {
		// void 함수명(){
		//		작업할 코드
		// }
		
		test t = new test();
		t.Hello();
		System.out.println("헬로함수 끝나고 일루왔다.");
		
		t.Hello_2("하이");
		System.out.println("헬로함수2 끝나고 일루왔다.");
		
		String a = t.Hello_3("하이");
		System.out.println(a);

	}

}
