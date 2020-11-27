package com.homework;

import java.util.*;


/*
임의의 두 배열(a, b)에 들어있는 숫자들의 
합집합을 출력하는 프로그램을 구현한다.
단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.

※임의의 두 배열
int[] a = {2, 3, 7, 10, 11};
int[] b = {3, 6, 10, 14};
*/

public class HomeWorkEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////////// 1차 //////////////

		/*
		int[] a = { 2, 3, 7, 10, 11 };
		int[] b = { 3, 6, 10, 14 };
		int[] c = new int[a.length + b.length];
		
		// c에 a 복사
		System.arraycopy(a, 0, c, 0, a.length);
		
		// 확인
		for (int l : c) {
			
			System.out.print(l + " ");
		}
		
		System.out.println();
		
		
		// b에서 a와 겹치는 부분 삭제
		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < b.length; k++) {
				if (a[j] == b[k]) {
					b[k] = 0;
				}
			}
		}
		
		// 확인
		for (int l : b) {
			System.out.print(l + " ");
		}
		
		System.out.println();
		
		
		// c에 a와 겹치는 부분 삭제된 b복사
		System.arraycopy(b, 0, c, a.length, b.length);

		// 정렬
		Arrays.sort(c);

		// 확인
		for (int l : c) {

			System.out.print(l + " ");
		}

		System.out.println();

		// 0 빼고 출력
		for (int l : c) {
			if (l != 0) {
				System.out.print(l + " ");
			}
		}
		*/
		

		////////////1차 //////////////
		
		
		//////////// 2차 입력받아서 하기 //////////// 한 배열에 같은 수가 두번 들어가면 X
		 
		int a1, b1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 배열을 길이를 입력하세요 > ");
		a1= sc.nextInt();
		
		int[] a = new int[a1];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("첫번째 배열의 "+ (i+1) +"번째 열의 수를 입력하세요 > ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("두번째 배열을 길이를 입력하세요 > ");
		b1= sc.nextInt();
		
		int[] b = new int[b1];
		
		for(int i = 0; i < b.length; i++) {
			System.out.print("두번째 배열의 "+ (i+1) +"번째 열의 수를 입력하세요 > ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("=== 첫번째 배열===");

		for (int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		System.out.println("=== 두번째 배열===");

		for (int i : b) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int[] c = new int[a.length + b.length];
		int count = 0;
		
		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < b.length; k++) {
				if (a[j] == b[k]) {
					b[k] = 0;
					count += 1;
				}
			}
		}
		
		
		/*
		System.out.println("===중간 배열확인===");
		
		for (int l : b) {
			System.out.print(l + " ");
		}*/
		
		System.out.println();
		

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		/*
		System.out.println("===중간 배열확인===");

		for (int i : c) {
			System.out.print(i + " ");
		}
		*/
		
		System.out.println();
        
		
		int[] d = new int[a.length + b.length - count];
		
		int temp = 1;

		for (int i = 0, j = 0; i < d.length; i++, j++) {
			for(int k = 0; k < c.length; k++ ) {
				if (c[j] == 0) {
					j ++;
				}
			}
			d[i] = c[j];
		}
		
		/*
		System.out.println("===중간 배열확인===");
		for (int i : d) {
				System.out.print(i + " ");
		}
		*/
		System.out.println();
		
		Arrays.sort(d);
		System.out.println("===합집합===");
		for (int i : d) {
				System.out.print(i + " ");
		}
		
		

		//////////// 2차 입력받아서 하기 ////////////
		
		

	}

}
