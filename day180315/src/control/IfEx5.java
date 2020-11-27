package control;

import java.util.*;       

/*
 * 계산기
 * 첫수, 두번째 수, 연산자를 받아서 계산 
 * 
 * 마지막 연산자가 아님니다.
 */
public class IfEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c = 0;
		char q;
		
		System.out.print("첫 수 : ");
		a = sc.nextInt();
		System.out.print("연산자 : ");
		q = sc.next().charAt(0);
		System.out.print("두번째 수 : ");
		b = sc.nextInt();
		
		if (q == '+') {
			c = a + b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
		} else if (q == '-') {
			c = a - b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
		} else if (q == '*') {
			c = a * b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
		} else if (q == '/') {
			c = a / b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
		} else {
			System.out.println("잘못된 연산자를 입력하셨습니다.");
		}
		
		
		
		
		

	}

}
