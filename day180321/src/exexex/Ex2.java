package exexex;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//피라미드
		
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.print("층 수 : ");
		x = sc.nextInt();
		
		
		
		for (int i = 0; i <= x - 1; i++) {
			for (int j = 0; j <= 2 * (x - 1); j++) {
				if (i + j >= x - 1 && j - i <= x - 1) {
					if ( j <= x-1) {
						System.out.print((x-1)-j);
					} else {
						System.out.print(j-(x-1));
					}
				} else {
					System.out.print("n");
				}
			}
			System.out.println();
		}
		
		
		
		
		//층 입력
		/*for (int i = 0; i <= x-1; i++) {
			for (int j = 0, k = 1, l = -1; j <= 2*(x-1); j++) {
				if (i + j < x-1 || j - i > x-1) {
					System.out.print("n");
				} else {
					k += l;
					System.out.print(i+k);
					if (i+k == 0) {
						l=1;
					}
					
				}
			}
			System.out.println();
		}*/
		
		
		//10층	
		/*for (int i = 0; i <= 9; i++) {
			for (int j = 0, k = 1, l = -1; j <= 18; j++) {
				if (i + j < 9 || j - i > 9) {
					System.out.print("n");
				} else {
					k += l;
					System.out.print(i+k);
					if (i+k == 0) {
						l=1;
					}
					
				}
			}
			System.out.println();
		}*/

	}

}
