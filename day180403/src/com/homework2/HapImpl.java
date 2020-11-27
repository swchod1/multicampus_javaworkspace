package com.homework2;

import java.util.*;

public class HapImpl implements Hap {
	
	
	private Vector<HapVO> list = new Vector<HapVO>();
	private Scanner sc = new Scanner(System.in);
/*
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
		System.out.println("\n===자료추가===");
		
		// 학번을 기준으로 함.
		String hak;
		System.out.print("학번 : ");
		hak = sc.next();
		
		ScoreVO temp = readScore(hak); // 밑에 꺼
		
		if(temp != null) {
			System.out.println("등록된 학번 입니다.");
			return;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		
		// 기준 학번 정해짐
		
		// 기준 학번에 데이터 입력
		
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		System.out.print("국어 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 : ");
		vo.setMat(sc.nextInt());
		
		
		// 입력한 데이터를 벡터에 추가
		list.add(vo); // ????
		System.out.println("===추가 완료===\n");
		

	}
	
	// 기존 학번을 읽어오는 메소드 구현
	
	public ScoreVO readScore(String hak) {// 위에꺼 끌고와서 적용
		
		ScoreVO vo = null;
		
		for(ScoreVO temp : list) {
			// 벡터에 있는 데이터를 temp로 저장
			if(temp.getHak().equals(hak)) {
				vo = temp; // vo에 기존에 존재하는 학번을 저장 // 없으면 null
				break;
			}
		}
		
		return vo; // 리턴
		
	}
	
	*/
	
	
	

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
		HapVO vo = new HapVO();
		
		System.out.println("===2개의 집합 작성===");
		for(int i = 1; i <= 2 ; i++) {
			System.out.println(i + "집합을 구성할 수를 입력하세요");
			while (true) {
				System.out.print(i + "집합의 수 > ");
				
				vo.setX(sc.nextInt());
				list.add(vo);
				System.out.println();
				System.out.print("더 입력하시겠습니까? [y/n] > ");
				char j = sc.next().charAt(0);
				if(j == 'n' && j == 'N') {
						System.out.println(i + "집합의 입력을 종료합니다.");
						break;
				} 
			}
		}
		
		
		
		
		
			
	}
	
	@Override
	public void hap() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

}
