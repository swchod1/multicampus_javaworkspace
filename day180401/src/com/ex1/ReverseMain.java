package com.ex1;

import java.util.*;


public class ReverseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		///////////////////// 1차(그냥 메인에서 다한거) ///////////////////////
		// 정수 입력 받기 -> 배열에 거꾸로 입력 -> 출력
	
		
        /*		
        Scanner sc = new Scanner(System.in);
		
		int num; // 입력 받은 숫자 저장
		
		System.out.println("입력하신 2자리수 이상의 숫자를 반대로 출력한다");
		System.out.print("정수를 입력하세요 -> ");
		num = sc.nextInt(); // 정수형으로 입력 받음
		
		// 입력받은 정수의 자리 수 세기
		int count = 1;
		int i = 1;
		do {
			
			i *= 10;
			count++;
	
		} while (num / (10*i) > 0);
		
		System.out.println("입력하신 정수는 "+count+"자리 정수 입니다.");
		
		
		// 입력받은 정수를 반대로 입력
		int arr[] = new int[count];
		int j = 0;
		do {
			
			arr[j] = num % 10  ;
			num /= 10;
			j++;
			
		} while (j < arr.length);
		
		
		// 출력
		System.out.print("반대로 출력한 결과 : ");
		for( int l : arr) {
			System.out.print(l);
		}
		*/
		
		

		///////////////////// 1차(그냥 메인에서 다한거) ///////////////////////
		
		
		
        ///////////////////// 2차(1차에서 한거 클래스 쪼개보기) ///////////////////////
		/*
		ReverseWrite ri = new ReverseWrite();
		
		ri.reveseinput();
		ri.write();
		*/
        
		///////////////////// 2차(1차에서 한거 클래스 쪼개보기) ///////////////////////
		
		
		
        ///////////////////// 3차 ///////////////////////
		// 정수 입력 -> 배열 없이 출력

		/*
		Scanner sc = new Scanner(System.in);

		int num; // 입력 받은 숫자 저장

		System.out.println("입력하신 2자리수 이상의 숫자를 반대로 출력한다");
		System.out.print("정수를 입력하세요 -> ");
		num = sc.nextInt(); // 정수형으로 입력 받음

		// 입력받은 정수의 자리 수 세기
		int count = 1;
		int i = 1;
		do {

			i *= 10;
			count++;

		} while (num / (10 * i) > 0);

		System.out.println("입력하신 정수는 " + count + "자리 정수 입니다.");

		// 입력받은 정수를 반대로 입력

		System.out.print("반대로 출력한 결과 : ");

		int k;
		int j = 0;
		do {

			k = num % 10;
			num /= 10;
			System.out.print(k);
			j++;

		} while (j < count);
		*/
		
        ///////////////////// 3차 ///////////////////////
		
		
		
        ///////////////////// 4차 ///////////////////////
		// 정수 입력하고 정수 자체를 자리 바꾸기??
		/*
		Scanner sc = new Scanner(System.in);

		int num; // 입력 받은 숫자 저장

		System.out.println("입력하신 2자리수 이상의 숫자를 반대로 출력한다");
		System.out.print("정수를 입력하세요 -> ");
		num = sc.nextInt(); // 정수형으로 입력 받음

		// 입력받은 정수의 자리 수 세기
		int count = 1;
		int i = 1;
		do {

			i *= 10;
			count++;

		} while (num / (10 * i) > 0);

		System.out.println("입력하신 정수는 " + count + "자리 정수 입니다.");

		// 입력받은 정수를 반대로		
		int k = 0;
		int j = 0;
		do {

			k += num % 10*i;
			num /= 10;
			i /= 10;
			j++;

		} while (j < count);
		
		System.out.print("반대로 출력한 결과 : " + k);
		*/
        ///////////////////// 4차 ///////////////////////
		
		
		
        ///////////////////// 5차 ///////////////////////
		// 문자열로 받아서 하기
		
		
		Scanner sc = new Scanner(System.in);

		String num1; // 입력 받은 숫자 저장
		int num2 = 0; // 출력 할꺼
		int count; // 자리수

		System.out.println("입력하신 2자리수 이상의 숫자를 반대로 출력한다");
		System.out.print("정수를 입력하세요 -> ");
		num1 = sc.next(); // 정수형으로 입력 받음

		// 입력받은 문자열의 자리 수 세기
		
		count = num1.length();
		
		System.out.println("입력하신 정수는 " + count + "자리 정수 입니다.");
				

		// 반대로
		int i = 1;
		do {
			
			num2 += (num1.charAt(num1.length()-count)-'0')*i;
			count--;
			i *= 10;

		} while (count > 0);
		
		System.out.print("반대로 출력한 결과 : " + num2);
		
		
        ///////////////////// 5차 ///////////////////////
		

	}

}
