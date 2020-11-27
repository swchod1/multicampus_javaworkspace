package com.lotto;

import java.util.*;

public class Lotto {
	
	// 필드
	private int num[]; // 로또 번호
	private Scanner sc = new Scanner(System.in); 
	
	// 생성자
	public Lotto() { // 생성자 함수
		// 생성자 함수의 목적 : 멤버필드의 초기화를 목적으로 한다.
		num = new int[6];
				
	}
	
	// 메소드
	
	// 번호 뽑기
	public void randNum() { // 램덤 래퍼런스 변수
		
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			num[i] = rand.nextInt(45)+1; // 0~44  +1 ---->  1 ~ 45 까지의 램덤값
			
			// 추출한 변호의 중복 제거
			for (int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	// 정렬
	public void sorting() {
		
		Arrays.sort(num);
	}
	
	
	// 출력
	public void write() {
		sorting();
		for (int n : num) {
			System.out.printf("%4d", n);
		}
		
		System.out.println();
		
	}
	
	
	// 로또 번호 시작
	public void LottoStart() {
		
		int n;
		
		do {
			System.out.print("로또 구매 개수 입력( 1 ~ 5 ) : ");
			n = sc.nextInt();
			
		} while (n < 1 || n > 5);
		
		// 구매 개수 만큼 출력한다.
		
		for (int i = 1; i <= n; i++) {
			
			randNum(); // 번호를 받는다.
			System.out.print(i + "번째 : ");
			write(); // 출력
		}
		
		
	}
	

}
