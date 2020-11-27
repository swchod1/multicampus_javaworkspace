package com.ex3;

public class RaggedArrayCal extends RaggedArrayInput {

	///////////////////// 2차(입력 + 클래스) ///////////////////////
	
	
	void cal1() {
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
	
	
	
	
	void cal2() {
		
		
		for(int i = 0; i < arr.length; i++) {
			int tot = 0;		
			for(int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];		
			}
			System.out.print(i+1+"행의 합 : " + tot);	
			System.out.printf("\t평균 : %.2f\n", (double)tot/arr[i].length);
		}
		
	}

}
