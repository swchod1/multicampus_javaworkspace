package com.inher;

// 6
import java.util.*;
// 6

public class InherEx3 extends SuperEx3 {
	
		
	// 3
	// 입력 메소드
	public void input() {
	
		// 7
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수 입력 : ");
		String str = sc.nextLine(); // 공백을 포함해서 입력됨
		str = str.replaceAll("\\s", ""); // Scanner에서 사용 치환한다 모든 문자열을 공백으로 바꾼다. ???
		/*  \\s --> 스페이스바 를 "" ---> 공백으로 리플레이스 치환!!!
		 * 3, 4를 3,4로

		 */
		
		System.out.print("연산자 입력 : ");
		oper = sc.nextLine();
		oper = oper.trim(); // 공백을 제거함?? +엔터칠때 엔터값 제거
		
		String su[] = str.split(","); // 양싸이드의 문자열을 , 로 구분 하겠다 ????
		// , 양 쪽의 수를 su[]배열에 넣음 su[0] = , 왼쪽수  3 ,,, su[1] = , 오른쪽 수 4
		num1 = Integer.parseInt(su[0]); // 3
		num2 = Integer.parseInt(su[1]);	// 4	
		
		
		
		// 7
		
		
		
	}
	
	
	// 연산 메소드
	public double calc() {
		
		double result = 0;
		
		// 5
		if (oper.equals("+")) {
			result = num1 + num2;
		} if (oper.equals("-")) {
			result = num1 - num2;
		} if (oper.equals("*")) {
			result = num1 * num2;
		} if (oper.equals("/")) {
			result = num1 / num2;
		}		
		// 5
		
		return result;		
	}
	// 3
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 4
		InherEx3 ie = new InherEx3();
		ie.input();
		double s = ie.calc();
		ie.write(s);
		// 4
		

	}

}
