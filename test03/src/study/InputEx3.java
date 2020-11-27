package study;

import java.io.*;

public class InputEx3 {

	public static void main(String[] args) throws IOException {
		
		//숫자하나 입력받기.
		
		//int x = System.in.read() - 48;
		//int x = System.in.read() - '0;';
		
		
		int num1;
		int num2;
		
		System.out.println("첫번째 수: ");
		num1 = System.in.read() - 48;
		
		System.in.read();
		System.in.read();
		
		System.out.println("두번째 수: ");
		num2 = System.in.read() - '0';
	
	
		int c = num1 + num2;
		System.out.println(c);
	}
}
