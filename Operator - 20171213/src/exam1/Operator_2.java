package exam1;

public class Operator_2 {

	public static void main(String[] args) {
		//x = x+y     ->     x+=y
		//x = x-y     ->     x-=y
		//x = x*y     ->     x*=y
		//x = x/y     ->     x/=y
		//x = x%y     ->     x%=y
		
		int a = 10;
		//변수 a가 담고 있는 값에 2를 더하고 그 값을 변수 a에 저장한다.
		a += 2;
		//a안의 내용을 시스템 콘솔에 출력하고 한줄 띄운다. 변수 a값 찍는다.
		System.out.println(a);
		
		//변수 a가 담고 있는 값을 5로 나눈 나머지를 변수 a에 저장한다.
		a %= 5;
		System.out.println(a);
		
	}

}
