package com.inher;

public class MP3Phone extends CellPhone {
	
	int size; // 저장 용량
	
	public MP3Phone(String model, String num, int chord, int size) {
		// TODO Auto-generated constructor stub
		
		// this. // 슈퍼클래스의 필드 메소드 등이 다 나옴
		
		this.model = model;
		number = num; // 필드와 매개변수 명이 다르면 this를 붙이지 않아도 됨.
		this.chord = chord;
		this.size = size;
		
		
	}
	
	
	

}
