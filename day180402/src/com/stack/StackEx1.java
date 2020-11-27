package com.stack;


import java.util.*;


public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] group = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"}; // 배열은 객체가 될 수 있다.
		
		Stack<String> stack = new Stack<String>();
		
		// group 안의 string 들을 순서에 다라 n에 임시저장하고 stack push 저장
		for(String n : group) {
			stack.push(n);
		}
		
		// 비어있지 않으면
		while(!stack.isEmpty()) {
			
			// stack에 저장된 정보들을 가져온다.
			System.out.println(stack.pop());
			
		}
		

	}

}
