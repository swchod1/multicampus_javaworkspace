package com.homework180408practice;

import java.util.*;

// 일단 그냥 -> 일단 됨

public class SlotMachineTest1 extends Thread {

	private int[] temp = new int[3];
	Random random = new Random();

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {

			if (temp[0] != 0 && temp[0] == temp[1] && temp[1] == temp[2]) {
				return;
			}

			temp[0] = random.nextInt(10) + 1;
			System.out.println("-------------");
			System.out.print(temp[0]);
			run1();

		}

	}

	public void run1() {

		temp[1] = random.nextInt(10) + 1;
		System.out.print("\t" + temp[1]);
		run2();

	}

	public void run2() {

		temp[2] = random.nextInt(10) + 1;
		System.out.print("\t" + temp[2]);
		System.out.println("\n-------------");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread sm = new SlotMachineTest1();
		
		sm.start();
		
		try {
			
			sm.join();

		} catch (InterruptedException ee) {
			// TODO: handle exception
		}
		
		System.out.println("축하합니다. 당첨되셨습니다.");


	}

}
