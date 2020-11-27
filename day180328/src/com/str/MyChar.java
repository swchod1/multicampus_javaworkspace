package com.str;

public class MyChar {
	
	// 대문자 ---> 소문자
	
	public char lower(char ch) {
		
		if(ch >= 'A' && ch <= 'Z') {
			return (char)(ch+32);
		}
		
		return ch;
	}
	
	
	// 소문자 ---> 대문자
	public char upper(char ch) {
		
		if(ch >= 'a' && ch <= 'z') {
			return (char)(ch-32);
		}
		
		return ch;
	}
	
	
	// 문자 ---> ASCII 코드
	public int ascii(char ch) {
		return (int)ch;
	}
	
	// ASCII 코드 ---> 문자 
	public char character(int ch) {
		return (char)ch;
	}
	
	
	
	// 대문자를 소문자로 변환했는데 이것이 맞는지 안맞는지 확인
	
	public boolean isLower(char ch) {
		boolean b = false;
		if (ch >= 'a' && ch <= 'z') {
			b = true;
		}
		
		return b;
	}
	
	// 소문자를 대문자로 변환했는데 이것이 맞는지 안맞는지 확인
	
	public boolean isUpper(char ch) {
		boolean b = false;
		if (ch >= 'A' && ch <= 'Z') {
			b = true;
		}
		
		return b;
	}
	
	// 들오온 문자가 맞는지(알파벳)
	public boolean isAlph(char ch) {
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			return true;
		}
		
		return false;
	}
	
	
	public boolean isNumber(char ch) {
		if(ch >= '0' && ch <= '9') {
			return true;
		}
		
		return false;
	}
	
	
	

}
