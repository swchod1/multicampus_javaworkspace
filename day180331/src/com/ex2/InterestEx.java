package com.ex2;

/*
다음 조건을 만족하는 프로그램을 작성하시오.
- 원금이 1,000,000인 경우, 예치 기간을 1년에서 10까지 매년 말에 받을 총 금액을 출력
- 년단위 단리이자 = 원금 * 이율(4.5%) * 년(예치기간) 
- 만기 시 총 수령액(단리적용) = 원금(1 + 이율(4.5%)  * 년(예치기간))*/

public class InterestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double won = 1000000;
		double inter=0;
		
		
		for (int i = 1; i <= 10; i++) {
			
			if(i == 10) {
				won = won * (1+ 0.045 * i);
				System.out.printf(i+"년차(만기시) 총 수령액(단리적용) : " + (int)won);
				break;
			}	
			
			inter = won*0.045*i;
			System.out.printf("%d년차 단리이자 : %d\n", i, (int)inter);		
			System.out.printf("%d년차 말 총액 : %d\n", i, (int)(won + inter));
			
		}

	}

}
