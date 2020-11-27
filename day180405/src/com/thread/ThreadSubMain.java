package com.thread;

public class ThreadSubMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSub ts = new ThreadSub("길동", "홍", 1); // 우선 순위가 낮음
		ts.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			
		}
		
		ThreadSub ts1 = new ThreadSub("유신", "김", 5); // 우선 순위가 높음
		ts1.start();
		
		try {
			Thread.sleep(300); // 메인을 종료하지 않기 위해 설정
		} catch (InterruptedException ie) {
			
		}
		

	}

}
