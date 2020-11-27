package com.test.exception;

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("try 구문 시작");
			
			int result = 10 / 5;	// 오류
			
			System.out.println("try 구문 종료");
		} catch (Exception e) {
			System.out.println("catch 구문");
		}
		
	}
	
}









