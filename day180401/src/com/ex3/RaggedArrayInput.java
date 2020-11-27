package com.ex3;

import java.util.*;

public class RaggedArrayInput {

	///////////////////// 2차(입력 + 클래스) ///////////////////////
	
	Scanner sc = new Scanner(System.in);
	int x;
	int[][] arr;
	
	void input1() {
		int x;
		
		System.out.print("만들고자 하는 행의 수를 입력하세요 > ");
		x = sc.nextInt();
		
		this.x = x;
		arr = new int[x][];

	}
	
	void input2() {
		int x;
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d행의 열의 수를 입력하세요 > ", i+1);
			x = sc.nextInt();
			this.arr[i] = new int[x];
			
		}
	}
	
	void input3() {
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d행, %d열의 수를 입력하세요 > ", i+1, j+1);
				int x = sc.nextInt();
				arr[i][j] = x;
			}
			
		}
	}
	
	

}
