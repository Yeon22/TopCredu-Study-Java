package 연산자와클래스;

public class OperatorEx5 {

	public static void main(String[] args) {
		//반올림
		float a = Math.round(3.5f);
		System.out.println(a);
		
		
		//원하는 자리수 반올림 세번째 자리 방법
		double pi = 3.141592;
		double spi = Math.round(pi * 1000)/1000.0;
		System.out.println(spi);

	}

}
