package study;

import java.util.Scanner;

public class DoWhileEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i=1;
		
		System.out.print("원하는 단 입력:");
		n= sc.nextInt();
				
		if(n>=2 && n<=9) {
			
			do
			{
				System.out.println(n+" * "+i +"="+(n*i));
				i++;
			} while(i<=9);
		}else {
			System.out.println("2 ~ 9 사이의 정수만 가능합니다.");
		}

	}

}
