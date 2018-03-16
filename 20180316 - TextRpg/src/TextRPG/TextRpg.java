package TextRPG;

import java.util.Scanner;

class Info{
	String strName;
	int iHp;
	int iAttack;
}

public class TextRpg {

	public static Info SelectJob() {
		Info tInfo = new Info();
		
		System.out.print("직업을 선택하세요(1.전사 2.마법사 3.도둑) : ");
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		iInput = sin.nextInt();
		
		switch(iInput) {
		case 1:
			tInfo.strName = "전사";
			tInfo.iHp = 100;
			tInfo.iAttack = 10;
			break;
		case 2:
			tInfo.strName = "마법사";
			tInfo.iHp = 100;
			tInfo.iAttack = 10;
			break;
		case 3:
			tInfo.strName = "도둑";
			tInfo.iHp = 100;
			tInfo.iAttack = 10;
			break;
		}
		
		return tInfo;
	}
	
	public static void Render(Info pInfo) {
		System.out.println("직업이름 : "+pInfo.strName);
		System.out.println("체력 : "+pInfo.iHp+"\t공격력 : "+pInfo.iAttack);
		System.out.println("=================================");
	}
	
	public static void DrawMap() {
		System.out.println("1. 초보맵");
		System.out.println("2. 중수맵");
		System.out.println("3. 고수맵");
		System.out.println("4. 전단계");
		System.out.println("=================================");
		System.out.print("맵을 선택하세요 : ");
	}
	
	public static void CreateMonster(Info[] Monster) {
		Monster[0].strName = "초보몹";
		Monster[1].strName = "중수몹";
		Monster[2].strName = "고수몹";
		
		for(int i=0; i<3; i++) {
			Monster[i].iAttack = (i+1) * 3;
			Monster[i].iHp = (i+1) * 30;
		}
	}
	
	public static void Fight(Info Player, Info Monster) {
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			Render(Player);
			Render(Monster);
			System.out.print("1.공격 2.도망 : ");
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
	
	//사냥터 함수
	public static void Field(Info Player) {
		//몬스터 배열 3개 선언
		Info Monster[] = new Info[3];
		for(int i=0; i<3; i++) { //몬스터 객체 배열
			Monster[i] = new Info();
		}
		
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			Render(Player);
			DrawMap();
			iInput = sin.nextInt();
			
			if(iInput == 4) {
				break;
			}
			
			if(iInput <= 3) {
				//초보맵 1번 눌렀을 때 초보몬스터. 초보몬스터[0]
				//중수맵 2번 눌렀을 때 초보몬스터. 중수몬스터[1]
				//고수맵 3번 눌렀을 때 초보몬스터. 고수몬스터[2]
				
				//몬스터를 생성하는 함수
				CreateMonster(Monster);
				
				//파이트 함수
				Fight(Player, Monster[iInput-1]);
			}
		}
	}
	
	public static void main(String[] args) {
		Info Player;
		Player = SelectJob();
		
		int iInput = 0;
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			//Render에 Player넣으면 Player정보
			Render(Player);
			System.out.print("1.사냥터 2.종료 : ");
			iInput = sin.nextInt();
			
			if(iInput == 2)
				break;
			
			if(iInput == 1) {
				//사냥터 함수
				Field(Player);
			}
		}
	}

}
