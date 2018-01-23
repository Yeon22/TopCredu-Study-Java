package 클래스상속연습;

class SmartPhone{
	private String name;
	private int price;
	
	//this.name
	//this 클래스 포인터
	//자기참조포인터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

//public 누구나 접근이 가능하게 해준다.
//private 자신밖에 못쓴다. 외부에서 사용불가

public class Example2 {

	public static void main(String[] args) {
		SmartPhone galaxy = new SmartPhone();
		galaxy.setName("홍길동");
		System.out.println(galaxy.getName());

	}

}
