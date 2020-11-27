package com.ex3;

import java.util.*;

public class Sung {
	
	Record[] re;
	
	Scanner sc = new Scanner(System.in);
	
	int n;
	
	void inputSN() {
		
		System.out.print("학생 수 : ");
		n = sc.nextInt();
		
		re = new Record[n];
		
	}
	
	void inputNSung() {
		
		String title[] = {"국어", "영어", "수학"};
		
		for(int i = 0; i < re.length; i++) {
			
			re[i] = new Record(); 
			
			System.out.print("이름 입력 : ");
			re[i].name = sc.next();			
			for(int j = 0; j < title.length; j++) {
				
				System.out.print(title[j] + "점수 입력 : ");
				re[i].score[j] = sc.nextInt();
				
			}
		}
	}
	
	void calc () {
		
		for(int i = 0; i < re.length; i++) {
			for(int j = 0; j < re[i].score.length; j++) {
				re[i].tot += re[i].score[j];
			}
			re[i].avg = re[i].tot/3;
		}
		
		
		for(int i = 0; i < re.length; i++) {
			for(int j = 0; j < re.length; j++) {
				if(re[i].avg < re[j].avg) {
					re[i].rank++;
				}
			}
		}
		
		/*for(int i=0 ; i<student.length; i++) {
			student[i].rank = 1;
			for(int j=0; j<student.length; j++) {
				if(student[i].avg < student[j].avg)
				{
					student[i].rank++;
				}
			}
		}*/
		
		
	}
	
	void write () {
		
		System.out.println("이름 국어 영어 수학 총점 평균 석차");
		for(int i = 0; i < re.length; i++) {
			System.out.print(re[i].name);
			for(int j = 0; j < re[i].score.length; j++) {
				System.out.print(" " + re[i].score[j]);
			}
			System.out.printf(" %d %.2f %d\n", re[i].tot, re[i].avg, re[i].rank);
		}
		
	}
	
	
	
	

}
