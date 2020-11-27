package exam;


/*
 * 사용자로 부터 단을 입력받아 구구단을 출력하는 프로그램 작성
 * 단, 1 ~ 9단 사이의 수를 입력받은 상황이 아니라면 종료시켜라.
 */

import java.util.*;


public class DoWhileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/// 내가 한거
/*		int x = 0, y = 9;
		do {
			if (y == 9 || y == 0) {
			System.out.print("원하는 구구단을 입력하세요 : ");
			x = sc.nextInt();
			y = 9;			
			}
			if (x >= 10) {
				break;
			}
			System.out.printf("%d X %d = %d\n", x, 10-y, x*(10-y));
			y--;
			
		} while (y >= 0); 
		
		System.out.println("종료");*/
		
		
		////////////////////// 강사님이 하신거
		
		int n, i =1;
		
		System.out.print("원하는 단 입력 : ");
		n = sc.nextInt();
		
		if (n >= 2 && n<= 9 ) {
			do {
				System.out.println(n + "*" + i + "=" + n*i);
				i++;
			} while (i <= 9);
		}
		
		System.out.println();

	}

}
