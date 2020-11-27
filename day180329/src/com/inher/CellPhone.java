package com.inher;


// 상위 클래스
public class CellPhone {
	
	// 멤버 필드
	String model; // 모델
	String number; // 전화 번호
	int chord; // 화음
	
	
	// 메소드
	public int getChord(){
		return chord;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String n) {
		this.number = n;
	}


	public String getModel() {
		return model;
	}
	
	
	public void call() {
		System.out.println("통화를 합니다.");
	}
	

}
