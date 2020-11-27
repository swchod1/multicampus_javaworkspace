package com.test.human;

import java.util.Scanner;

public class UI {
	private Scanner sc;			// 스캐너
	private Manager manager;	// 데이터 저장
	
	public UI() {
		sc = new Scanner(System.in);
		manager = new Manager();
	}
	
	public void start() {
		
		boolean exit = true;
		while (exit) {
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 전체 출력");
			System.out.print("입력 >> ");
			
			int option = 0;
			try {
				option = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("문자를 입력하지 마세요");
				/* 
				 * 버퍼에 남아있는 잘못 입력된 문자를 삭제하기 위하여
				 * sc.next(); 를 써주게 된다
				 */
				sc.next();
				continue;
			}
			
			switch (option) {
			case 1: // 등록
				insert();
				break;
				
			case 2: // 검색
				select();
				break;
				
			case 3: // 삭제
				break;
				
			case 4: // 전체출력
				break;
				
			case 9: // 종료
				break;

			default:
				break;
			}
		}
	} // method start
	
	private void insert() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("나이: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("주민번호: ");
		String socialNumber = sc.nextLine();
		
		Human h = new Human(name, age, socialNumber);
		
		// 매니저에 객체를 전달하여서 저장
		boolean canAdd = manager.insert(h);
		if (canAdd) {
			System.out.println("등록이 완료되었습니다");
		} else {
			System.out.println("등록에 실패하였습니다");
		}
	} // method insert
	
	private void select() {
		
		System.out.print("주민번호 입력: ");
		String socialNumber = sc.nextLine();
		
		Human select = manager.select(socialNumber);
		
		if (select == null) {
			System.out.println("아무 것도 못 찾았다");
		} else {
			System.out.println(select);
		}
		
	} // method select
	
}









