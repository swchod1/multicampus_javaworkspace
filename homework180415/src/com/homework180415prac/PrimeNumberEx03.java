package com.homework180415prac;

import java.util.*;

public class PrimeNumberEx03 extends Thread {
	
	ArrayList<Integer> pn = new ArrayList<Integer>();
	
	int number;
	
	public PrimeNumberEx03(int number) {
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
				pn.add(i);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);

		System.out.print("수 입력 : "); // 7282 까지 됨

		PrimeNumberEx03 pm = new PrimeNumberEx03(sc.nextInt());
		pm.start();
		
		try {
			pm.join();
		} catch (InterruptedException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}

		/*
		for (int i = 0; i < pm.pn.size(); i++) {
			System.out.print(pm.pn.get(i) + " ");
		}
		*/

		Iterator<Integer> it = pm.pn.iterator();

		while (it.hasNext()) {
			Integer i = it.next();
			System.out.print(i + " ");
		}

	}


}
