package com.test;

import java.util.Scanner;

public class CalcExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1 : ");
		int a = sc.nextInt();
		System.out.print("정수 2 : ");
		int b = sc.nextInt();
		
		Calc calc = new Calc(a, b);
		
		System.out.println();
		
		System.out.println("합 : " + calc.add());
		System.out.println("차 : " + calc.sub());
		System.out.println("곱 : " + calc.mul());
		System.out.println("나눔 : " + calc.div());

	}

}
