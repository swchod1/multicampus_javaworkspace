package control;

import java.util.*;

public class IfEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 프로그램에 사용할 변수를 지정한다
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int i;
		String grade="";// 등급을 판정할 변수를 선언하고 널값으로 초기화
		System.out.print("점수 : ");
		i = sc.nextInt();
				
		
		if(i >= 90 && i<= 100) {
			grade = "수";
		} else if (i>=80 && i<90) {
			grade = "우";
		} else if (i>=70 && i<80) {
			grade = "미";
		} else if (i>=60 && i<70) {
			grade = "양";
		} else { // 60점 미만은 이 블럭에서 처리함
			grade = "가";
		}
		
		System.out.printf("당신의 점수는 %d이며 \n 또한 취득하신 등급은 %s입니다. \n", i, grade);
        */
		
		
		/*
		 * 사용자로 부터 이름, 국어, 영어, 수학 점수를 입력받아 합계의 평균 그리고 등급을 처리하는 
		 * 프로그램을 작성하시오
		 */
		int kor, eng, mat, sum = 0, avg = 0;
		String name, grade;
			
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum/3;
		
		System.out.printf("이름 : %s \n국어점수 : %d \n영어점수 : %d \n"
				+"수학점수 : %d \n합계 : %d \n평균 : %d \n", name, kor, eng, mat, sum, avg);
		
		
		if(avg >= 90 && avg <= 100) {
			grade = "A";
		} else if (avg >= 80 && avg < 90) {
			grade = "B";
		} else if (avg >=70 && avg < 80) {
			grade = "C";
		} else if (avg >=60 && avg < 70) {
			grade = "D";
		} else {
			grade = "F";
		}
				
		
		System.out.printf("등급 : %s", grade);
		
		
		
	}

}
