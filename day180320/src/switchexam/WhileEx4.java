package switchexam;

/*
 * 사용자로 부터 임의의 두 정수를 입력 받아 작은수 부터 큰수 까지의 합계를 구하는
 * 프로그램 작성
 * 
 * 단, 큰수를 먼저 입력받았을 경우
 * 작은 수를 앞으로 큰수를 뒤로 하여 처리하시오.
 */

import java.io.*;

public class WhileEx4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//내가 한거
/*		int x, y, z, sum = 0;
		
		System.out.print("입력 받을 수 1 : ");
		x = Integer.parseInt(br.readLine());
		System.out.print("입력 받을 수 2 : ");
		y = Integer.parseInt(br.readLine());
		
		if (x >= y) {
			x = x^y;
			y = y^x;
			x = x^y;
		}
		z = x;
		while (z <= y) {
			sum += z;
			z++;
		}
		System.out.printf("%d~%d까지의 합은 %d이다.", x, y, sum);*/
		
		//강사님이 하신거
		
		int n1, n2, n, result = 0;
		
		System.out.print("첫번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		
		// 입력받은 두수의 크기 비교 및 자리바꿈
		// n1이 n2보다 클 경우 자리바꿈 수행
		
		if (n1 > n2) { // n2가 클 경우 조건문은 수행하지 않음
			
			// 자리 바꿈 처리
			n1 = n1 ^ n2;
			n2 = n2 ^ n1;
			n1 = n1 ^ n2;
		}
		
		// 반복문 진입전에 작은 수를 저장해야 함.
		
		n = n1;
		while (n <= n2) {
			result += n;
			n++;
		}
		
		// 결과 출력
		
		System.out.printf("%d~%d까지의 합계 : %d\n", n1, n2, result);
		
		
				
				
		
		

	}

}
