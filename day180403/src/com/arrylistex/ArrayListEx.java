package com.arrylistex;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("공각기동대");
		list1.add("원령공주");
		
		//////////
		/*List<String> list2 = new ArrayList<String>();
		list2.add("라푸타");*/
		//////////
		
		List<String> list2 = new ArrayList<String>(list1); // 1과 2가 2에서 합쳐짐
		list2.add("라푸타");
		
		///////
		/*
		List<String> list3 = new ArrayList<String>();
		list3.addAll(list2); // list2에 있는 것을 다 가져옴
		*/
		/////////
		
		List<String> list3 = new ArrayList<String>();
		
		list3.addAll(list2);
		int n = list3.indexOf("원령공주"); // 원령공주의 인덱스를 받아서
		list3.add(n+1, "미래소년코난"); // 중간에 끼워넣기(원래 원령공주 뒷자리에)
		
		
		
		System.out.println(list3); // 1 2 3 바꿔서 출력해봐
		
		
		

	}

}
