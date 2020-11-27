package com.ex2;

public class DanCal extends DanInput {

	///////////////////// 3차(원금 입력+클래스 쪼개보기+복리) ///////////////////////
	
	double[] inter() {
		
		double interarr[] = new double[dan.getYear()];
		
		for(int i = 0; i < interarr.length; i++) {
			interarr[i] = dan.getWon() * 0.045 * (i+1);
		}
		
		return interarr;
	}	

}
