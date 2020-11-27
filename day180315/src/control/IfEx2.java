package control;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.print("수를 입력 : ");
		i = sc.nextInt();
		
		String s = (i % 2 == 0) ? "짝수" : "홀수";
		
		//sysout 이 들어가도 되나?????????
		/*
		 * (i % 2 == 0) ? System.out.print("짝수") : System.out.print("홀수");
		 * 은 안된다.
		 * 
		 */
		
		
		System.out.printf("당신이 입력하신 수 %d 은(는) %s입니다. %n", i, s);
		// %n = \n 호환 가능
		

	}

}
