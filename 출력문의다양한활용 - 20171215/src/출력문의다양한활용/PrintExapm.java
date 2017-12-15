package 출력문의다양한활용;

public class PrintExapm {

	public static void main(String[] args) {
		//문자, 정수값
		char a = 'A';
		System.out.printf("[%c] \n",'A'); //[A]
		System.out.printf("[%d] \n", 7); //%d int 가지고 온다.
		System.out.printf("[%5d] \n", 7); //%5d 5개의 공간을 미리 잡고 오른쪽 정렬을 해준다.
		System.out.printf("[%-5d] \n", 7); //%-5d 5개의 공간을 미리잡고 왼쪽 정렬을 해준다.
		System.out.printf("[%05d] \n", 7);
		System.out.printf("[%+d] \n", 12345); //%+d    +기호도 잘 뿌려준다.
		System.out.printf("[%d] \n", -12345);
		System.out.printf("[%d] \n", -12345); //%d 양수는 +생략, -는 나온다.
		
		//8진수, 16진수
		System.out.printf("[%x] \n", 0xff); //16진수를 표기해주는 출력포맷
		System.out.printf("[%X] \n", 0xff); //16진수를 표기 대문자
		System.out.printf("[%o] \n", 0123); //8진수 표기
		
		//소수점
		//소수점 자리수
		System.out.printf("[%f] \n", 3.141592); //실수형 포맷
		System.out.printf("[%5f] \n", 3.141592); 
		System.out.printf("[%.2f] \n", 3.141592);
		//총 20개의 자리수에 오른쪽 정렬하고 소수점 5째 자리까지
		System.out.printf("[%20.5f] \n", 3.141592);
		System.out.printf("[%-20.5f] \n", 3.141592);
		
		//문자열형
		System.out.printf("[%s] \n", "안녕하세요");
		System.out.printf("[%10s] \n", "안녕하세요");
		System.out.printf("[%-10s] \n", "안녕하세요");
		System.out.printf("[%2.2s] \n", "안녕하세요");
		System.out.printf("[%3.2s] \n", "안녕하세요");
		
		//\t는 탭이다.
		System.out.printf("\t %d" , 1);
	}

}
