package com.inter;

public interface InterEx {
	
	// 원칙적으로는 이거이 맞음
	/*
	static final int A = 100;
	abstract int getA();
	*/
	
	// 이렇게 되어도 자동으로 위처럼 인식 ---> 생략 가능
	int A = 100; // ---- static final int A = 100;
	int getA(); // ---- abstract int getA();
	
	
	
	
	

}
