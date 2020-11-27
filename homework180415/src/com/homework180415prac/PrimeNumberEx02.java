package com.homework180415prac;

import java.util.*;

public class PrimeNumberEx02 extends Thread {
	
	int number;
	
	public PrimeNumberEx02(int number) {
		// TODO Auto-generated constructor stub
		
		this.number = number;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.print(number + "까지의 소수 : ");

		for (int i = 2; i <= number; i++) {
			int count = 1;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.print(i + " ");
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			try {
				
				System.out.print("수 입력 : "); // 7282 까지 됨
				int i = sc.nextInt();

				if (i < 2 || i > 7282) {
					System.out.println("입력 범위를 초과하셨습니다. 다시 입력해주세요.");
				} else {
					PrimeNumberEx01 pm = new PrimeNumberEx01(i);
					pm.start();
					return;
				}
				
			} catch (InputMismatchException im) {
				// TODO: handle exception
				
				sc = new Scanner(System.in);
				System.out.println("형식에 맞지 않게 입력하셨습니다. 다시 시도하세요.");
				
				
			}
			
			
		}

	}

}
