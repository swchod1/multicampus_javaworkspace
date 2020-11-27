package switchexam;


/*
 * 1년의 각 달의 일수를 출력하는 프로그램
 * 특정한 달이 입력되면 그달의 일수를 출력
 */

import java.util.*;


public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month; // 월
		int year; // 년
		int days = 0; // 일
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년의 입력 : ");
		year = sc.nextInt();
		
		System.out.print("월의 입력 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 :case 8 : case 10 :
			
		case 12 :
			days = 31;
			break;
		
		case 4 : case 6 : case 9 :
		
		case 11 :
			days = 30;
			break;
			
		case 2 :
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				days = 29;
			} else {
				days =28;
			}
			break;
			
		default :
			System.out.println("월이 잘못 입력되었습니다.");
			break;
			
		
		}
		
		System.out.println("당신이 입력하신 월의 날수는 " + days + "입니다.");
		
		
		
		
		
		
/*		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
			System.out.println("입력하신 년도 " + y + "는 윤년입니다.");
		} else {
			System.out.println("입력하신 년도 " + y + "는 평년입니다.");
		}*/

	}

}
