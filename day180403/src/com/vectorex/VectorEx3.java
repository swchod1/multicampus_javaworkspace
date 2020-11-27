package com.vectorex;

import java.util.*;;

public class VectorEx3 {
	
	private static final String colos[] = { "검정", "노랑", "녹색", "파랑", "주황색", "연두색" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<String>();
		// <String> 벡터에 스트링만 넣겠다. 자료형(int 등)이 아니라 객체(String, Integer?? 등)가 들어간다.
		// < > 안에 두가지가 들어 가능 경우가 있다. 맵의 경우 키와 값이 들어가야 하기 때문에.....
		// ?가 들어가면 모든 것을 다 받겠다.

		for (String str : colos) {
			v.add(str);
		}
		
		// 전체 출력
		System.out.println("===전체출력===");
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		
		// 검색
		String s = "연두색";
		if(v.contains(s)) { // s 객체가 v에 속해 있느냐?
			/*
			contains(Object o)
			Returns true if this vector contains the specified element.
			*/
			
			int i = v.indexOf(s)+1; // +1 눈에 보이는 위치확인 
			System.out.println(s + " --> 위치 : " + i);
			
		}
		
		// 삭제
		v.remove("연두색"); // "연두색" or 5(인덱스 번호 )를 넣는다.
		// 삭제되면 뒤에서 땡겨지면서 채워지고 빈칸은 삭제??
		
		// v.remove(5);
		
		System.out.println("===삭제 후 출력===");
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		

	}

}
