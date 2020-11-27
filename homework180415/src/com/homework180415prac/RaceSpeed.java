package com.homework180415prac;

import java.util.*;

public class RaceSpeed {
	
	Random random = new Random();
	
	int a, b, c;
	
	public void hora1() {
		for (int i = 1; i <= 10; i++) {
			if(i == 10) {
				a = i;
				System.out.println("질풍이 결승선을 통과했다.");
			} else {
			System.out.println("질풍이 " + i + "바퀴를 돌았다");
			}
			try {
				Thread.sleep((random.nextInt(10) + 1)*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void hora2() {
		for (int i = 1; i <= 10; i++) {
			if(i == 10) {
				b = i;
				System.out.println("번개가 결승선을 통과했다.");
			} else {
			System.out.println("번개가 " + i + "바퀴를 돌았다");
			}
			try {
				Thread.sleep((random.nextInt(10) + 1)*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void hora3() {
		for (int i = 1; i <= 10; i++) {
			if(i == 10) {
				c = i;
				System.out.println("적토마가 결승선을 통과했다.");
			} else {
			System.out.println("적도마가 " + i + "바퀴를 돌았다");
			}
			try {
				Thread.sleep((random.nextInt(10) + 1)*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
