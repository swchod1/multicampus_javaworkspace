package control;

import java.io.*;

public class IfEx6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int a, b, c = 0;
		char q;
		
		System.out.print("첫 수 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("연산자  : ");
		q = (char)System.in.read();
	    System.in.read();
	    System.in.read();
	    System.out.print("두번째 수 : ");
		b = Integer.parseInt(br.readLine());
		
		if (q == '+') {
			c = a + b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
		} else if (q == '-') {
			c = a - b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
		} else if (q == '*') {
			c = a * b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
		} else if (q == '/') {
			c = a / b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
		} else {
			System.out.println("잘못된 연산자를 입력하셨습니다.");
		}

	}

}
