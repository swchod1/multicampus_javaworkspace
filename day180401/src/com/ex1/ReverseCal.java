package com.ex1;

public class ReverseCal extends ReverseInput {
	
    ///////////////////// 2차(1차에서 한거 클래스 쪼개보기) ///////////////////////
	
	int[] reverse () {
		
		int arr[] = new int[jari()];
		int j = 0;
		do {
			
			arr[j] = num % 10  ;
			num /= 10;
			j++;
			
		} while (j < arr.length);
		
		return arr;
	}
	
	

}