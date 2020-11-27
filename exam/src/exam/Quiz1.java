package exam;

/*
 * 2차원 배열을 이용하여 구현하시오.
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 
 * 
 * 
 * num = 5
 *   
 *   i = 0 1 2 3 4 (줄 번호)
 *   n = 5 4 3 2 1 (숫자)
 * 
 */

import java.util.*;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// 입력 ///
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("행을 입력하세요 : ");
		x = sc.nextInt();
		System.out.print("열을 입력하세요 : ");
		y = sc.nextInt();
		
		int i, j, k;
		int aa[][] = new int [x][y];
		
		
		for (i = 0, k = 0; i < aa.length; k += y, i++) {
			for (j = 0; j < aa[i].length; j++) {
				if (i % 2 != 0) {
					aa[i][j] = 2*k - j;
				} else {					
					aa[i][j] = k + j + 1;
				}
			}
		}
		
		
		
		
		
/*		int i, j, k;
		int aa[][] = new int [4][5];
		
		
		for (i = 0, k = 0; i < aa.length; k += 10, i++) {
			for (j = 0; j < aa[i].length; j++) {
				if (i % 2 != 0) {
					aa[i][j] = k - j + 5;
				} else {					
					aa[i][j] = k + j + 1;
				}
			}
		}*/
		
/*		for (i = 0; i < aa.length; i ++) {
			for ( j = 0; j < aa[i].length; j++) {
				aa[i][j] = k;
			}
		}*/
		
		
		
		for (i = 0 ; i < aa.length ; i++) {
			for (j = 0; j < aa[i].length; j++) {
				System.out.printf(aa[i][j]+"\t");
			}
			System.out.println();
		}
		
		//////////// 강사님이 하신거///////////
		
/*		int [][] arr = new int[4][5];
		int n=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i%2 == 0) {
					arr[i][j] = n;
					n++;
					System.out.print(arr[i][j]+" ");
				} else {
					arr[i][j] = (i+1)*5-j;
					n++;
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}*/

	}

}
