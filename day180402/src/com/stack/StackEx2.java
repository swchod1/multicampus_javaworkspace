package com.stack;

import java.util.*;
import static java.lang.System.out;

public class StackEx2 {
	
	
	private static final String colors[] = {"검정","노랑", "녹색", "청색", "빨강", "연두색"	};
	
	public StackEx2() {
		
		
		Stack<String> st = new Stack<String>();
		
		
		// 배열에 들어있는 데이터를 스택에 삽입함
		for(String color : colors) {
			st.push(color);
		}
		
		// 스택에 들어있는 데이터를 출력함
		popStack(st);
		
	}
	
	public void popStack(Stack<String> st) {
		
		System.out.print("pop : \n");
		
		// 스택이 비어있지 않으면
		while(!st.isEmpty()) {
			out.println(st.pop());	// while(!st.isEmpty())는 생략 가능
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new StackEx2();

	}

}
