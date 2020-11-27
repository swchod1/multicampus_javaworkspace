package com.ex3;

public class RaggedArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ///////////////////// 1차(그냥 메인에서 다한거) ///////////////////////
		
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
			for(int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];		
			}
			System.out.print(i+1+"행의 합 : " + tot);	
			System.out.printf("\t평균 : %.2f\n", (double)tot/arr[i].length);
			
		}
		
        ///////////////////// 1차(그냥 메인에서 다한거) ///////////////////////
		

		
		///////////////////// 2차(입력 + 클래스) ///////////////////////
		/*
		RaggedArrayCal ri = new RaggedArrayCal();
		
		ri.input1();
		ri.input2();
		ri.input3();
		ri.cal1();
		ri.cal2();
		*/

		///////////////////// 2차(입력 + 클래스) ///////////////////////
		
		
		
		
		

	}

}
