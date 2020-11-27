// 인터페이스와 추상클래스 차이점
// - 인터페이스 변수는 무조건 상수화, 메소드는 추상메소드만
// - 클래스와 달리 다중 상속 가능(부모 2명이상 가능)

package com.inter;

public class InterExam2 implements Inter3 {

	int a = 100;

	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a+=1;
	}

	public static void main(String[] args) {

		InterExam2 ie2 = new InterExam2();
		
		Inter1 i1 = ie2;
		Inter2 i2 = ie2;
		Inter3 i3 = ie2;
		
		System.out.println(i1.getA());
		System.out.println(i2.getA());
		System.out.println(i3.getData());
	
		System.out.println(i1 instanceof Object); // Object 클래스 산하에서 인터페이스 자체도 객체다!
		System.out.println(ie2 instanceof Inter1);
		System.out.println(ie2 instanceof Inter2);
		System.out.println(ie2 instanceof Inter3);
		
	}


}
