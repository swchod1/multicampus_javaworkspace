package com.mapex;

import java.util.*;

public class HashTableEx {
	
	private static final String name[] = { // 키는 중복을 허용하지 않음
			"이순신", "홍길동", "김길동", "김유신", "사오정", "저팔계"
			};
	
	private static final String tel[] = { // 값은 중복을 허용함
			"111-1111", "222-2222", "333-3333", "444-4444", "555-5555", "555-5555", "666-6666"
			};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		// 헤시테이블에 데이터(키, 값)를 입력하는 방법
		
		for(int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);
		}
		
		// 헤시테이블의 값을 키를 이용하여 검색하는 방법
		
		String str = ht.get("홍길동");
		if(str != null ) {
			System.out.println("홍길동의 전화번호 : " + str);
		}
		
		// 키가 존재하는지 검색
		
		if(ht.containsKey("사오정")) {
			System.out.println("사오정이 존재합니다.");
		}
		
		// 값이 존재하는지 검색
		
		if(ht.containsValue("555-5555")) {
			System.out.println("검색하신 전화번호가 존재합니다.");
		}
		
		// 저팔계를 삭제
		
		ht.remove("저팔계");
		
		if(ht.containsKey("저팔계")) {
			System.out.println("저팔계가 존재함");
		} else {
			System.out.println("저팔계가 존재하지 않음");
		}

	}

}
