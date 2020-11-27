package com.ex2;

public class DanWrite extends DanCal {

	///////////////////// 3차(원금 입력+클래스 쪼개보기+복리) ///////////////////////
	
	void write() {
		
		
		for(int i = 0; i < inter().length; i++) {
			
			System.out.printf("||%d년차 단리이자 : %d원|| || %d년차 말 총액 : %d원||\n", i+1, (int) inter()[i], i+1, (int) (dan.getWon() + inter()[i]));
			
		}
		
		System.out.printf("만기시 총 수령액(단리적용) : %d원\n", (int)(dan.getWon() + inter()[dan.getYear()-1]));
		System.out.println();

		
	}

}
