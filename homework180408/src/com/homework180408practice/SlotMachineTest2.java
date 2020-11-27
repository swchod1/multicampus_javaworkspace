package com.homework180408practice;

import java.util.*;

// 타임으로 -> 됨 이게 그나마 깔끔한듯

public class SlotMachineTest2 extends Thread {
	
	Random random = new Random();
	private int x;
	
	public SlotMachineTest2() {
		// TODO Auto-generated constructor stub
		setDaemon(true);
	}
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			
			try {
				
				x = random.nextInt(10) + 1;
				sleep(500);
				
			} catch (InterruptedException ie) {
				// TODO: handle exception
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SlotMachineTest2 sm1 = new SlotMachineTest2();
		SlotMachineTest2 sm2 = new SlotMachineTest2();
		SlotMachineTest2 sm3 = new SlotMachineTest2();
		
		sm1.start();
		sm2.start();
		sm3.start();
		
		
		try {
			
			while(true) {
				sleep(500);
				System.out.println("----------------");
				System.out.println(sm1.getX() + " || " + sm2.getX() + " || " + sm3.getX());
				System.out.println("----------------");
				
				if(sm1.getX() != 0 && sm1.getX() == sm2.getX() && sm2.getX() == sm3.getX()) {
					System.out.println("축하합니다. 당첨되셨습니다.");
					return;
				}
				
			}
	
		} catch (InterruptedException ie) {
			// TODO: handle exception
		}
	}

}
