package TextRPGClass;

import java.util.Scanner;

class Info{
	String strName;
	int iHp;
	int iAttack;
	
	//직업선택 함수
	public Info SelectJob() {
		//Info tInfo = new Info();
		System.out.print("직업을 선택하세요(1.전사  2.마법사  3.도둑) : ");
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		iInput = sin.nextInt();
		
		switch(iInput) {
		case 1:
//			tInfo.strName = "전사";
//			tInfo.iHp = 100;
//			tInfo.iAttack = 10;
			this.strName = "전사";
			this.iHp = 100;
			this.iAttack = 10;
			break;
		case 2:
			this.strName = "마법사";
			this.iHp = 100;
			this.iAttack = 10;
			break;
		case 3:
			this.strName = "도둑";
			this.iHp = 100;
			this.iAttack = 10;
			break;
		}
		return this;
	}
	
	void Render(Info pInfo) {
		System.out.println("직업이름 : "+pInfo.strName);
		System.out.println("체력 : "+pInfo.iHp+"\t공격력 : "+pInfo.iAttack);
		System.out.println("======================================");
	}
	
	void Drawmap() {
		System.out.println("1.초보맵");
		System.out.println("2.중수맵");
		System.out.println("3.고수맵");
		System.out.println("4.전단계");
		System.out.println("======================================");
		System.out.print("맵을 선택하세요 : ");
	}
	
	public void Field(Info Player) {
		//몬스터 배열3개 선언
		Info Monster[] = new Info[3];
		for(int i=0; i<3; i++) {
			Monster[i] = new Info();
		}
		
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			Render(Player);
			Drawmap();
			
			iInput = sin.nextInt();
			
			if(iInput == 4) {
				break;
			}
			
			if(iInput <= 3) {
				CreateMonster(Monster);
				Fight(Player, Monster[iInput-1]);
			}
		}
	}
	
	public void CreateMonster(Info[] Monster) {
		Monster[0].strName = "초보몹";
		Monster[1].strName = "중수몹";
		Monster[2].strName = "고수몹";
		
		for(int i=0; i<3; i++) {
			Monster[i].iAttack = (i+1)*3;
			Monster[i].iHp = (i+1)*30;
		}
	}
	
	public void Fight(Info Player, Info Monster) {
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			Render(Player);
			Render(Monster);
			System.out.print("1.공격     2.도망 : ");
			iInput = sin.nextInt();
			
			if(iInput == 1) {
				Player.iHp -= Monster.iAttack;
				Monster.iHp -= Player.iAttack;
				
				if(Player.iHp <= 0) {
					Player.iHp = 100;
					break;
				}
			}
			
			if(iInput == 2 || Monster.iHp <= 0) {
				break;
			}
		}
	}
	
	void Progress() {
		Info Player;
		Player = SelectJob();
		
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			Render(Player);
			System.out.print("1.사냥터    2.종료 : ");
			iInput = sin.nextInt();
			
			if(iInput == 2) {
				break;
			}
			
			if(iInput == 1) {
				//사냥터 함수
				Field(Player);
			}
		}
	}
}

public class TextRpgClass {

	public static void main(String[] args) {
		Info maingame = new Info();
		maingame.Progress();
	}

}
