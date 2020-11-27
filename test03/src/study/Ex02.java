package study;

import java.io.*;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		int result = 0;
		
		System.out.println("첫번째 수 입력: ");
		a = Integer.parseInt(br.readLine());
	
		System.out.println("두번째 수 입력: ");
		b = Integer.parseInt(br.readLine());
		
		System.out.println("사칙연산 입력? ");
		char ch = (char)System.in.read();
		
		if(ch == '+') {
			result = a+b;
		} 
		else if(ch == '-') {
			result = a-b;
		}
		else if(ch == '*') {
			result = a*b;
		}
		else if(ch == '/') {
			result = a/b;
		}
		else {
			result = 0;
		}


	
		System.out.printf("%d와 %d의 %c 연산 결과는: %d", a, b, ch, result);

		
	
		
	}
	

}
