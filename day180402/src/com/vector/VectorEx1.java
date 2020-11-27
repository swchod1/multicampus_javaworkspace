package com.vector;

import java.util.*;
import static java.lang.System.out;

public class VectorEx1 {
	
	private static final String colors[] = {"검정","노랑", "녹색", "청색", "빨강", "연두색"	};
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i;
	String str;
	
	// 벡터 ---> 클래스 ---> 상속가능
	
	Vector v = new Vector();
	
	// 벡터에 데이터 저장(추가)
	for(i = 0; i < colors.length; i++) {
		
		// 배열에 있는 데이터를 벡터에 추가
		v.add(colors[i]);
		// v.add(10); // 위에 대신 이거 하면 컴파일 에러남
	}
	
	str = (String)v.firstElement(); // 처음과 마지막만 first, last를 씀
	out.println("첫번째 요소 : " + str);
	
	str = (String)v.get(1); // 0번 부터 시작이기 때문에 1이 두번째 데이터임
	out.println("두번째 요소 : " + str);
	
	str = (String)v.lastElement(); // 0번 부터 시작이기 때문에 1이 두번째 데이터임
	out.println("마지막 요소 : " + str);
	
	// 출력할때 순서 없이 가능
	
	
	
	//////////// 전체출력 ////////////
	
	out.println("\n전체출력");
	
	// 이터레이터 인터페이스를 활용
	// 인터페이스에 있는 iterator()메소드 활용
	
	///////////  1   //////////
	/*
	Iterator it = v.iterator();
	
	while(it.hasNext()) {// 다음 요소가 존재하는지 않하는지 판정
		// 요소가 있으면 next()메소드에 의해서 요소값을 가지고 옴.
		
		str = (String)it.next();
		System.out.print(str + " ");
		
	}
	*/
	///////////  1   //////////
	
	

	
	

	///////////  1   //////////
	out.println();
	///////////  1   //////////
	
	

	///////////  2   //////////
	
	for(Object o : v) {
		str = (String)o;
		System.out.print(str + " ");
		
	}
	
	System.out.println();

	///////////  2   //////////
	

	}

}
