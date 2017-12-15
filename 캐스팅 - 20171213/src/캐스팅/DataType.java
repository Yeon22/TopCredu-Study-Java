package 캐스팅;

public class DataType {

	public static void main(String[] args) {
		//byte -> short -> int -> long -> float -> double
		//작은곳에서 큰곳으로 자료형이 변환이 가능하다.
		//큰곳에서 작은곳으로 변환이 되게 만들 때 타입캐스팅이라는걸 해야한다.
		//소수점 있는 타입을 정수로 변환시 소수점 부분의 값이 짤릴 수 있다.
		
		int a = 10;
		double d = a;
		System.out.println(d);
		
		double d2 = 3.14;
		int b = (int)d2;
		System.out.println(b);

	}

}
