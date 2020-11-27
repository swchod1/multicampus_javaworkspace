package exex;

/*
 * 사용자로 부터 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지 판별하는 
 * 프로그램을 작성
 * 년도가 4의 배수이면서 100의 배수가 아니 거나 400의 배수이면 윤년 그렇지 않으면 평년
 *     (y%100 != 0) && (y%400 == 0)          (y % 400 == 0)
 *  임의의 연도 2000 윤년  (y%100 != 0) && (y%400 == 0)
 */

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        int y;

		System.out.print("입력 년도 : ");
		y = sc.nextInt();

		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
			System.out.println("입력하신 년도 " + y + "는 윤년입니다.");
		} else {
			System.out.println("입력하신 년도 " + y + "는 평년입니다.");
		}
		
		
/*		if (y % 400 == 0) {
			System.out.println("입력하신 년도 " + y + "는 윤년입니다.");
		} else if ((y % 4 == 0) && (y % 100 != 0)) {
			System.out.println("입력하신 년도 " + y + "는 윤년입니다.");
		} else {
			System.out.println("입력하신 년도 " + y + "는 평년입니다.");
		}*/
		
/*		String a = (y % 400 == 0) ? "윤년" : ((y % 4 == 0) && (y % 100 != 0)) ?  "윤년" : "평년";
		System.out.printf("입력 하신 년도 %d는 %s입니다.", y, a);*/
		
		String a = (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) ? "윤년" : "평년";
		System.out.printf("입력 하신 년도 %d는 %s입니다.", y, a);
		
		

	}

}
