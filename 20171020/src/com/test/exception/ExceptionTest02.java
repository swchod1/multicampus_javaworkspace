package com.test.exception;

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		
		int i = t.divide(10, 0);
		System.out.println(i);
		
		System.out.println("프로그램은 끝까지 실행됨");
	}
}

class Test01 {
	
	public int divide(int x, int y) 
			throws RuntimeException {
		return x / y;
	}
}
















