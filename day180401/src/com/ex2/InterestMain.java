package com.ex2;

/*
다음 조건을 만족하는 프로그램을 작성하시오.
- 원금이 1,000,000인 경우, 예치 기간을 1년에서 10까지 매년 말에 받을 총 금액을 출력
- 년단위 단리이자 = 원금 * 이율(4.5%) * 년(예치기간) 
- 만기 시 총 수령액(단리적용) = 원금(1 + 이율(4.5%)  * 년(예치기간))*/

import java.util.*;


public class InterestMain {
    
	///////////////////// 2차(상수 사용 static final) ///////////////////////
	
	// static final long won = 1_000_000L;
	
    ///////////////////// 2차(상수 사용 static final) ///////////////////////	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ///////////////////// 1차(그냥 메인에서 다한거) ///////////////////////
		
		double won = 1000000;
		double inter=0;
		
		
		for (int i = 1; i <= 10; i++) {
			
			inter = won*0.045*i;
			System.out.printf("||%d년차 단리이자 : %d원|| || %d년차 말 총액 : %d원||\n", i, (int)inter , i, (int)(won + inter));		
			
		}
		
		System.out.printf("만기시 총 수령액(단리적용) :%d원 ", (int)(won+inter));
		
		
        ///////////////////// 1차(그냥 메인에서 다한거) ///////////////////////
		
		
		
        ///////////////////// 2차(상수 사용 static final) ///////////////////////
		
		/*
		double inter = 0;

		for (int i = 1; i <= 10; i++) {

			inter = won * 0.045 * i;
			System.out.printf("||%d년차 단리이자 : %d원|| || %d년차 말 총액 : %d원||\n", i, (int) inter, i, (int) (won + inter));

		}

		System.out.printf("만기시 총 수령액(단리적용) :%d원 ", (int)(won+inter));
		*/
		
        ///////////////////// 2차(상수 사용 static final) ///////////////////////
		
		
		
        ///////////////////// 3차(원금 입력+클래스 쪼개보기+복리) ///////////////////////
		/*
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("---이자 종류 선택---");
			System.out.println("||1. 단리||2.복리||3.종료||");
			System.out.print("선택 > ");
			int x = sc.nextInt();

			switch (x) {
			case 1 : 
				DanWrite dw = new DanWrite();

				dw.input();
				dw.inter();
				dw.write();
				break;
			case 2 : 
				Bok b = new Bok();

				b.input();
				b.inter();
				b.write();
				break;
			case 3 :
				System.out.println("프로그램 종료");
				System.exit(0);
			default :
				System.out.println("다시 선택해 주세요");
			}

		}
		*/


		
        ///////////////////// 3차(원금,기간 입력+클래스 쪼개보기+복리) ///////////////////////

	}

}
