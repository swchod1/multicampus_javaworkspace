package munjae;

import java.util.Scanner;

public class Sung {

	Scanner sc = new Scanner(System.in);

	// Record 클래스 student로 배열 선언
	Record[] student;

	
	
	// 학생 수 만크 인스턴스 생성
	public void input() {
		
		System.out.println("학생 수 입력: ");
		int input = sc.nextInt();
		student = new Record[input];
		
		for (int i = 0; i < student.length; i++) {

			student[i] = new Record();

		}

		

	}
	
	// 입력받은 학생 수 만큼 국,영,수 점수 입력하고 총점 및 평균 및 석차 구하기
	public void informationInput() {

		for(int i=0; i<student.length; i++) {
			
			System.out.printf("%d번째 학생 이름 입력: ", i+1);
			student[i].name = sc.next();
			
			for(int j=0; j<student[i].score.length; j++) {
				System.out.println(student[i].sub[j] + " 점수: ");
				student[i].score[j] = sc.nextInt();
				//점수 총합 계산
				student[i].sum += student[i].score[j];
			}
			// 평균 계산
			student[i].avg = student[i].sum / 3.0;
			// rank 메소드 호출 -> 석차 계산
			rank();
			System.out.println();
		}
		
		
	}
	
	// rank 메소드
	public void rank() {
		for(int i=0 ; i<student.length; i++) {
			student[i].rank = 1;
			for(int j=0; j<student.length; j++) {
				if(student[i].avg < student[j].avg)
				{
					student[i].rank++;
				}
			}
		}
		
		
	}
	
	public void print() {
		for(int i=0; i<student.length; i++) {
			System.out.println("===========================");
			System.out.println(student[i].name + "님의 성적 정보");
			for(int j=0; j<student[i].score.length; j++) {
				System.out.printf("%s: %3d     ",student[i].sub[j] , student[i].score[j]);
			}
			System.out.println();
			System.out.printf("총점: %3d    평균: %3.2f  석차: %d\n", student[i].sum, student[i].avg, student[i].rank);
			System.out.println("===========================");
			System.out.println();
		}
		
	}

}
