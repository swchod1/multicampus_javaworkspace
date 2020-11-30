package study;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
	
		// GIT TEST2
		
		Scanner sc = new Scanner(System.in);
		
		int n, sum =0 ;
		
		do {
			
			System.out.print("정수입력 (0종료):");
			n= sc.nextInt();
			
			sum += n;
		
		}while( n != 0);
		
		System.out.println("총합계:"+sum);
	}

}
