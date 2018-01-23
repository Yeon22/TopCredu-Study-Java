package 오버라이딩2;

class CObj{
	void Obj() {
		System.out.println("부모함수");
	}
	void Init() {
		System.out.println("Obj");
	}
}

class CPlayer extends CObj{
	void Player() {
		System.out.println("자식함수");
	}
	void Init() {
		System.out.println("Player");
	}
}

class CWizard extends CPlayer{
	void Wizard() {
		System.out.println("손자함수");
	}
	void Init() {
		System.out.println("Wizard");
	}
}

public class OverMain {

	public static void main(String[] args) {
//		CObj pObj = new CObj();
//		pObj.Init(); // Obj
//		pObj.Obj();
//		
//		CObj pObj2 = new CPlayer();
//		pObj2.Init(); // Player
//		
//		CObj pObj3 = new CWizard();
//		pObj3.Init(); // Wizard
		
//		CObj pObj = new CObj();
//		pObj.Obj();
//		pObj.Init();
//		
//		CPlayer pObj2 = new CPlayer();
//		pObj2.Player();
//		pObj2.Obj();
//		pObj2.Init();
		
		CWizard pObj3 = new CWizard();
		pObj3.Obj();
		pObj3.Player();
		pObj3.Wizard();
		pObj3.Init();
		
		//업캐스팅
		CPlayer cp = pObj3;
		cp.Obj();
		cp.Player();
		cp.Init();

	}

}
