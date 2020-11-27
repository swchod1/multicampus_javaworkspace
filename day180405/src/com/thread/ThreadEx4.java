package com.thread;

// JoinEx

public class ThreadEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName() + " start");
		
		Runnable r = new JoinEx();
		
		Thread myThread = new Thread(r);
		
		myThread.start();
		
		try {
			myThread.join(); // 호출한 스레드가 끝날 때 까지 기다리다 호출됨 ?? 
			//Thread.sleep(1000);
		} catch (InterruptedException ee) {
			// TODO: handle exception
			ee.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " end");

	}
	
	/*
    main start
    run
    first
    second
    main end 
	*/
	
	/* 빼면 ??? 몬차이 ???
	main start
	run
	first
	second
	main end
	*/

}
