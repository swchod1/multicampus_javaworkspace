package com.game;

public class Marine extends Unit {
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
		System.out.println("마린의 위치 이동 좌표는 x : " + x + ", y : " + y +"입니다.");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("마린이 대기상태에 있습니다.");
	}
	
	@Override
	void message() {
		// TODO Auto-generated method stub
		
		System.out.println("Message:: Standing back");
		
	}
	
	void stimPack() {
		System.out.println("마린이 스팀팩을 사용한다.");
	}
	
	
	/// 추상화된 메소드를 다 오버라이드 해야 에러 제거 됨
	
}
