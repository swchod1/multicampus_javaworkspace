package com.homework180415prac;

import java.util.*;

public class Race01 implements Runnable {
	
	Random random = new Random();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for (int i = 1; i <= 10; i++) {
			if(i == 10) {
				System.out.println(Thread.currentThread().getName() + "이(가) 결승선을 통과했다.");
				System.out.println(Thread.currentThread().getName() + "이(가) " + (5-Thread.activeCount()) + "등 입니다.");
				System.out.println();				
			} else {
			System.out.println(Thread.currentThread().getName() + "이(가) " + i + "바퀴를 돌았다");
			System.out.println();
			}
			try {
				Thread.sleep((random.nextInt(10) + 1)*100);
			} catch (InterruptedException ie) {
				// TODO Auto-generated catch block
			}
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread hora1 = new Thread(new Race01(), "질풍");
		Thread hora2 = new Thread(new Race01(), "번개");
		Thread hora3 = new Thread(new Race01(), "적토마");
		
		hora1.start();
		hora2.start();
		hora3.start();
			

	}

}
