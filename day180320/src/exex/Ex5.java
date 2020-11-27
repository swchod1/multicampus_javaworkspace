package exex;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 */
		
		
/*		int i, j, a;

		System.out.print("행 입력 : ");
		a = sc.nextInt();

		for (i = 0; i <= a-1; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
	
		/*
		 *    ***** 
         *    **** 
         *    *** 
         *    ** 
         *    *
		 */
		
/*		int i, j, a;

		System.out.print("행 입력 : ");
		a = sc.nextInt();

		for (i = 0; i <= a-1 ; i++) {
			for (j = a-1; j >= 0; j--) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println("");
		}*/
		
	int i, j, a;

		System.out.print("행 입력 : ");
		a = sc.nextInt();
		
		for (i = 0; i <=  a-1; i++) {
			for (j = a-1; j >= 0; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
					
			}
			System.out.println("");
		}

		
		

	}

}
