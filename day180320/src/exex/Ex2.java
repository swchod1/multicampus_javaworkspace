package exex;


import java.io.*;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//됨
/*		int i, j, k = 1, l = 7 ,m = 0;

		for (i = 1; i <= 4; i++) {
			for (j = i; j <= 16; j += k) {
					System.out.printf("%d\t", j);
					m = k;
					k = l;
					l = m;							
			}	
			
			k = k+2;
			l = l-2;
					

			System.out.println();
		}*/

		
	 /*int i, j, k = 20;

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
		
		//태양
		BufferedReader br = new BufferedReader(
			    new InputStreamReader(System.in));
		
/*		int i, k = 0, o;

		System.out.print("수입력:"); //
		o = Integer.parseInt(br.readLine());
		if (o % 2 == 0) {
			k = 1;

			for (int j = 0; j < o; j++) {
				for (i = 1; i <= o; i++) {
					if (i % 2 != 0) {
						System.out.printf("%d ", k);
						k += 2 * o - 1 - 2 * j;
					} else if (i % 2 == 0) {
						System.out.printf("%d ", k);
						k += 1 + 2 * j;
					}
				}
				System.out.println();
				k = 1 + (j + 1);
			}
		}

		else if (o % 2 != 0) {
			k = 1;

			for (int j = 0; j < o; j++) {
				for (i = 1; i <= o; i++) {
					if (i % 2 != 0) {
						System.out.printf("%d ", k);
						k += 2 * o - 1 - 2 * j;
					} else if (i % 2 == 0) {
						System.out.printf("%d ", k);
						k += 1 + 2 * j;
					}
				}
				System.out.println();
				k = 1 + (j + 1);
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
		l = 2*a-1;
		

		for (i = 1; i <= a; i++) {
			for (j = i; j <= a*b; j += k) {
					System.out.printf("%d\t", j);
					m = k;
					k = l;
					l = m;							
			}	
			
			if (b%2 != 0) {
				m = k;
				k = l;
				l = m;	
			}
			
			k = k+2;
			l = l-2;
					

			System.out.println();
		}
		
		
	}

}
