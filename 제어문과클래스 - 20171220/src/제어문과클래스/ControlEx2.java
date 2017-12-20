package 제어문과클래스;

public class ControlEx2 {

	public static void main(String[] args) {
		//랜덤값을 가져올 때
		int com = (int)(Math.random()*3); // 0~2 0 1 2
		int com2 = (int)(Math.random()*3+1); // 1 2 3
		int com3 = (int)(Math.random()*45+1); // 1~45
		
		System.out.println(com);
		System.out.println(com2);
		System.out.println(com3);
		
		Control2 con = new Control2();
		con.Print();

	}

}
