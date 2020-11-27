package com.homework180415prac;

/*
 다음 조건을 만족하는 프로램을 작성하시오.

클래스 PrimeNumberEx 은 ~ n까지 지정된  소수를 구하야 출력하시오.
n값은 다음과 같이 구현한다.

생성자함수의 매개변수로 값을 받는다.

PrimeNumberEx pm = new PrimeNumberEx(20);
pm.start();

결과는 다음과 같음
20까지의 난수 : 2 3 5 7 11 13 17 19
*/

import java.util.*;

public class PrimeNumberEx01 extends Thread {
	
	int number;
	
	public PrimeNumberEx01(int number) {
		// TODO Auto-generated constructor stub
		
		this.number = number;
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.print(number + "까지의 소수 : ");
		
		for(int i = 2; i <= number; i++) {
			int count = 1;
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.print(i + " ");
			}
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("수 입력 : "); // 7282 까지 됨

		PrimeNumberEx01 pm = new PrimeNumberEx01(sc.nextInt());
		pm.start();

	}

}
