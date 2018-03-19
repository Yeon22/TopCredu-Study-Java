package TextRPGFinal;

import java.util.Scanner;

public class CField {
	private CPlayer m_pPlayer;
	private CMonster m_pMonster;
	
	Scanner sin = new Scanner(System.in);
	
	public void SetPlayer(CPlayer pPlayer) {
		m_pPlayer = pPlayer;
	}
	
	public void DrawMap() {
		System.out.println("1.초보맵");
		System.out.println("2.중수맵");
		System.out.println("3.고수맵");
		System.out.println("4.이전 단계");
		System.out.println("=======================");
		System.out.print("맵을 선택하세요 : ");
	}
	
	//몬스터 이름, 체력, 공격력을 받아서 생성하는 함수
	CMonster Create(String _strName, int _iHp, int _iAttack) {
		CMonster pMonster = new CMonster();
		CInfo tMonster = new CInfo();
		tMonster.strName = _strName;
		tMonster.iHp = _iHp;
		tMonster.iAttack = _iAttack;
		
		pMonster.SetMonster(tMonster);
		
		return pMonster;
	}
	
	//팩토리 메소드 패턴
	public void CreateMonster(int iInput) {
		switch(iInput) {
		case 1:
			m_pMonster = Create("초보몹", 30, 3);
			break;
		case 2:
			m_pMonster = Create("중수몹", 60, 6);
			break;
		case 3:
			m_pMonster = Create("고수몹", 90, 9);
			break;
		}
	}
	
	public void Fight() {
		int iInput = 0;
		
		while(true) {
			m_pPlayer.Render();
			m_pMonster.Render();
			
			System.out.print("1.공격  2.도망 : ");
			iInput = sin.nextInt();
			
			if(iInput == 1) {
				m_pPlayer.SetDamage(m_pMonster.GetMonster().iAttack);
				m_pMonster.SetDamage(m_pPlayer.GetInfo().iAttack);
				
				if(m_pPlayer.GetInfo().iHp <= 0) {
					m_pPlayer.SetHp(100);
					break;
				}
			}
			
			if(iInput == 2 || m_pMonster.GetMonster().iHp <= 0) {
				m_pMonster = null;
				break;
			}
		}
	}
	
	public void Progress() {
		int iInput = 0;
		
		while(true) {
			m_pPlayer.Render();
			//사냥터 맵
			DrawMap();
			iInput = sin.nextInt();
			
			if(iInput == 4)
				break;
			
			if(iInput <= 3) {
				//몬스터 생성
				CreateMonster(iInput);
				//싸움
				Fight();
			}
		}
	}
}
