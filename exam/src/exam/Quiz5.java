package exam;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		
		int arr[][] = new int[4][];
		int n = 1;
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = new int [4-i];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		///////// 입력
		
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.print("층을 입력하세요 : ");
		x = sc.nextInt();

		int arr[][] = new int[x][];
		int n = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[x-i];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
