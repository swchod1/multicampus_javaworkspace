package com.vectorex;

import java.util.*;


public class VectorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<MyData> v = new Vector<MyData>(); // 객체(MyData 클래스)를 벡터에 가져옴
		
		v.add(new MyData("홍길동", 23));
		v.add(new MyData("김길동", 26));
		v.add(new MyData("서길동", 27));
		v.add(new MyData("이길동", 30));
		
		for(MyData my : v) {
			System.out.printf("이름 : %s, 나이 : %d\n", my.name, my.age);
		}
		
		
		
		
		

	}

}
