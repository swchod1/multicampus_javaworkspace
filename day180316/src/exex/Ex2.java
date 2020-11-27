package exex;

/*
 * 사용자로부터 임의의 정수를 입력받아 입력받은 수가 정수인지 음수인지 0인지를 판정하는
 * 프로그램을 작성하시오.
 *  단, 조건삼항연산자를 이용하여 처리하시고, 
 *  BufferedReader 로 처리하시오.
 */

import java.io.*;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				                         new InputStreamReader(System.in));
		
		int a;
		
		
		System.out.print("입력 수 : ");
		a = Integer.parseInt(br.readLine());
		
		String b = (a == 0) ? "0" : (a > 0) ?  "양수" : "음수";
		System.out.printf("입력 수 %d는 %s입니다.", a, b);

	}

}
