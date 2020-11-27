package com.homework180415;

import java.util.*;

public class PrimeNumberEx extends Thread {
	
	int number;
	
	public PrimeNumberEx(int number) {
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

		System.out.print("수 입력 : "); // 7282 까지 됨

		PrimeNumberEx pm = new PrimeNumberEx(sc.nextInt());
		pm.start();

	}

}
