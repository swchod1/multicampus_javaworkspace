package com.homework180408practice;

import java.time.format.TextStyle;

public class TestMain extends Thread {
	
	public TestMain (ThreadGroup threadGroup,  String threadName) {
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				// TODO: handle exception
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		
		System.out.println(getName() + " 종료됨");
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		int arr[] = new int [3];
		
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]);
		}
		*/
		
		
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		
		TestMain workTheadA = new TestMain(myGroup, "workTheadA");
		TestMain workTheadB = new TestMain(myGroup, "workTheadB");
		
				
		workTheadA.start();
		workTheadB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용]");
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		
		System.out.println();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			// TODO: handle exception
		}
		
		System.out.println("[myGroup 스레드 그룹의 interrupt() 메소드 호출]");
		myGroup.interrupt();		
		

	}

}
