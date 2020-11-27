package com.cccc;


/*문제 1]

사용자로부터 년, 월, 일을 입력받아
해당 날짜의 요일을 출력하는 프로그램을 작성하시오.

단, 자바api는 사용하지 않음
    클래스의 개념을 적용시켜 구현
    또한 배열을 이용하여 구현하시오.*/



// 1
import java.util.*;
// 1

public class WeekDay {
	
	// 3
	private int y, m, d; // 년, 월, 일
	
	// 년월일을 입력 받는 메소드
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년 : ");
		y = sc.nextInt();
		System.out.print("월 : ");
		m = sc.nextInt();
		System.out.print("일 : ");
		d = sc.nextInt();
		
	}
	// 3
	
	
	
	// 5
	// 요일 산출 메소드 구현
	
	public String week() {
	
		// 각 월을 마지막 날짜를 배열화 및 요일을 배열화 한다.
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 요일의 배열화
		String[] weekNames = {"일" , "월" , "화" , "수" , "목" , "금" , "토"};
		
		int nalsu; // 총 날짜의 수 
		int i; // 반복문 사용변수
		int w; // 숫자를 요일로 판별
		
		/*
		 * 윤년에 따른 2월의 날짜수 계산
		 * 
		 * 윤년 : 2월의 마지막 날짜가 29일
		 * 
		 * 평년 : 2월의 마지막 날짜가 28일
		 * 
		 */
		
		// 윤년 판정
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) { // 윤년이라 판정
						
			months[1] = 29;			
		} else {
			months[1] =28;
		}
		
		
		// 날짜 수를 계산
		// 1년 1월 1일 ~ 입력 받은 년도 이전년도의 12월 31까지의 날짜 수를 계산 ()
		nalsu = (y-1)*365 + (y-1)/4 -(y-1)/100 + (y-1)/400; // + (y-1)/4 -(y-1)/100 + (y-1)/400 윤년
		
		//System.out.println(nalsu); // 중간 확인
		
		// 입력받은 월(8월)이면 이전 월(7월) 까지의 날짜 수 추가 
		for(i = 0; i < m-1; i++) {
			
			nalsu += months[i];
			
		}
		
		// System.out.println(nalsu); // 중간 확인
		
		// 입력받은 월의 일만큼 날 수 추가
		
		nalsu += d;
		
		// System.out.println(nalsu); // 중간 확인
		
		
		// 요일 구하기
		
		w = nalsu%7; // 전체날짜 수 % 7 = 0 이면 일요일, 1 이면 월요일 .....
		
		// System.out.println(w); // 중간 확인

		return weekNames[w];
	}
	// 5
	
	
	// 7
	// 출력	
	public void write(String day) {
		
		System.out.printf("%d년 %d월 %d일 -> %s요일\n", y, m, d, day);
		
	}
	// 7
	
	

}
