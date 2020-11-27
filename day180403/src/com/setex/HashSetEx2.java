package com.setex;

import java.util.*;


public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중복을 허용하지 않고, 순서는 상관하지 않는다.
		
		Set<String> dog = new HashSet<String>();
		
		dog.add("진돗개");
		dog.add("휘발유");
		dog.add("삽살개");
		dog.add("풍산개");
		dog.add("세퍼트");
		
		System.out.print("기존 데이터 set : " + dog);
		
		// 출력결과   --->   기존 데이터 set : [진돗개, 휘발유, 세퍼트, 풍산개, 삽살개]
		
		System.out.println();
		
		Iterator it = dog.iterator();
		
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
		
		// 이터레이터 출력 결과
		/*
		진돗개
		휘발유
		세퍼트
		풍산개
		삽살개
		*/
		
		// 중복 실험
		dog.add("진돗개"); // 오류는 나지 않으나 중복을 허용하지 않기 때문에 실질적으로 추가되지 않음.
		
		System.out.print("진돗개 데이터 추가 후 데이터 set : " + dog);
		
		// 출력결과   --->   진돗개 데이터 추가 후 데이터 set : [진돗개, 휘발유, 세퍼트, 풍산개, 삽살개]
		// 위의 출력 결과와 차이 없음 // 진돗개 추가 안됨
		
		
		
		
		
		

	}

}
