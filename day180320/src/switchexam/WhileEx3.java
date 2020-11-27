package switchexam;

/*
 * 사용자로부터 임의의 정수를 입력받아
 * 입력받은 정수가 소수인지 아닌지를 판별하는 프로그램을 작성하시오.
 * while 문 사용
 * 
 * 소수 : 1 또는 자신의 값 이외의 어떤 수로도 나눌 수 없는 값을 의미함
 * 
 * 소수를 구하는 법은 
 * 에라토스테네스의 체 알고리즘으로 구현됨
 */

import java.util.*;
import java.io.*;

public class WhileEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
/*		Scanner sc = new Scanner(System.in);
		
		int x = 2, y = 0, z=1, num, data[] = {}, prime[] = {};
		
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		while (x < num) {
			data[y] = x;
			prime[y] = 2*z;
			x++;
			y++;
			z++;
		}
		x = 2, y = 0, z = 1;
		while ()  {
			
			
		}*/
        /*Scanner sc = new Scanner(System.in);
		
		int x = 2, num;
		
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		while (x < num) {
			
		}
		*/
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		
		// 주요 변수
		int num, i = 2;
		
		// 연산 및 처리
		
		// 출력 안내 메세지
		System.out.print("수 입력 : ");
		num = Integer.parseInt(br.readLine());
		// 17(2~~~~~16)
		
		boolean flag = true;//소수일때
		
		while (i < num) {
			if (num % i == 0) {
				flag = false; // 소수가 아니다.
			}
			i++;
		}
		
		// 입력값이 1인지 여부도 함께 확인
		// 결과 출력
		
		if (flag && num !=1) {
			System.out.println(num + "==> 소수");
		} else {
			System.out.println(num + "==> 소수아님!!");
		}

	}

}
