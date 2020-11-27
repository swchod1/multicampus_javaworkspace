package exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 사용자로부터 정수를 입력받아 총합을 구하는 프로그램 구현
 * 단, 0을 입력하면 종료시킬수 있도록 구현
 */

import java.util.*;


public class DoWhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		////////////////////////////////////////////////내가 한거
		int x, sum = 0;
		do {
			System.out.print("정수 입력(0 입력시 종료) : ");
			x = sc.nextInt();
			sum += x;
		} while (x != 0);
		
		System.out.print("입력하신 정수의 합계 : " + sum);
		
		
		/////////////////////////////////////////////// 강사님이 하신거
		/*int n, sum = 0;
		
		do {
			System.out.print("정수입력 (0)종료 : ");
			n = sc.nextInt();
			
			sum += n;
			
		} while (n != 0);
		
		System.out.println("총합계 : " + sum);*/
		
		
		
		
		/*BufferedReader br = new BufferedReader(
			    new InputStreamReader(System.in));*/
		
		/*System.out.print("행 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("열 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.printf("만드실 행렬은 %d X %d 행렬입니다.\n", a, b);*/
		

	}

}
