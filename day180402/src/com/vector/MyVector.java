package com.vector;

import java.util.*; // 벡터 클래스를 쓰기 위해

public class MyVector extends Vector {
	
	
	public MyVector() {
		super(1, 1); // 매개변수가 두개인 벡터 생성자 이용 --> 벡터 클래스에 매개변수가 두개인 생성자가 있다.
	}
	
	/*
	Vector(int initialCapacity, int capacityIncrement)
	Constructs an empty vector with the specified initial capacity and capacity increment.
	*/
	
	public void addInt(int i) { // 정수 추가
		addElement(new Integer(i));  // i 값이 들어오면 객체를 추가 하겠다 ??????
	}
	
	public void addFloat(float f) { // 실수 추가
		addElement(new Float(f));		
	}
	
	public void addString(String s) {
		addElement(s);
	}
	
	public void addCharArray(char a[]) {
		addElement(a);
	}
	
	
	// 출력 메소드
	
	public void write() {
		
		Object o;
		
		int length = size(); // 길이 만큼 불러옴
		System.out.println("Number of vector elements is" + length + " and they : ");
		
		for(int i = 0; i < length; i++) {
			o = elementAt(i);
			
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[])o)); // 복사한
			} else {
				System.out.println(o.toString());
			}
		}
		
	}

}
