package com.homework180408practice;

import java.util.*;

// 3개를 조인으로됨??

public class SlotMachineTest5 extends Thread {
	
	Random random = new Random();
	
	private int x;


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		x = random.nextInt(10) + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) { // 이렇게 계속 생성한다고??? 오우

			SlotMachineTest5 sm1 = new SlotMachineTest5();
			SlotMachineTest5 sm2 = new SlotMachineTest5();
			SlotMachineTest5 sm3 = new SlotMachineTest5();

			sm1.start();
			sm2.start();
			sm3.start();

			try {
				sm1.join();
				sm2.join();
				sm3.join();
				} catch (InterruptedException ie) {
				// TODO: handle exception
			}
			
			System.out.println("-------------");
			
			System.out.print(sm1.getX() + " || " + sm2.getX() + " || " + sm3.getX());
			
			System.out.println("\n-------------");
			
			if (sm1.getX() == sm2.getX() && sm2.getX() == sm3.getX()) {
				System.out.println("축하합니다. 당첨되셨습니다.");
				break;
			}
	
			
		}

	}

}
