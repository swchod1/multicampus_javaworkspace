package com.ex5;

/*-클래스 Student:
	필드: 학교명, 학과, 학번, 8개 학기 평균평점을 저장할 배열로 선언
	생성자: 학교명, 학과, 학번 지정
	메소드 average(): 8개 학기 평균평점의 평균을 반환*/

import java.util.*;


public class Student extends Person {
	
	Scanner sc = new Scanner(System.in);
		
	String sname; // 학교명
	String major; // 학과
	String snum; // 학번
	double avg[] = new double[8];
		
	Student (String sname, String major, String snum) {
		
		this.sname = sname;
		this.major = major;
		this.snum = snum;
				
	}
	
	void average() {
		System.out.println("-----------------------------");		
		System.out.println("8학기 학점을 순서대로 입력하세요");
		
		double avg = 0;
		
		for (int i = 0; i < this.avg.length; i++) { 
			System.out.print( i+1 +"학기 학점 → ");
			this.avg[i] = sc.nextDouble();
			avg += this.avg[i] / 8;
		}
		System.out.println("-----------------------------");
		
		System.out.printf("8학기 총 평균 평점은 %.2f점 입니다.", avg);
	}
	
	/*void input() {
		
		
		
	}*/
	
	void write() {
		System.out.print("이름 : ");
		System.out.println(super.name);
		System.out.print("나이 : ");
		System.out.println(super.age);
		System.out.print("주소 : ");
		System.out.println(super.add);
		System.out.print("학교 : ");
		System.out.println(this.sname);
		System.out.print("학과 : ");
		System.out.println(this.major);
		System.out.print("학번 : ");
		System.out.println(this.snum);
		average();
		
	}
	
	

}
