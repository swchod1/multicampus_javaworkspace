package com.homworkdap180330;


import java.util.*;

public class HomeWorkEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		int val; // 입력한 정수 값
		int digit; // 출력할 마지막 자릿수
		
		System.out.print("반대로 출력할 정수 입력 : ");
		val = sc.nextInt();
		
		System.out.println("입력한 수를 반대로 출력 : ");
		
		do {
			
			digit = val % 10;
			System.out.printf("%d", digit);
			val = val /10;
			
			
		} while (val != 0);

	}

}
