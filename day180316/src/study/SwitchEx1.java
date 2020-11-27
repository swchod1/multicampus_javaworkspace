package study;

import java.io.*;


public class SwitchEx1 {

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
	    
		System.in.skip(2); // 위에랑 같은거
	    System.out.print("두번째 수 : ");
		b = Integer.parseInt(br.readLine());
		
		switch (q) {
		case '+':
			c = a + b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
			break;
		case '-':
			c = a - b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
			break;
		case '*':
			c = a * b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
			break;
		case '/':
			c = a / b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
			break;
		case '%':
			c = a % b;
			System.out.printf("%d %c %d = %d", a, q, b, c);
			break;	
		default : 
			System.out.println("연산자를 잘못 입력하셨습니다.\n다시 입력하세요.");
			break;
			
		/*
		 *  break 문 없으면 입력한 연사자 밑의 case가 전부다 실행됨
		 *  (+면 전부다, %면 %랑 디폴트)	
		 */
		
		
		
		}
		
	}

}
