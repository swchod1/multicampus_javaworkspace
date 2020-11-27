package com.excp;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);		
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
		*/
		
		
		/*
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 여기서 빠짐
			System.out.println(4);	// 여기서는 실행을 안함	
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 여기서 실행을 함
			System.out.println(5); 
		}
		System.out.println(6);
		*/
		
		/*
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 여기서 빠짐
			System.out.println(4);	// 여기서는 실행을 안함	
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 여기서 실행을 함
			System.out.println(5); 
		} finally { // 예외 발생 여부와 관계없이 무조건 실행한다. 
			System.out.println("계산 잘해요");
		}
		System.out.println(6);
		*/
		
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 여기서 빠짐
			System.out.println(4);	// 여기서는 실행을 안함	
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 여기서 실행을 함
			System.out.println(5); 
		} catch (Exception e) { // ?????
			 System.out.println("예외발생");
		} finally { // 예외 발생 여부와 관계없이 무조건 실행한다.
			System.out.println("계산 잘해요");
		}
		System.out.println(6);
		
		
		

	}

}
