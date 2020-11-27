package exex;

/*
 * 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 
 * 2의 배수인지, 3의 배수 인지, 2와3의 배수인지, 2와 3의 배수가 아닌지를 판별하는
 * 프로그램을 작성하시오
 * 단, if를 이용하여 처리하시고, 
 * BufferedReader 로 처리하시오.
 * 
 */

import java.io.*;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				                           new InputStreamReader(System.in));
		
		int a;
		System.out.print("입력 수 : ");
		a = Integer.parseInt(br.readLine());
		
		
/*		if ((a % 2 == 0) && (a % 3 == 0)) {
			System.out.println("입력 수" + a + "는 2와3의 배수입니다.");
		} else {
			System.out.println("입력 수" + a + "는 2와3의 배수가 아닙니다.");
		}*/
			  
		
		if ((a % 2 == 0) && (a % 3 == 0)) {
			System.out.println("입력 수" + a + "는 2와 3의 배수입니다.");
		} else if (a % 2 == 0) {
			System.out.println("입력 수" + a + "는 2의 배수입니다.");
		} else if (a % 3 == 0) {
			System.out.println("입력 수" + a + "는 3의 배수입니다.");
		} else {
			System.out.println("입력 수" + a + "는 2와3의 배수가 아닙니다.");
		}
		
		
		

				                       

	}

}
