package com.thread;

/*
 * 스레드 클래스를 상속받아서 구현
 * 
 */


public class ThreadEx1 extends Thread {
	
	private int[] temp;
	
	public ThreadEx1(String threadname) {
		// TODO Auto-generated constructor stub
		
		super(threadname);
		
		temp = new int[10];
		
		for(int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
		
	}
	
	
	@Override
	public void run() { // 스레드 구현 메소드
		// TODO Auto-generated method stub
		
		for(int start : temp) {
			
			try {
				sleep(50); // 1000이 1초당 한번씩 숫자가 작을 수록 빠름 - 속도가 아니고 주기 인듯?
			} catch (InterruptedException e) { // ?? 스레드 무슨 에러
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.printf("스레드 이름 : %s, ", currentThread().getName()); // 현재 스레드의 이름을 출력
			
			System.out.printf("temp value : %d %n", start); // %n \n 같음
		}


		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스레드 생성
		ThreadEx1 st = new ThreadEx1("첫번째");
		
		// 스레드 시작
		st.start();
	}

}
