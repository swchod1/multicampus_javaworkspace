package com.sum;

import java.util.*;


public class Hap {
	
	// 입력
	private int su; // 입력 받은 수를 저장할 변수
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("정수 입력 : ");
			su = sc.nextInt();
			
		} while (su < 1 || su > 100 );
		// 1 이하 이거나 100이상 이면 루프가 종료
	}
	
	
	// 계산
	public int sum() {
		int s = 0; // 결과를 저장할 변수
		for(int i = 0; i <= this.su; i++) {
			s += i; 
		}		
		return s;
	}
	
	
	
	// 출력
	
    public void write(int a) {
		System.out.println("1 ~ " + su + "까지의 합계 : " + a );
	}

}
