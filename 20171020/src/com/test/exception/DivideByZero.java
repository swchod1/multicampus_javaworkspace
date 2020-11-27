package com.test.exception;

import java.util.Scanner;

public class DivideByZero {
	
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피젯수: ");
		x = sc.nextInt();
		
		System.out.print("젯수: ");
		y = sc.nextInt();
		
		try {
			int result = x / y;
			System.out.println("나눗셈 결과: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		System.out.println("프로그램은 계속 됩니다");
	}
	
}







