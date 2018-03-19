package TextRPGFinal;

import java.util.Scanner;

//클래스들을 관리하는 역할
public class CMainGame {
	private CPlayer m_pPlayer = null;
	private CField m_pField = null;
	Scanner sin = new Scanner(System.in);
	
	public void Initialize() {
		if(m_pPlayer == null) {
			m_pPlayer = new CPlayer();
			m_pPlayer.SelectJob();
		}
	}
	
	public void Progress() {
		int iInput = 0;
		
		while(true) {
			m_pPlayer.Render();
			System.out.print("1.사냥터  2.종료 : ");
			iInput = sin.nextInt();
			
			if(iInput == 2)
				break;
			
			if(iInput == 1) {
				if(m_pField == null) {
					//사냥터 생성
					m_pField = new CField();
					//사냥터에 플레이어를 넣어줘야한다.
					m_pField.SetPlayer(m_pPlayer);
				}
				//사냥터의 프로그래스 함수를 만들어서 
				m_pField.Progress();
			}
		}
	}
	
	public CMainGame() {
		
	}
}
