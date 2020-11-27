package com.ex1;

import java.util.*;

public class ReverseInput {
	
    ///////////////////// 2차(1차에서 한거 클래스 쪼개보기) ///////////////////////

	Scanner sc = new Scanner(System.in);
	int num;
	
		

	void reveseinput() {

		do {

			System.out.println("입력하신 2자리수 이상의 숫자를 반대로 출력해드립니다.");
			System.out.print("정수를 입력하세요 -> ");
			num = sc.nextInt(); // 정수형으로 입력 받음
			if (num < 10 || num > Integer.MAX_VALUE) { // 스캐너에 범위 설정이 되어 있는 듯?? Integer.MAX_VALUE 필요 없을 듯???
				System.out.println("입력하신 정수가 연산 범위를 벗어납니다.\n다시입력해 주세요.");
			}

		} while (num < 10 || num > Integer.MAX_VALUE);
	}
	
	int jari() {
		
		int count = 1;
		int i = 1;
		do {

			i *= 10;
			count++;

		} while (num / (10 * i) > 0);
		
		return count;
	}
	
	
	
    ///////////////////// 2차(1차에서 한거 클래스 쪼개보기) ///////////////////////
	

}