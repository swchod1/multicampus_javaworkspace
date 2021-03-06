package com.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	
	StringTokenizer st;
	
	public StringTokenizerEx1(String str) {
		// TODO Auto-generated constructor stub
		
		// 생성자에 전달된 str 인자값을 출력
		System.out.println("str : " + str);

		// 멤버 객체 생성
		st = new StringTokenizer(str);

	}

	public StringTokenizerEx1(String str, String delim) {
		// TODO Auto-generated constructor stub

		// 생성자에 전달된 str 인자값을 출력
		System.out.println("str : " + str);

		// 문자열을 구분하기 위한 두번째 매개변수를 사용(토큰 식별)
		// delim("/") --> /로 구분 위 처럼 아무것도 없으면 스페이스바(공백으로 구분)
		st = new StringTokenizer(str, delim);

	}
	
	
	public void print() {
		
		System.out.println("Token count : " + st.countTokens()); // 토큰의 갯수를 센다.
		
		while(st.hasMoreTokens()) { // 토큰이 있는지 없는지 구별
			
			String token = st.nextToken();
			System.out.println(token);
			
		}
		
		System.out.println("======================================");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizerEx1 st1 = new StringTokenizerEx1("나 보기가 역겨워 가실때에는 말없이 고이"); // 마지막 띄어쓰기로 6개
		st1.print();
		
		StringTokenizerEx1 st2 = new StringTokenizerEx1("2018/04/04", "/");
		st2.print();
		
		/*
		 * StringTokenizer의 경우 공백을 무시하고 제거한다.
		 * String은 공백도 하나의 문자로 인식 --> Ex2에서 이를 제거해 봄.
		 */

	}

}
