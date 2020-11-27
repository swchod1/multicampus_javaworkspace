package InputOutput;

import java.io.*;

public class TestEx3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				                        new InputStreamReader(System.in));
		
		int a, b, result = 0;
		char c;
		
		System.out.println("첫번째 수 입력: ");
		a = Integer.parseInt(br.readLine());
	
		System.out.println("사칙연산 입력? ");
		c = (char)System.in.read();
		System.in.read();
		System.in.read();
				
		System.out.println("두번째 수 입력: ");
		b = Integer.parseInt(br.readLine());
		
		
		if(c == '+') {
			result = a+b;
		} 
		else if(c == '-') {
			result = a-b;
		}
		else if(c == '*') {
			result = a*b;
		}
		else if(c == '/') {
			result = a/b;
		}
		else {
			result = 0;
		}

	
		System.out.printf("%d %c %d = %d", a, c, b, result);

		
	
		
	}
	

}
