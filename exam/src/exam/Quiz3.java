package exam;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 구현하시오.
 * 20 16 12 8 4
 * 19
 * 
 */

import java.util.*;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		int i, j;
		int aa[][] = new int [4][5];
		
		
		for (i = 0; i < aa.length; i ++) {
			for ( j = 0; j < aa[i].length; j++) {
				aa[i][j] =  aa.length*aa[i].length -i-4*j;
			}
		}
			
		for (i = 0 ; i < aa.length ; i++) {
			for (j = 0; j < aa[i].length; j++) {
				System.out.printf(aa[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		///// 입력
		
/*        Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("행을 입력하세요 : ");
		x = sc.nextInt();
		System.out.print("열을 입력하세요 : ");
		y = sc.nextInt();
		
		int i, j;
		int aa[][] = new int [x][y];
		
		
		for (i = 0; i < aa.length; i ++) {
			for ( j = 0; j < aa[i].length; j++) {
				aa[i][j] =  aa.length*aa[i].length -i-4*j;
			}
		}
			
		for (i = 0 ; i < aa.length ; i++) {
			for (j = 0; j < aa[i].length; j++) {
				System.out.printf(aa[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		
		///////////////강사님이 하신거 /////////////////////
		
		
		int [][] arr = new int[4][5];
		int n = 20;
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n -= 4;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
			n +=19;
		}
		

	}

}
