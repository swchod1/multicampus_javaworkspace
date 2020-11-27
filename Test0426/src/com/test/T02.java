package com.test;
/*
두 개의 정수의 합을 구현하는 메소드를 작성하여 출력 결과를 출력하시오.
메소드명 add로 하시고 두 개의 인자 값을 전달받아 결과값을 구현하는 프로그램을 작성하여
메인 메소드에서 실행하여 결과 값을 출력하시오.
*/
import java.util.Scanner;

public class T02 {
	
	int a, b;
	
	public T02(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	void add() {		
		System.out.println();
		System.out.println("합 : " + (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1 : ");
		int a = sc.nextInt();
		System.out.print("정수 2 : ");
		int b = sc.nextInt();
		
		T02 t02 = new T02(a, b);
		t02.add();
		
	}

}
