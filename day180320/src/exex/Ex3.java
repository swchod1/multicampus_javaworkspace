package exex;

import java.io.*;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*int i, j, k = 1, l = 7 ,m = 0;

		for (i = 1; i <= 4; i++) {
			for (j = 17-i; j >= 1; j -= k) {
					System.out.printf("%d\t", j);
					m = k;
					k = l;
					l = m;							
			}	
			
			k = k+2;
			l = l-2;
					

			System.out.println();
		}*/
		
		// 선재
/*		  int i, j;

		  for (i = 16; i > 12; i--) {

		   for (j = i; j >= 17-i; j--) {
		    
		    if(i==16 && (j==16 || j==9||  j==8 || j==1))
		     System.out.printf("%d \t", j);
		    if(i==15 && (j==15 || j==10||  j==7 || j==2))
		    System.out.printf("%d \t", j);
		    if(i==14 && (j==14 || j==11||  j==6 || j==3))
		     System.out.printf("%d \t", j);
		    if(i==13 && (j==13 || j==12||  j==5 || j==4))
		     System.out.printf("%d \t", j);
		   }
		   
		   System.out.println();

		  }*/
		
		//태양
		BufferedReader br = new BufferedReader(
			    new InputStreamReader(System.in));
		
/*		int i, k = 0, o;

		System.out.print("수를 입력하세요:"); //
		o = Integer.parseInt(br.readLine());

		if (o % 2 == 0) // o가 짝수라면
		{
			k = o * o;

			for (int j = 0; j < o; j++) {
				for (i = 1; i <= o; i++) {
					if (i % 2 != 0) {
						System.out.printf("%d ", k);
						k -= 2 * o - 1 - 2 * j;
					} else if (i % 2 == 0) {
						System.out.printf("%d ", k);
						k -= 1 + 2 * j;
					}
				}
				System.out.println();
				k = o * o - (j + 1);
			}
		}
		////////////////////////////////////////////////////////////
		else if (o % 2 != 0) // 수가 홀수라면
		{
			k = o * o - (o - 1);

			for (int j = 0; j < o; j++) {
				for (i = 1; i <= o; i++) {
					if (i % 2 != 0) {
						System.out.printf("%d ", k);
						k -= 1 + 2 * j;
					} else if (i % 2 == 0) {
						System.out.printf("%d ", k);
						k -= 2 * o - 1 - 2 * j;
					}
				}
				System.out.println();
				k = o * o - (o - 1) + (j + 1);
			}
		}*/
		
		int a, b;

		System.out.print("행 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("열 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.printf("만드실 행렬은 %d X %d 행렬입니다.\n", a, b);

		int i, j, k, l, m = 0;
		k = 1;
		l = 2 * a - 1;

		for (i = 1; i <= a; i++) {
			for (j = a*b+1-i; j >= 1; j -= k) {
				System.out.printf("%d\t", j);
				m = k;
				k = l;
				l = m;
			}

			if (b % 2 != 0) {
				m = k;
				k = l;
				l = m;
			}

			k = k + 2;
			l = l - 2;

			System.out.println();
		}
		
		

	}

}
