package com.homworkdap180330;

public class HomeWorkEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double rt = 0.045;
		double ori = 1_000_000, total;
		
		for(int i = 1; i <= 10; i++) {
			
			total = ori * (1+rt*i);
			System.out.printf("%2d년 총 금액 : %.2f\n", i , total);
			
		}

	}

}
