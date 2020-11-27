package com.homework;

public class Piano extends Instrument {
	
	
	@Override
	void play() {
		// TODO Auto-generated method stub
		
		System.out.println("Piano : play() 호출됨");
		
	}
	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		
		System.out.println("Piano : volumeUp() 호출됨");
		
	}
	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		
		System.out.println("Piano : volumeDown() 호출됨");
		
	}

}
