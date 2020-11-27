package com.ex2;

import java.util.*;

public class DanInput {

	///////////////////// 3차(원금 입력+클래스 쪼개보기+복리) ///////////////////////
	
	Scanner sc = new Scanner(System.in);
	
	Dan dan = new Dan();
	
	void input() {
		
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
		
		dan.setWon(won);
		dan.setYear(year);

	}
	
	

}
