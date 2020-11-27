package exex;

import java.util.*;
import java.io.*;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 3단으로만
       int i, j, k;
        
        for (k = 1; k <= 3; k++) { 
        	for (j = 1; j <= 9; j++) {
        		for (i = 3*k-2; i <= 3*k; i++) {
        			if ((i % 3 == 0) && (j == 9)) {
        				System.out.printf("%d X %d = %d\n\n", i, j, i*j);
        			} else if (i % 3 == 0) {
        				System.out.printf("%d X %d = %d\n", i, j, i*j);
        			} else {
        				System.out.printf("%d X %d = %d\t", i, j, i*j);	
        			}        			
        		}
        	}        	
        }
		
		
        // 일단 답 나옴
/*		int i, j, k, l;

		System.out.print("열 입력 : ");

		l = System.in.read() - 48;

		for (k = 0; k < 9 / l +1 ; k++) {
			for (j = 1; j <= 9; j++) {
				for (i = l * k + 1; i <= l * k + l; i++) {
					
					if (i == 10) {
						break;
					}

					if (i % l == 0 && j == 9) {
						System.out.printf("%d X %d = %d\n\n", i, j, i * j);
					} else if (i % l == 0 || i ==9) {
						System.out.printf("%d X %d = %d\n", i, j, i * j);
					} else {
						System.out.printf("%d X %d = %d\t", i, j, i * j);
					}

				}
			}

		}*/
		
/*		int i, j, k, l;

		System.out.print("열 입력 : ");

		l = System.in.read() - 48;

		for (k = 1; k <= 9 / l + 1 + 1; k++) {

			for (j = 1; j <= 9; j++) {

				for (i = l * (k - 1) + 1; (i <= l * (k - 1) + l) && (i <= 9); i++) {

					if (i % l == 0 && j == 9) {
						System.out.printf("%d X %d = %d\n\n", i, j, i * j);
					} else if (i % l == 0 || i == 9) {
						System.out.printf("%d X %d = %d\n", i, j, i * j);
					} else {
						System.out.printf("%d X %d = %d\t", i, j, i * j);
					}

				}
			}

		}*/
		
		
/*		int i, j, k, l;

		System.out.print("열 입력 : ");

		l = System.in.read() - 48;

		for (k = 1; k <= 9/l + 1 + 1; k++) {
			
			for (j = 1; j <= 9; j++) {
				
				for (i = l * (k-1) +1; i <= 9; i++) {
					
					if (i == j * k * l) {
						System.out.printf("%d X %d = %d\n", i, j, i * j);
					} else {
						System.out.printf("%d X %d = %d\t", i, j, i * j);
					}

				}
			}

		}*/
		
		// 정답
		
/*		Scanner sc = new Scanner(System.in);
		int i,j,k,num;
		System.out.print("열의 단 입력 : ");
		num = sc.nextInt();
		
		
		for(i=1; i<9 ; i += num) {
			for (j=1; j <= 9; j++) {
				for (k=1; k<= num; k++) {
					if(i+k <= 9) {
						System.out.print((i+k)+ " * " + j + "=" + ((i+k)*j)+ "\t");
					}
					System.out.println();
				}
				System.out.println();
			}
			
		}*/
		

	}

}
