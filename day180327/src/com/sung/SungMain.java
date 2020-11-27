package com.sung;

import java.util.*;

public class SungMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int ch; // 메뉴 입력 받을 변수 선언

		// 성적 처리를 한 클래스를 레퍼런스 변수 선언
		SungService service = new SungService();

		while (true) { // 무한 루프

			do {
				System.out.println("1. 입력 2. 검색 3. 출력 4. 종료");
				System.out.print("메뉴 선택 : ");
				ch = sc.nextInt();

			} while (ch < 1 || ch > 4);

			switch (ch) {
			case 1:
				service.Input();
				break;
			case 2:
				service.search();
				break;
			case 3:
				service.write();
				break;
			case 4:
				System.exit(0);
				break;
			} // end switch

		} // end while
		

	}

}
