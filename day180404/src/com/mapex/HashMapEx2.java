package com.mapex;

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", new Integer(30)); // 객체형으로 들어감
		//map.put("홍길동", 30); // 자료형으로 들어감
		map.put("동길동", new Integer(100));
		map.put("서길동", new Integer(10));
		map.put("남길동", new Integer(80));
		map.put("북길동", new Integer(70));
		
        
		
		System.out.println(map);
		
	    /*
	     * 키와 값을 set 형태로 저장 (HashMap을 이용할 때 key와 value를 묶어주기 위해 entry를 이용함)
	     * Map.Entry 인터페이스
	     * 
	     * 맵의 엔트리는(키와 값의 한쌍(페어))이다.
	     * 
	     * Map.EntrySet 메소드는 이클래스에 속하는 요소를 가지는 맵의 컬렉션 뷰로 반환함
	     * 
	     * 맵의 엔트리의 참조를 취득하는 방법은 컬렉션 뷰의 반복자로 부터 취득함
	     * 
	     */
		
		// 객체형으로 들어간 자료를 참조하는 방법
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		Set set2 = map.keySet();
		System.out.println("응시자 명단 : " + set2);
		
		
		// 값을 컬렉션을 이용하여 저장한다.
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		
		while(it2.hasNext()) {
			Integer i = it2.next();
			sum += i;
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (float)sum/set2.size());
		System.out.println("최고점수 : " + Collections.max(v));
		System.out.println("최wj점수 : " + Collections.min(v));
		
		
		
	

	}

}
