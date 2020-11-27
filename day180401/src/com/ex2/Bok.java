package com.ex2;

import java.util.*;

public class Bok {

	///////////////////// 3차(원금 입력+클래스 쪼개보기+복리) ///////////////////////
	
	
	private int won;
	private int year;
	double interarr[], wonarr[];
	
	Scanner sc = new Scanner(System.in);

	void input() {
		// TODO Auto-generated method stub
		
		int won, year;
		

		do {

			System.out.print("원금을 입력하세요 > ");
			won = sc.nextInt();
			System.out.print("기간을 입력하세요 > ");
			year = sc.nextInt();
			if (won < 0 || year < 0) {
				System.out.println("정보를 잘 못 입력하셨습니다. 다시 입력해 주세요.");
			}

		} while (won < 0 || year < 0);
		
		this.won = won;
		this.year = year;

	}

	
	void inter() {
		// TODO Auto-generated method stub

		double interarr[] = new double[year];
		double wonarr[] = new double[year];

		for (int i = 0; i < interarr.length; i++) {
			interarr[i] = this.won * 0.045;
			wonarr[i] = this.won + interarr[i];
			this.won = (int)wonarr[i];
		}
		
		this.interarr = interarr;
		this.wonarr = wonarr;

	}
	
	
	void write() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < year; i++) {
			
			System.out.printf("||%d년차 복리이자 : %d원|| || %d년차 말 총액 : %d원||\n", i+1, (int) interarr[i], i+1, (int)(wonarr[i]));
			
		}
		
		System.out.printf("만기시 총 수령액(복리적용) : %d원\n", won);
		System.out.println();
		
		
	}
}
