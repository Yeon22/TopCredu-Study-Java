package PracticeRPG;

import java.util.Scanner;

class InFo{
	String name;
	int hp;
	int attack;
}

public class PracticeRpg {
	
	public static InFo selectJob() {
		InFo Player = new InFo();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		System.out.print("직업을 선택하세요(1.전사 2.마법사 3.도둑) : ");
		input = sc.nextInt();
		
		switch(input) {
		case 1:
			Player.name = "전사";
			Player.hp = 200;
			Player.attack = 100;
			break;
		case 2:
			Player.name = "마법사";
			Player.hp = 150;
			Player.attack = 120;
			break;
		case 3:
			Player.name = "도둑";
			Player.hp = 180;
			Player.attack = 90;
			break;
		}
		
		return Player;
	}
	
	public static void PrintInfo(InFo Player) {
		System.out.println("직업 : " + Player.name);
		System.out.println("체력 : " + Player.hp + "\t공격력 : " + Player.attack);
		System.out.println("===============================");
	}
	
	public static void FieldName() {
		System.out.println("1.초보맵");
		System.out.println("2.중급맵");
		System.out.println("3.고급맵");
		System.out.println("4.전단계");
		System.out.println("===============================");
		System.out.print("맵을 선택하세요 : ");
	}
	
	public static void CreateMonster(InFo[] Monster) {
		Monster[0].name = "초보 몬스터";
		Monster[1].name = "중급 몬스터";
		Monster[2].name = "고급 몬스터";
		
		for(int i=0; i<3; i++) {
			Monster[i].hp = (i+1) * 200;
			Monster[i].attack = (i+1) * 30;
		}
	}
	
	public static void Fight(InFo Player, InFo Monster) {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			PrintInfo(Player);
			PrintInfo(Monster);
			System.out.print("1.공격   2.도망 : ");
			input = sc.nextInt();
			
			if(input == 1) {
				Player.hp -= Monster.attack;
				Monster.hp -= Player.attack;
				
				if(Player.hp <= 0) {
					Player.hp = selectJob().hp;
					break;
				}
			}
			
			if(input == 2 || Monster.hp <= 0) {
				break;
			}
		}
	}
	
	public static void Hunting(InFo Player) {
		InFo Monster[] = new InFo[3];
		for(int i=0; i<3; i++) {
			Monster[i] = new InFo();
		}
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			PrintInfo(Player);
			FieldName();
			input = sc.nextInt();
			
			if(input == 4) {
				break;
			}
			
			if(input <= 3) {
				CreateMonster(Monster);
				Fight(Player, Monster[input-1]);
			}
		}
	}

	public static void main(String[] args) {
		InFo Player;
		Player = selectJob();
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			PrintInfo(Player);
			System.out.print("1.사냥터  2.종료 : ");
			input = sc.nextInt();
			
			if(input == 2) {
				break;
			}else if(input == 1) {
				Hunting(Player);
			}
		}
	}

}
