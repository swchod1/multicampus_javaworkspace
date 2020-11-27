package com.test;
/*
사용자로부터 국어, 영어, 수학 점수를 입력받아 합계를 구현하는 프로그램을 구현하여 
결과를 출력하시오.
단, 임의의 정수를 입력받을 경우 Scanner 클래스를 이용하시오.*/


import java.util.*;

public class T01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int result =  kor+eng+mat;
		
		System.out.println();
		
		System.out.println("합 계 : " + result);
		

	}

}
