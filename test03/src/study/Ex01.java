package study;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		int result[] = {0, 0, 0, 0};
		
		System.out.println("첫번째 수 입력: ");
		a = Integer.parseInt(br.readLine());
	
		System.out.println("두번째 수 입력: ");
		b = Integer.parseInt(br.readLine());

		
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
		
		System.out.println("두 수의 합: " + result[0]);
		System.out.println("두 수의 차: " + result[1]);
		System.out.println("두 수의 곱: " + result[2]);
		System.out.println("두 수의 나누기: " + result[3]);
		
	}
	

}
