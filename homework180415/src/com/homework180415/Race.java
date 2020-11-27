package com.homework180415;
import java.util.*;

public class Race implements Runnable {
	
	Random random = new Random();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for (int i = 1; i <= 10; i++) {
			if(i == 10) {
				System.out.println(Thread.currentThread().getName() + " 결승선 통과");
				System.out.println((5-Thread.activeCount()) + "등 : " + Thread.currentThread().getName());
				System.out.println();
				break;
			} else {
			System.out.println(Thread.currentThread().getName() + " " + i + "코스 통과");
			System.out.println();
			}
			try {
				Thread.sleep((random.nextInt(10) + 1)*1000);
			} catch (InterruptedException ie) {
				// TODO Auto-generated catch block
			}
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread hora1 = new Thread(new Race(), "질풍");
		Thread hora2 = new Thread(new Race(), "번개");
		Thread hora3 = new Thread(new Race(), "적토마");
		
		hora1.start();
		hora2.start();
		hora3.start();
	}

}
