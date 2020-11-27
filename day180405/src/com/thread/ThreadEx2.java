package com.thread;


// 인터페이스를 implements 받아서 구현


public class ThreadEx2 implements Runnable {
	
private int[] temp;
	
	public ThreadEx2() {
		// TODO Auto-generated constructor stub
				
		temp = new int[10];
		
		for(int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int start : temp) {

			try {
				Thread.sleep(50); // 1000이 1초당 한번씩 숫자가 작을 수록 빠름 - 속도가 아니고 주기 인듯?
			} catch (InterruptedException e) { // ?? 스레드 무슨 에러
				// TODO: handle exception
				e.printStackTrace();
			}

			System.out.printf("스레드 이름 : %s, ", Thread.currentThread().getName()); // 현재 스레드의 이름을 출력

			System.out.printf("temp value : %d %n", start); // %n \n 같음
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreadEx2 st = new ThreadEx2();
		
		// 인터페이스 상속해서 구현시 스레드 시작메소드 호출 불가
		// 스래드 생성자의 인자로 구현
		Thread t = new Thread(st);
		
		t.start();

	}

}
