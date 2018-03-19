package TextRPGFinal;

public class CMonster {
	private CInfo m_tMonster;
	
	public CMonster() {
		m_tMonster = new CInfo();
	}
	
	public void SetDamage(int iAttack) {
		m_tMonster.iHp -= iAttack;
	}
	
	public void SetMonster(CInfo tMonster) {
		m_tMonster = tMonster;
	}
	
	public CInfo GetMonster() {
		return m_tMonster;
	}
	
	public void Render() {
		System.out.println("======================");
		System.out.println("몬스터 이름 : "+m_tMonster.strName);
		System.out.println("체력 : "+m_tMonster.iHp);
		System.out.println("공격력 : "+m_tMonster.iAttack);
	}
}
