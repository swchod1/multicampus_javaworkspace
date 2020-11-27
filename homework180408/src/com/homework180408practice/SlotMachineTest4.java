package com.homework180408practice;

import java.util.*;

// 제어 연습 코드를 간단하게 해보기..........더 이상 못하겠음..........

public class SlotMachineTest4 extends Thread {

	Random random = new Random();
	private int x;
	int arr[] = new int[3];
	int count = 1;

	public void write() {
		System.out.println("-----------");
		for (int i : arr) {
			System.out.print("| " + i + " |");
		}
		System.out.println("\n-----------");
	}
	
	public boolean arr() {
		
		if(arr[0] !=0 && arr[0] == arr[1] && arr[1] == arr[2]) {
			return true;
		} else {
			return false;
		}
		
	}
	

	public void check() {

		if (count == 3) {
			
			write();

			if (!arr()) {

				for (int i = 0; i < arr.length; i++) {
					arr[i] = 0;
				}
				count = 1;
				notifyAll();
			}

		} else {
			try {
				count++;
				this.wait(500);
			} catch (InterruptedException ie) {
				// TODO: handle exception
				return;
			}
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {

			while (!arr()) {

				x = random.nextInt(10) + 1;

				arr[count - 1] = x;

				System.out.print(Thread.currentThread().getName() + " : " + x + " \n");
				
				check();

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SlotMachineTest4 sm = new SlotMachineTest4();

		Thread sm1 = new Thread(sm, "1번");
		Thread sm2 = new Thread(sm, "2번");
		Thread sm3 = new Thread(sm, "3번");

		sm1.start();
		sm2.start();
		sm3.start();

		if (sm.arr()) {
			System.out.println("축하합니다. 당첨되셨습니다.");
			sm1.interrupt();
			sm2.interrupt();
			sm3.interrupt();
			return;
		}

	}

}
