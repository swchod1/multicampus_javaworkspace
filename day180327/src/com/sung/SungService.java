package com.sung;

import java.util.*;

public class SungService {
	// 성적 처리를 위한 클래스

	// 최대 50명의 데이터를 처리하기 위한 참조형 변수 선언
	private SungVO[] ss = new SungVO[50]; // 클래스이기 때문에 참조형을 받을 수 있음
	                                                         // 클래스 배열을 잡은 것 50명을 처리 할 수 있는 공간 확보
	                                                         // 아직 할당되지 않음

	///// 인원수를 세기 위한 변수 설정 카운트가 하나씩 올라 갈 때마다 50을 확보한 ss에 하나씩 할당
	private int count;

	// 입출력을 위한 스캐너 레퍼런스 변수 선언
	private Scanner sc = new Scanner(System.in);

	// 자료 입력 및 계산
	public void Input() {

		// 인원수를 50으로 제한한다.
		if (count >= 50) {
			System.out.println("인원이 초과 되었습니다.");
			return; // 나간다
		}

		System.out.println("\n === 자료 입력 ===");

		String[] title = { "국어", "영어", "수학" };

		// 입력받은 인원수 만큼 메모리를 할당한다.
	    ///// 인원수를 세기 위한 변수 설정 카운트가 하나씩 올라 갈 때마다 50을 확보한 ss에 하나씩 할당
		ss[count] = new SungVO();

		// 참조한 배열을 타고 클래스의 name으로
		// 입력받은 이름을 SungVO 클래스의 인스턴스 변수에 저장
		System.out.print("이름  : ");
		ss[count].name = sc.next();  /// nextLine은 공백을 포함 쓰면 엔터 2개 날려 줘야 됌???
		                                        /// next는 공백을 포함하지 않음????

		// 인원 수 만큼 성적을 입력받아 총점 평균을 구함
		for (int i = 0; i < ss[count].score.length; i++) { // 클래스의 score 배열의 길이

			// 타이틀(과목)
			System.out.print(title[i] + " : ");

			// 성적 입력
			ss[count].score[i] = sc.nextInt();

			// 총점 구하기
			ss[count].tot += ss[count].score[i];

		}

		// 평균 구하기
		ss[count].avg = ss[count].tot / 3;
		
				
		// 인원수 증가
		count++;

		// 메인에서 while로 무한루프 되고 중단 전까지 count 됨

		System.out.println();

	}

	// 성적 데이터 출력
	public void write() {
		System.out.println("\n ==== 전 체 출 력 ====");
		System.out.println(" 성명\t\t 국어\t영어\t수학\t총점\t평균\t석차\t국어학점 영어학점 수학학점");
		ranking();
		for (int i = 0; i < count; i++) {
			// 이름 출력
			System.out.print(ss[i].name + "\t\t");

			for (int j = 0; j < ss[i].score.length; j++) {
				// 점수 출력
				System.out.printf("%6d", ss[i].score[j]);
			}
			

			System.out.printf("%6d%6d%6d", ss[i].tot, ss[i].avg, ss[i].rank);
			
			// %7c%7d grade(ss[i].avg), ss[i].rank
			
			// System.out.print("\t");
			for(int j = 0; j < ss[i].score.length; j++) {
				System.out.printf("%8c", grade(ss[i].score[j]));
			}
			
			
			System.out.println();
		}

	}

	// 석차 구하기
	public void ranking() {
		
		for(int i = 0; i < count; i++) {
			ss[i].rank = 1;
		}
		for(int i = 0; i < count-1; i++) { // count-1 까지 비교
			for(int j = i+1; j < count; j++) { // count 비교 i 다음 사람과 계속 비교해 나감
				if(ss[i].tot > ss[j].tot) {
					ss[j].rank++;
				} else if (ss[i].tot < ss[j].tot) {
					ss[i].rank++;
				}
			}
		}
		
	}
	
	

	// 학점 구하기
	public char grade(int s) {
		// ranking(); // 석차가 1이 아니라 0부터 시작..... 뭐냐.......
		char c;
		
		switch(s/10) {
		case 10 :
			c = 'A';
			break;
		case 9 :
			c = 'A';
			break;
		case 8 :
			c = 'B';
			break;
		case 7 :
			c = 'C';
			break;
		case 6 :
			c = 'D';
			break;
		default :
			c = 'F';
			break;
			
		}
		
		return c;
	}

	// 조회 (이름으로 검색)
	public void search() {
		
		System.out.println("\n ==== 자 료 검 색 ====");
		
		System.out.print("검색할 이름 입력 : ");
		String name = sc.next();
		
		// ranking(); // 조회시에만 석차 나옴, 출력에서는 다 0
		
		for(int i = 0; i < count; i++) {
			
			if (ss[i].name.equals(name)) { // 문자열을 비교할 때는 equals 메소드를 이용해서 비교함.
				System.out.println(" 성명\t\t 국어\t영어\t수학\t총점\t평균\t학점\t석차\t국어학점 영어학점 수학학점");
				System.out.print(ss[i].name+"\t\t");
				
				for (int j = 0; j < ss[i].score.length; j++) {
					
					System.out.printf("%6d", ss[i].score[j]);
				}// 내부 for
				
				System.out.printf("%6d%6d%6c%6d", ss[i].tot, ss[i].avg, grade(ss[i].avg), ss[i].rank);
				
				for(int j = 0; j < ss[i].score.length; j++) {
					System.out.printf("%8c", grade(ss[i].score[j]));
				}
				
			}// if end
			System.out.println();
			
		}// 외부 for

	}

}
