package PracticeTextRPGClass;

import java.util.Scanner;

class Inform{
	String name;
	int HP;
	int Attack;
	
	//직업 선택 함수
	public Inform selectJob() {
		System.out.print("원하시는 직업을 선택하세요(1.전사     2.마법사     3.도적) : ");
		int input = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		switch(input) {
		case 1:
			this.name = "전사";
			this.HP = 100;
			this.Attack = 20;
			break;
		case 2:
			this.name = "마법사";
			this.HP = 100;
			this.Attack = 22;
			break;
		case 3:
			this.name = "도적";
			this.HP = 100;
			this.Attack = 18;
			break;
		}
		
		return this;
	}
	
	public void Render(Inform pInform) {
		System.out.println("이름 : "+pInform.name);
		System.out.println("체력 : "+pInform.HP);
		System.out.println("공격력 : "+pInform.Attack);
		System.out.println("=========================================");
	}
	
	void Map() {
		System.out.println("1. 초보맵");
		System.out.println("2. 중급맵");
		System.out.println("3. 고급맵");
		System.out.println("4. 이전단계");
		System.out.println("=========================================");
		System.out.print("맵을 선택해주세요. : ");
	}
	
	public void Field(Inform Player) {
		Inform[] Monster = new Inform[3];
		for(int i=0; i<3; i++) {
			Monster[i] = new Inform();
		}
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Render(Player);
			Map();
			input = sc.nextInt();
			System.out.println();
			switch(input) {
			case 1:
				System.out.println("초보맵을 선택하였습니다. 몬스터가 나타났습니다!");
				System.out.println();
				break;
			case 2:
				System.out.println("중급맵을 선택하였습니다. 몬스터가 나타났습니다!");
				System.out.println();
				break;
			case 3:
				System.out.println("고급맵을 선택하였습니다. 몬스터가 나타났습니다!");
				System.out.println();
				break;
			}
			
			if(input == 4) {
				System.out.println("이전 단계로 돌아갑니다.");
				System.out.println();
				break;
			}
			
			if(input <= 3) {
				createMonster(Monster);
				Fight(Player, Monster[input-1]);
			}
		}
	}
	
	void createMonster(Inform[] Monster) {
		Monster[0].name = "초보 몬스터";
		Monster[1].name = "중급 몬스터";
		Monster[2].name = "고급 몬스터";
		
		for(int i=0; i<3; i++) {
			Monster[i].HP = (i+1)*20;
			Monster[i].Attack = (i+1)*10;
		}
	}
	
	public void Fight(Inform Player, Inform Monster) {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Render(Player);
			Render(Monster);
			System.out.print("1.공격     2.도망 : ");
			input = sc.nextInt();
			System.out.println();
			switch(input) {
			case 1:
				System.out.println("몬스터를 공격했습니다!");
				System.out.println();
				break;
			case 2:
				System.out.println("몬스터에게서 도망쳤습니다....");
				System.out.println("맵 선택으로 돌아갑니다.");
				System.out.println();
				break;
			}
			
			if(input == 1) {
				Monster.HP -= Player.Attack;
				Player.HP -= Monster.Attack;
				
				if(Player.HP <= 0) {
					Player.HP = 100;
					System.out.println("캐릭터가 사망하였습니다ㅠㅠ.");
					System.out.println("체력을 회복하고 맵 선택으로 돌아갑니다.");
					System.out.println();
					break;
				}
			}
			
			if(input == 2) {
				break;
			}else if(Monster.HP <= 0) {
				System.out.println("몬스터를 이겼습니다! 맵 선택으로 돌아갑니다.");
				System.out.println();
				break;
			}
		}
	}
	
	public void Progress() {
		Inform Player;
		Player = selectJob();
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Render(Player);
			System.out.print("1.사냥터     2.종료 : ");
			input = sc.nextInt();
			System.out.println();
			switch(input) {
			case 1:
				System.out.println("사냥터를 선택하였습니다.");
				System.out.println();
				break;
			}
			
			
			if(input == 2) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}else if(input == 1) {
				Field(Player);
			}
		}
	}
}

public class PracticeTextRpgClass {

	public static void main(String[] args) {
		Inform gamestart = new Inform();
		gamestart.Progress();
	}

}
