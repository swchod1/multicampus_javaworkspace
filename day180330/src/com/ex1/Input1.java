package com.ex1;

import java.util.*;

public class Input1 {
	
	Scanner sc = new Scanner(System.in);
	
	int y, m, d;
	
	
	void in () {
		
		System.out.println("년도를 입력하세요>");
		y = sc.nextInt();
		
		System.out.println("월을 입력하세요>");
		m = sc.nextInt();
		
		System.out.println("일을 입력하세요>");
		d = sc.nextInt();
			
	}
	
	/*public String calc() {
		
		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
			int a = y*366+m
		} else {
			System.out.println("입력하신 년도 " + y + "는 평년입니다.");
		}
		
	}*/
	
	
	
	

}
