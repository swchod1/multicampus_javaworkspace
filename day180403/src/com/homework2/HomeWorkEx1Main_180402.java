package com.homework2;

import java.util.*;


/*
문제1]

        임의의 두 배열(a, b)에 들어있는 숫자들의 

합집합을 출력하는 프로그램을 구현한다.

단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.




※임의의 두 배열

int[] a = {2, 3, 7, 10, 11};

int[] b = {3, 6, 10, 14};
*/


public class HomeWorkEx1Main_180402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		///////// 1 HashSet //////////
		
		Set set = new HashSet<Integer>();
		
		int[] a = {2, 3, 7, 10, 11};

		int[] b = {3, 6, 10, 14};
		
		for(int i : a) {
			set.add(i);
		}
		
		for(int i : b) {
			set.add(i);
		}
		
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		///////// 1 HashSet //////////
		
		
		
		
		

	}

}
