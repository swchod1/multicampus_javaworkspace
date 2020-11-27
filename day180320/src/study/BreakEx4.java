package study;

import java.util.*;

public class BreakEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		int n; // 입력받은 변수
		int s; // 누적 변수
		int i; // for 문에서 사용할 변수
		
		while (true) {
			
			do {
				System.out.print("원하는 수 입력 : ");
				n = sc. nextInt();
				
			} while (n < 1 || n >100);
			
			s = 0;
			
			for(i = 1; i <= n; i++) {
				s +=i;
			}
			System.out.printf("1~%d 까지의 합계 : %d\n", n, s);
			
			System.out.print("\n 계속 진행하시겠습니까?[Y/N]");
			
			ch = sc.next().charAt(0);
			if(ch != 'Y' && ch != 'y') {
				break;
			}
		}
		

	}

}
