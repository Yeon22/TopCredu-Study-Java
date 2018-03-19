package TextRPGFinal;

import java.util.Scanner;

public class CPlayer {
	//이름
	//공격력
	//체력
	private CInfo m_tInfo = new CInfo();
	
	public CInfo GetInfo() {
		return m_tInfo;
	}
	
	public void SetDamage(int iAttack) {
		m_tInfo.iHp -= iAttack;
	}
	
	public void SetHp(int iHp) {
		m_tInfo.iHp = iHp;
	}
	
	public void SelectJob() {
		System.out.print("직업을 선택하세요(1.기사  2.마법사  3.도적) : ");
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		iInput = sin.nextInt();
		
		switch(iInput) {
		case 1:
			m_tInfo.strName = "기사";
			m_tInfo.iHp = 100;
			m_tInfo.iAttack = 10;
			break;
		case 2:
			m_tInfo.strName = "마법사";
			m_tInfo.iHp = 100;
			m_tInfo.iAttack = 10;
			break;
		case 3:
			m_tInfo.strName = "도적";
			m_tInfo.iHp = 100;
			m_tInfo.iAttack = 10;
			break;
		}
	}
	
	public void Render() {
		System.out.println("======================");
		System.out.println("직업명 : "+m_tInfo.strName);
		System.out.println("체력 : "+m_tInfo.iHp);
		System.out.println("공격력 : "+m_tInfo.iAttack);
	}
	
	public CPlayer() {
		
	}
}
