package InputOutput;

import java.io.*;


/*
 * 두개의 정수를 입력받아 사칙연산을 구하는 프로그램을 작성하시오.
 * 누적변수 : result
 */


public class TestEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int a, b, result = 0;
		char c;
		
		System.out.print("첫 숫자 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("연산 기호 : ");
		c = (char)System.in.read();
		System.in.read();
		System.in.read();
		System.out.print("마지막 숫자 : ");
		b = Integer.parseInt(br.readLine());
		
		
		result = a + b;
		
		
		
		
		
		
		System.out.printf("%d %c %d = %d \n입니다.", a, c, b, result);
		/* %d는 정수 10진수, %X는 정수 16진수, %0은 정수 8진수
		 * %f 혹은 %f1 은 실수
		 * %c는 문자 하나
		 * %s는 문자열
		 * 
		 */

	}

}