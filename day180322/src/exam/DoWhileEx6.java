package exam;

/*
 * 짜장면, 짬뽕, 우동, 탕수육을 선택할 수 있는 메뉴를 만들어 출력하라
 * 단, 0번 메뉴를 종료
 * System.exit(0);
 * do~while + switch 사용
 */

import java.util.*;

public class DoWhileEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		// 내가 한거
/*		int x;
		do {
			One :
			System.out.println("*******메뉴*******");
			System.out.println("1.짜장면 2.짬뽕 3.우동 4.탕수육 0.종료");
			System.out.print("메뉴를 번호를 입력하세요 : ");
			x = sc.nextInt();
			
			switch (x) {
			case 0 :
				System.out.println("이용해 주셔서 감사합니다.");
				System.exit(0);
			case 1 : 
				System.out.println("선택하신 메뉴는 짜장면입니다.");
				break;
			case 2 : 
				System.out.println("선택하신 메뉴는 짬뽕입니다.");
				break;
			case 3 : 
				System.out.println("선택하신 메뉴는 우동입니다.");
				break;
			case 4 : 
				System.out.println("선택하신 메뉴는 턍수육입니다.");
				break;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요");
				break;
			}
		} while (true);*/
		
		
		/// 강사님이 하신거
		
		int n;
		String str="";
		
		do {
			System.out.print("1. 짜장면 2. 짬뽕 3. 우동 4. 탕수육 0. 종료 : ");
			n = sc.nextInt();
			
			switch (n) {
			case 0 :
				System.exit(0);
				break;
			case 1 : 
				str = "짜장면";
				break;
			case 2 :
				str = "짬뽕";
			case 3 :
				str = "우동";
			case 4:
				str = "탕수육";
			default :
				System.out.println("선택하신 메뉴가 없습니다.");
				break;
			}
			System.out.printf("당신이 선택한 메뉴는 %s 입니다.\n", str);
		} while (n >= 1 && n <=4);
		
		
		
		
		
/*     int menu = 0;
		
		do {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원조회");
			System.out.println("3. 회원탈퇴");
			System.out.println("0. 프로그램종료");
			
			System.out.print("메뉴를 선택하세요 : ");
			
			menu = System.in.read()-48;
			System.in.skip(2);
		} while (menu != 1 && menu != 2 && menu != 3 && menu != 0);
		
		System.out.println("당신이 선택한 오늘의 저녁메뉴는 : " + menu);*/
		
		
/*		switch ((int)(avg/10)) {
		case 10 :
			System.out.println("당신은 A 등급 입니다.");
			break;
		case 9 :
			System.out.println("당신은 A 등급 입니다.");
			break;
		case 8 :
			System.out.println("당신은 B 등급 입니다.");
			break;
		case 7 :
			System.out.println("당신은 C 등급 입니다.");
			break;
		case 6 :
			System.out.println("당신은 D 등급 입니다.");
			break;
		default :	
			System.out.println("당신은 F 등급 입니다.");
		}*/
		

	}

}
