package InputOutput;

import java.io.*;
// 1. ASC code 값 입력 받기. 단, 문가가 하나가 들어가야함  
// 2. 문자를 문자로 바꿈. 단, 문가가 하나가 들어가야함

public class InputEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.print("문자 입력 : ");
		// int i = System.in.read(); // 1. 아스키 코드 뽑기  
		char i = (char)System.in.read(); // 2. 문자 그대로 뽑기 
		
		System.out.println("ASC 값 : " + i);
		
		
		
	}

}
