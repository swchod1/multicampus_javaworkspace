package exex;

import java.io.*;


public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
/*		int i=1, j, k = 20;

			for (i = 1; i <= 4; i++) {
				for (j = 5*i-4; j<= 5*i; j++) {
					if (i%2 == 0) {
						System.out.printf("%d\t", k-j-4);
					} else {
					System.out.printf("%d\t", j);
					}					
				}
				
				System.out.println();
				
			}*/
		
		//일단 됨
/*		int i, j, k = 20;

		for (i = 0; i <= 3; i++) {
			for (j = 1; j<= 5; j++) {
				if (i % 2 != 0) {
					System.out.printf("%d\t", 5*(i+1)-j+1);
				} else {
				System.out.printf("%d\t", 5*i+j);
				}					
			}
			
			System.out.println();
		}*/
		
		// 됨 이거임
/*		int i, j;

		for (i = 0; i <= 15; i +=5) {
			for (j = 1; j<= 5; j++) {
				if (i % 2 != 0) {
					System.out.printf("%d\t", i-j+6);
				} else {
				System.out.printf("%d\t", i+j);
				}					
			}
			
			System.out.println();
		}*/
		
		//선재
/*		  int i, j;

		  for (i = 1; i < 17; i += 5) {

		   if (i == 6 || i == 16) {

		    for (j = i + 4; j > i - 1; j--) {

		     System.out.printf("%2d \t", j);

		    }

		   } else {

		    for (j = i; j < i + 5; j++) {

		    
		     System.out.printf("%2d \t", j);

		    }
		   }
		   System.out.println();
		   
		  }*/
		
		//태양
		BufferedReader br = new BufferedReader(
			    new InputStreamReader(System.in));
		
		
/*		int i, k, o;

		System.out.print("몇개로 하실건지:");
		o = Integer.parseInt(br.readLine());

		int j = 0;
		int b = o;

		for (k = 1; k <= o - 1; k++) // 4 by 5 행렬로 만들기 위해서는 o-1까지로 해준다.
		{ // n by n 이라면 -1을 지워준다.
			if (k % 2 != 0) // 홀수 줄에서는 다음과같이 동작
			{
				for (i = 1; i <= b; i++) {
					System.out.printf("%d ", i + j);
					if (i == b) {
						System.out.println(); // 끝에 까지 수행이 완료되면 j를 이니셜라이즈
						j = o * k;
					}
				}
			} else if (k % 2 == 0) // 짝수 줄에서는 다음과같이 동작
			{
				for (i = b; i >= 1; i--) // n n-1 n-2 처럼 출력되게 for문 선언
				{
					System.out.printf("%d ", j + i);
					if (i == 1) {
						System.out.println(); // 끝에 까지 수행이 완료되면 j를 이니셜라이즈
						j = o * k;
					}
				}
			}
		}*/
		
		
		
		
		int i, j, a, b, k = 0;

		System.out.print("행 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("열 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.printf("만드실 행렬은 %d X %d 행렬입니다.\n", a, b);

		for (i = 0; i <= (a - 1) * b; i += b, k++) {
			for (j = 1; j <= b; j++) {
				if (k % 2 != 0) {
					System.out.printf("%d\t", i - j + b + 1);
				} else {
					System.out.printf("%d\t", i + j);
				}
			}

			System.out.println();
		}
		
		
			

	
	}
}
