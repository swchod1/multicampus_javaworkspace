package com.homework180408;

import java.util.*;

public class SlotMachine extends Thread {
	
	Random random = new Random();
	private int x;
	
	public SlotMachine() {
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
		
		
		SlotMachine sm1 = new SlotMachine();
		SlotMachine sm2 = new SlotMachine();
		SlotMachine sm3 = new SlotMachine();
		
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
