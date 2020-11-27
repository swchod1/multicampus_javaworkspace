package com.homework180415prac;

/*
 
 인터페이스를 상속받아 다음과 같음 스레드를 활용한 간단한 경마게임을 구현하시오.

난수를 매개변수로 하여 sleep()메소드를 호출하는 스레드를 작성하여
세마리의 말이 경주하는 게임을 구현.
sleep() 메소드는 지정된 시간 동안 현재스레드의 실행을 중단하도록 구현하시오
말 세마리의 이름은 (질풍, 번개, 적토마)라한다.

 */

public class Race02 implements Runnable {
	
	String hname;
	RaceSpeed rs;
	
	public Race02(String hname, RaceSpeed rs) {
		// TODO Auto-generated constructor stub
		
		this.hname = hname;
		this.rs = rs;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		switch (hname) {
		case "질풍":
			rs.hora1();
			break;
		case "번개":
			rs.hora2();
			break;
		case "적토마":
			rs.hora3();
			break;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RaceSpeed rs = new RaceSpeed();
		
		Thread hora1 = new Thread(new Race02("질풍", rs));
		Thread hora2 = new Thread(new Race02("번개", rs));
		Thread hora3 = new Thread(new Race02("적토마", rs));
		
		hora1.start();
		hora2.start();
		hora3.start();
				

	}

}
