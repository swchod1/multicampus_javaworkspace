package study;

import java.util.*;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum = 0;
	

		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		float avg = sum / 3;
		
	/*	int kor = 80, eng = 70, mat = 60;
		int sum = kor+eng+mat;
		float avg = sum/3;
		*/
		switch ((int)(avg/10)) {
		case 10 :
			System.out.println("당신은 A 등급 입니다.");
			break;
		case 9 :
			System.out.println("당신은 A 등급 입니다.");
			break;
		case 8 :
			System.out.println("당신은 B 등급 입니다.");
			break;
		case 7 :
			System.out.println("당신은 C 등급 입니다.");
			break;
		case 6 :
			System.out.println("당신은 D 등급 입니다.");
			break;
		default :	
			System.out.println("당신은 F 등급 입니다.");
		}
		
		
		
/*		int kor, eng, mat, sum = 0, avg = 0;
		String name, grade = "";

		System.out.print("이름 : ");
		name = sc.next();

		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		avg = sum / 3;

		if (avg >= 90 && avg <= 100) {
			grade = "A";
		} else if (avg >= 80 && avg < 90) {
			grade = "B";
		} else if (avg >= 70 && avg < 80) {
			grade = "C";
		} else if (avg >= 60 && avg < 70) {
			grade = "D";
		} else {
			grade = "F";
		}

		switch (grade) {
		case "A":
			System.out.printf("이름 : %s \n국어점수 : %d \n영어점수 : %d \n" + "수학점수 : %d \n합계 : %d \n평균 : %d \n당신의 학점은 %s입니다.", name, kor, eng,
					mat, sum, avg, grade);
			break;
		case "B":
			System.out.printf("이름 : %s \n국어점수 : %d \n영어점수 : %d \n" + "수학점수 : %d \n합계 : %d \n평균 : %d \n당신의 학점은 %s입니다.", name, kor, eng,
					mat, sum, avg, grade);
			break;
		case "C":
			System.out.printf("이름 : %s \n국어점수 : %d \n영어점수 : %d \n" + "수학점수 : %d \n합계 : %d \n평균 : %d \n당신의 학점은 %s입니다.", name, kor, eng,
					mat, sum, avg, grade);
			break;
		case "D":
			System.out.printf("이름 : %s \n국어점수 : %d \n영어점수 : %d \n" + "수학점수 : %d \n합계 : %d \n평균 : %d \n당신의 학점은 %s입니다.", name, kor, eng,
					mat, sum, avg, grade);
			break;
		case "F":
			System.out.printf("이름 : %s \n국어점수 : %d \n영어점수 : %d \n" + "수학점수 : %d \n합계 : %d \n평균 : %d \n당신의 학점은 %s입니다.", name, kor, eng,
					mat, sum, avg, grade);
			break;
		}*/


	}

}
