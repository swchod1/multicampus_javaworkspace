package exex;

/*
 * 문 1 사용자로 부터 임의의 정수를 입력받아 입력받은 정수가 짝수 인지 홀수 인지를 판정하는
 * 프로그램을 작성하시오.
 * 단, 조건삼항연산자를 이용하여 처리하시고, 
 * BufferedReader 로 처리하시오.
 * 
 */

import java.io.*;

public class Ex1 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int a;
		
		
		System.out.print("수 : ");
		a = Integer.parseInt(br.readLine());
		
		String b = ( a%2 == 1) ? "홀수" : "정수";
		System.out.printf("수 %d는 %s입니다.", a, b);
		

				
		
		

	}

}
