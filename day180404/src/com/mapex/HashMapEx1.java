package com.mapex;


import java.io.*;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * Map<키, 값> : 키는 중복을 허용하지 않음
		 *                  : 값은 중복을 허용함.
		 *                  	 
		 */
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("만화", "마녀 배달부 키키");
		map.put("호러영화", "스크림");
		map.put("영화", "황혼에서 새벽까지");
		
		System.out.println(map); // 순서 없이 출력됨
		// 결과 ---> {호러영화=스크림, 영화=황혼에서 새벽까지, 만화=마녀 배달부 키키}
		
		System.out.println();
		
		// 키 값만 출력하기 set을 활용
		String key;
		Set set = map.keySet(); // map에 있는 키 값을 set으로 옮김
		
		Iterator it = set.iterator(); // Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = (String)it.next(); // key = (String)it.next();
			System.out.println(key + "\t" + map.get(key));
		}
		
		System.out.println();
		
		// 키 중복 시험 --> 키 값이 같으면 값이 수정됨(황혼에서 새벽까지 -> 배트맨)
		map.put("영화", "배트맨");
		System.out.println(map);
		System.out.println();

	}

}
