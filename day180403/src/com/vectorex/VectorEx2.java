package com.vectorex;

import java.util.*;

public class VectorEx2 {

	// 상수

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

		System.out.println("첫번째 요소 : " + v.firstElement());
		System.out.println("두번째 요소 : " + v.get(1));
		System.out.println("마지막 요소 : " + v.lastElement());

		// 첫번째 요소인 검정색을 흰색으로 변경
		v.set(0, "흰색"); // 0 -> 첫번째 요소
		System.out.println("첫번째 요소 : " + v.firstElement());
		System.out.println("요소 개수 : " + v.size());

		// 콜렉션 클래스의 정렬
		Collections.sort(v);

		System.out.print("\n오름차순 정렬 : ");
		for (String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();

		// 자료를 검색하기 위해서는 반듯이 정렬을 먼저해야함 (벡터에서만????)
		
		// 오름차순 정렬했을 때의 검색

		int idx1 = Collections.binarySearch(v, "파랑");
		System.out.println("\n파랑 : " + idx1 + "index"); // 4가 나옴 0부터 시작해서
		
		int idx2 = Collections.binarySearch(v, "검정");
		System.out.println("\n검정 : " + idx2 + "index"); // 자료가 없을 때는 -1로 나옴
		
		
		
		// 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		
		
		System.out.print("\n내림차순 정렬 : ");
		for (String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		
		// 내림차순 정렬했을 때의 검색
		
		int idx3 = Collections.binarySearch(v, "파랑", Collections.reverseOrder());
		System.out.println("\n파랑 : " + idx3 + "index");
		
		int idx4 = Collections.binarySearch(v, "주황색", Collections.reverseOrder());
		System.out.println("\n주황색 : " + idx4 + "index");
		
		System.out.println();
	

	}

}
