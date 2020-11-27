package com.homework180408practice;

import java.util.*;

// 그룹끄기

public class SlotMachineTest6 extends Thread {
	
	Random random = new Random();
	
	private int x;
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}
	
	
	
	public SlotMachineTest6(ThreadGroup threadGroup, String threadName) {
		// TODO Auto-generated constructor stub
		
		super(threadGroup, threadName);
		
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
				return;
			}

		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup tg = new ThreadGroup("tg");
		
		SlotMachineTest6 sm1 = new SlotMachineTest6(tg,"1번");
		SlotMachineTest6 sm2 = new SlotMachineTest6(tg,"2번");
		SlotMachineTest6 sm3 = new SlotMachineTest6(tg,"3번");
		
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
					tg.interrupt();
					return;
				}
				
			}
	
		} catch (InterruptedException ie) {
			// TODO: handle exception
		}

	}


}
