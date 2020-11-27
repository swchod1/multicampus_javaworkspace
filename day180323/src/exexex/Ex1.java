package exexex;

import java.util.*;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.print("행렬을 입력하세요 : ");
		x = sc.nextInt();

		int arr[][] = new int[x][x];
		int n = 1, i, j, k;

		for (i = 0, k = 1; n <= x; i++) {
			for (j = 0; n <= x; j++) {
                
				
				if (j == arr[i].length - k) {
					for (i = k; i <= arr.length - k; i++) {
						arr[i][j] = n++;
					}
					k++;
				} else if (i == arr.length - k) {
					for (j = arr[i].length - k-1; j >= k; j--) {
						arr[i][j] = n++;
					}
					k++;
				} else if ((j == k) && i !=0) {
					for (i =  arr.length - k ; i >= k ; i--) {
						arr[i][j] = n++;
					}
					k++;
				} else {
					arr[i][j] = n++;
					k++;
				}

			}

		}
		
		
		for (i = 0 ; i < arr.length ; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}
