package com.inter;

public class InterExam2 implements Inter3 {
	
	
	
	int a =100;

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a; // 변수 명이 부모와 같으면  자식이 우선
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a+1;
	}
	
	public static void main(String[] args) {
		
		// 인터페이스 다형성
		InterExam2 it = new InterExam2();
		
		Inter1 it1 = it;
		Inter2 it2 = it;
		Inter3 it3 = it;
		// 인터페이스 다형성
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
		
		System.out.println(it instanceof Object);
		System.out.println(it1 instanceof Object);
		System.out.println(it2 instanceof Object);
		System.out.println(it3 instanceof Object);
		System.out.println();
		
	}
	
	

}
