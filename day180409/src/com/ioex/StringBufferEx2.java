package com.ioex;

public class StringBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스트링 버펑 생성
		// 기본 버퍼의 크기는 16
		// StringBuffer sb = new StringBuffer();
		
		// System.out.println(sb.capacity()); // 기본 용량 : 16
		
		StringBuffer sb = new StringBuffer("1234567890");
		
		System.out.println(sb.capacity()); // 26 -> 16 + 10(1~0까지)
		
		// 버퍼에 저장된 문자열의 길이
		
		System.out.println(sb.length()); // 10
		
		sb.append("abcdefghijklmnopq");
		
		System.out.println(sb.capacity()); // 54 -> 26 ?? 26 + 26(어펜전 꺼를 똑같이 복사) + 2(어펜드 하면
		// 기본 1 + 어펜드한 갯수(어펜드 한번 더하면 +2 -> +3 ?? )) = 54

		// 기존 버퍼용량에 용량인 26에 +2를 함

		System.out.println(sb.length()); // 27 -> 10 + 17(a~q까지 17개)

		// sb.append("abcdefghijklmnopq");
		
		sb.append("abcdefghijklmnopqabcdefghijklmnopq");

		System.out.println(sb.capacity()); // // 54 // 110

		System.out.println(sb.length()); // // 44 // 61
		
		
		sb.delete(1, 50);
		
		System.out.println(sb.capacity()); // 110 삭제한다고 해서 버퍼의 용량이 줄지는 않는다.
		                                               // 벡터는 클래스 지우면 용량 줄음.
		
		System.out.println(sb.length()); // 12 길이는 줌
		
		


	}

}
