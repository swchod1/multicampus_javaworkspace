package com.inher;

public class CellPhone3G extends CellPhone {
	
	// 컨트롤 스페이스로 처음 오버라이딩 했을 때
	/*@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
	}*/
	
	@Override // 범위 상속관계의 클래스
	public void call() {
		// 내가 원하는데로 수정
		
		System.out.println("영상 통화를 합니다.");
		
	}
	
	// 여기는 오버라이딩 된 메소드와 오버로딩된 메소드
	// 오버로딩의 범위 클래스내
	public void call(String s) {
		
	}
	
	
	/*
	 * 오버로딩과 오버라이딩의 차이
	 * 
	 * 오버로딩 : 매개변수 혹은 리턴 자료형이 다르거나 둘다 다르거나 
	 * 
	 * 오버라이딩 : 매개변수가 같아야 한다. 리턴 자료형(int 등)도 같다.
	 * 
	 * 접근제한자는 상관 없음 단, final은 안됨
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	

}
