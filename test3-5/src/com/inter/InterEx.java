package com.inter;

public interface InterEx {

	static final int A = 100; // 원칙적으로 이렇게 적음

	abstract int getA(); // 인터페이스 안에서는 무조건 추상메소드로 선언.

	// int a =200; static final 생략가능
	// int method1(); abstract 생략가능

}
