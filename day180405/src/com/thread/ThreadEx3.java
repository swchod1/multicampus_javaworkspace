package com.thread;

public class ThreadEx3 extends Thread { // 스레드도 프로세스이기 때문에 실행 가능
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(char ch = 'A'; ch <= 'Z'; ch++ ) {
			
			System.out.println(ch);
			
		}
		
		try {
			sleep(150);
		} catch (InterruptedException ie) {
			// TODO: handle exception
			
			ie.printStackTrace();
			
		}	
		
	}
	
	
	

	public static void main(String[] args) { // 메인도 실행 가능
		// TODO Auto-generated method stub
		
		ThreadEx3 th3 = new ThreadEx3();
		th3.start(); // 이게 빠르냐?
		
		for(int i = 1; i <= 60; i++) {
			System.out.println(i); // 이게 빠르냐? 
		}
		
		// 메인 선처리, 스레드 후처리
		
		// 일반적인 스레드의 우선순위는 5로 자동
		// 조정 가능 1, 5, 10
		
		
	}

}
