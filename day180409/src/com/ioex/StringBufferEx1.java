package com.ioex;

public class StringBufferEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("java");
		
		// 추가
		sb.append("1.8");
		
		System.out.println(sb);
		
		// 삭제 시작 인덱스부터 끝 인덱스 사이의 문자열 삭제 2 <= (삭제할 부분) < 3
		sb.delete(2, 3); // 인덱스 번호 
		
		System.out.println(sb); // jaa1.8 ?? 2~3이면 왜 a는 안지워짐???
		
		// 삽입 문자와 문자 사이에 삽입
		sb.insert(3, "A1"); // 3 -> 인덱스 번호
		
		System.out.println(sb); // jaaA11.8
		
		
		// 시작 인덱스와 끝 인덱스 사이의 문자열을 치환함  4 <= (치환할 부분) < 6
		sb.replace(4, 7, "잘해");
		
		System.out.println(sb); // jaaA잘해8
		
		// 끝에서 부터 역으로
		sb.reverse();
		
		System.out.println(sb);

	}

}
