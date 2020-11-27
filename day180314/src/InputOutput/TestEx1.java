package InputOutput;

import java.io.*;

/*
 * 두개의 정수를 입력받아 사칙연산을 구하는 프로그램을 작성하시오.
 * 누적변수 : result
 */


public class TestEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int a, b, result = 0;
		
		System.out.print("수1 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("수2 : ");
		b = Integer.parseInt(br.readLine());
		
		result = a + b;
		System.out.println("두 수의 합은" + result + "이다." );
		result = a - b;
		System.out.println("두 수의 차는" + result + "이다." );
		result = a * b;
		System.out.println("두 수의 곱은" + result + "이다." );
		result = a / b;
		System.out.println("두 수의 나눔은" + result + "이다." );
		result = a % b;
		System.out.println("두 수의 나누기 후 나머지는 " + result + "이다.");
		

	}

}
