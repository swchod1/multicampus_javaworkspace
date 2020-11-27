package com.homworkdap180330;

public class HomeWorkEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{78, 48, 78, 98},
				{99, 92},
				{29, 64, 83},
				{34, 78, 92, 56}
		};
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.printf("\t합계 : %d, 평균 : %.2f\n", sum, (double)sum/arr[i].length);
		}
		
		

	}

}
