package com.vscore;

import java.util.Iterator; //  인터페이를 이용해서 클래스를 불러와서 출력할려고
import java.util.Scanner;
import java.util.Vector;


public class ScoreImpl implements Score {
	
	private Vector<ScoreVO> list = new Vector<ScoreVO>();
	private Scanner sc = new Scanner(System.in);

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
		
		for(ScoreVO temp : list) { // 저장된 list(벡터리스트)
			//(ScoreVO vo = new ScoreVO();를 통해 입력된 객체들의 정보)
			//의 각 객체들을 temp에 임시저장
			if(temp.getHak().equals(hak)) { // 리스트에 저장된 객체들 중
				// hak과 일치하는 학번이 저장되어 있는 리스트를 찾으면
				vo = temp; // 널값으로 지정한 vo에 위의 객체를 저장 
				break; 
			}
		}
		
		return vo; // 일치하는 정보를 찾으면 그 객체를 가지고 가고, 못찾으면 널값으로 나감
		
	}
	
	
	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		System.out.println("\n===자료 수정===");
		
		String hak;
		System.out.print("수정할 학번 입력 : ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo == null) {
			
			System.out.println("등록된 자료가 없습니다.");
			return;
		}
		
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
		
		System.out.println("===수정 완료===");
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
		System.out.println("\n===자료 삭제===");
		
		String hak;
		
		System.out.print("삭제할 학번 입력 > ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo == null) {
			System.out.println("\n등록된 자료가 없습니다.\n");
			return;
		}
		
		list.remove(vo);
		
		System.out.println("===삭제 완료===");
		

	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		
		System.out.println("\n===전체출력===");
		
		Iterator<ScoreVO> it = list.iterator();
		
		while(it.hasNext()) { // 벡터에 구성요소가 존재하는지 않하는지 구별
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
		System.out.println();
		

	}

	@Override
	public void searchHak() {
		// TODO Auto-generated method stub
		
		System.out.println("\n===학번 검색===");
		String hak;
		System.out.print("검색할 학번 입력 : ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo != null) {
			
			// 1번 길게
			/*
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.print(vo.getTot()/3 + "\t");
			*/
			
			// 2번 짧게
			System.out.println(vo); //toString() 이 오버라이딩 되어 있었서
			                                // 오버라이딩이 되어 있지 않다면 vo.String.toString ????
			
		}
		
		System.out.println();
	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub
		
		////////////////////////////////////////////
		/*
		System.out.println("/n===이름 검색===");
		
		String name;
		System.out.println("검색할 이름 입력 : ");
		name = sc.next();
		
		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) { // 문자열의 시작 글자가 같으면 검색
				
				
				startsWith(String prefix)
				Tests if this string starts with the specified prefix.
				
				
				
				System.out.println(vo);
				
			}
		}
		
		System.out.println();
*/
		///////////////////////
		
		

		System.out.println("\n===이름 검색===");
		String name;
		System.out.print("검색할 이름 입력 : ");
		name = sc.next();
		
		ScoreVO vo = readScore1(name);
		
		if(vo != null) {
			
			// 1번 길게
			/*
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getBirth() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.print(vo.getTot()/3 + "\t");
			*/
			
			// 2번 짧게
			System.out.println(vo); //toString() 이 오버라이딩 되어 있었서
			                                // 오버라이딩이 되어 있지 않다면 vo.String.toString ????
			
		}
		
		System.out.println();
		
	}
	
	

	public ScoreVO readScore1(String name) {// 위에꺼 끌고와서 적용
		
		ScoreVO vo = null;
		
		for(ScoreVO temp : list) {
			// 벡터에 있는 데이터를 temp로 저장
			if(temp.getName().equals(name)) {
				vo = temp; // vo에 기존에 존재하는 학번을 저장 // 없으면 null
				break;
			}
		}
		
		return vo; // 리턴
		
	}
	
	
	

}
