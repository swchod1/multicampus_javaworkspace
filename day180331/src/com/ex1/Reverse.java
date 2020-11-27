package com.ex1;

import java.util.*;


public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수를 입력하세요 -> ");
		num = sc.nextInt();
		
/*		String num1;
		int num2;
		
		num1 = valueOf(num).charAt(0);
		
		System.out.println(num1.valueOf(num).charAt(0));*/
		
		// int arr[] = new int[];
		int count = 1;
		int i = 1;
		
		do {
			
			i *= 10;
			count++;
			
			/*if(num1.valueOf(num).charAt(0)) {
				System.out.println();
			}*/
	
		} while (num / (10*i) > 0);
		
		System.out.println("입력하신 정수는 "+count+"자리 정수 입니다.");
		
		int arr[] = new int[count];
		int j = 1;
		do {
			
			arr[count-1] = num / i  ;
			i /=10; 
			j *=10;
			count--;
			
		} while (count > -1);
		
		System.out.print("반대로 출력한 결과 : ");
		for( int k : arr) {
			System.out.print(arr[k]);
		}
		

		
		
		

	}

}
