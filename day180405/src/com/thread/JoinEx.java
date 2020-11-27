package com.thread;

public class JoinEx implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("run");
		first();
		

	}

	public void first() {
		
		System.out.println("first");
		second();

	}

	public void second() {
		
		System.out.println("second");

	}
	

}
