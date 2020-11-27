package com.ex3;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{78, 48, 78, 98}, {99, 92}, {29, 64, 83}, {34, 78, 92, 56}};
		
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i = 0; i < arr.length; i++) {
			int tot = 0;
			int avg = 0;			
			for(int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];		
			}
			System.out.println(i+1+"행의 합 : " + tot);	
			System.out.println(i+1+"행의 평균 : " + tot/arr[i].length);
		}
		

	}

}
