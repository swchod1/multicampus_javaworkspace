package com.test.exception;

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("try ���� ����");
			
			int result = 10 / 5;	// ����
			
			System.out.println("try ���� ����");
		} catch (Exception e) {
			System.out.println("catch ����");
		}
		
	}
	
}









