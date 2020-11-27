package com.ex2;

import java.util.*;

public class Input {

	// Fild[] ff;
	
	// Record[] student = new Record[intput];
	Fild[] ff;
	Scanner sc = new Scanner(System.in);
	
	int n;
	
	void input1() {
		
		System.out.println("학생 수 입력: ");
		n = sc.nextInt();

	}
	
	

	void intput2 () {
		
		ff = new Fild[n];

		for(int i = 0; i < ff.length; i++) {
			
			ff[i] = new Fild();
			
			System.out.print("학생 이름을 입력하세요>");
			ff[i].name = sc.next();
			System.out.print("국어 성적을 입력하세요>");
			ff[i].kor = sc.nextInt();
			System.out.print("영어 성적을 입력하세요>");
			ff[i].eng = sc.nextInt();
			System.out.print("수학 성적을 입력하세요>");
			ff[i].mat = sc.nextInt();
			
		}
		
		
	}
	
	void calc () {
		
		for(int i = 0; i < ff.length; i++) {
			ff[i].tot = ff[i].kor + ff[i].eng + ff[i].mat;
		}
		
		for(int i = 0; i < ff.length; i++) {
			ff[i].avg = ff[i].tot / 3;
			for (int j = 0; j < ff.length; j++) { 
				if (ff[i].avg < ff[j].avg) {
					ff[i].suk++;
				}
			}

		}
		
		
	}
	
	
	void write () {
		
		System.out.println("이름 국어점수 영어점수 수학점수 총점 평균 석차 ");
		for (int i = 0; i < ff.length; i++) {
		System.out.printf("%s %d %d %d %d %.2f %d\n", ff[i].name, ff[i].kor,
				ff[i].eng, ff[i].mat, ff[i].tot, ff[i].avg, ff[i].suk);
		}
	}
	

}
