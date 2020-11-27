package com.queue;

import java.util.*;
import static java.lang.System.out;


public class QueueEx1 {	
	
	private static final String colors[] = {"검정","노랑", "녹색", "청색", "빨강", "연두색"	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> qu = new LinkedList<String>();
		
		for(String str : colors) {
			qu.offer(str); // 데이터 추가
		}
		
		while(qu.peek() != null) { // peek ??
			/*
			 * peek() : 처음 입력된 데이터 ----> 데이터가 입력되어있는  첫칸
			 * 
			 * stack과 차이점 : 데이터가 null인지 아닌지 판별하는 과정
			 * 
			 * 
			 * offer(x) : 데이터 x를 삽입(추가)
			 * 
			 * poll(x) : 첫번째 데이터를 출력후 저장된 위치를 삭제함
			 * 
			 */
						
			out.println(qu.poll()); // poll
			
		}
		
	}

}
