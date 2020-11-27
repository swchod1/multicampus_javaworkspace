package com.homework180408practice;

import java.util.*;

// 제어 연습 -> 개더럽지만 일단 됨

public class SlotMachineTest3 extends Thread {

	Random random = new Random();
	private int x;
	int arr[] = new int[3];
	int count = 1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {

			while (true) {

				x = random.nextInt(10) + 1;

				arr[count - 1] = x;

				// System.out.println(count);

				// System.out.println(Thread.activeCount());

				System.out.print(Thread.currentThread().getName() + " : " + x + " \n");

				if (count == 3) {

					System.out.println("-----------");
					for (int i : arr) {
						System.out.print("| " + i + " |");
					}
					System.out.println("\n-----------");

					if (arr[0] == arr[1] && arr[1] == arr[2]) {
						System.out.println("축하합니다. 당첨되셨습니다.");
						break;
					} else {

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
						if (arr[0] == arr[1] && arr[1] == arr[2]) {
							break;
						}

					} catch (InterruptedException ie) {
						// TODO: handle exception
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SlotMachineTest3 sm = new SlotMachineTest3();

		Thread sm1 = new Thread(sm, "1번");
		Thread sm2 = new Thread(sm, "2번");
		Thread sm3 = new Thread(sm, "3번");
		
		

		sm1.start();
		sm2.start();
		sm3.start();
		
		

	}

}
