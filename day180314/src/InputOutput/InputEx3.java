package InputOutput;

import java.io.*;

public class InputEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 숫자 하나 입력 받기
		// int x = System.in.read() - 48;
		// int x = System.in.read() - '0';
		
		int num1;
		int num2;
		
		System.out.print("첫번째 수 : ");
		num1 = System.in.read() - 48;  // 1. 0의 아스키 코드 48 
		                                           // 입력숫자가 아스키 코드로 변환되어 인식 거기서 
		                                           // 0의 아스키 코드를 빼주어야 int형 숫자로 전환
		System.in.read();
		System.in.read(); // 이후 입력 값이 더 있을 때, 두개를 사용하지 않으면 에러,
		                        // 엔터 누른 것을 수로 인식해서
		
		//System.in.skip(0); //?? 위에 두개 쓴걸 한번에 처리
	
	
		
		System.out.print("두번째 수 : ");
		num2 = System.in.read() - '0';  //  컴퓨터가 '0'을 0의 아스키 코드인 48로 인식 
		                                           // 이후 1. 과 같은 원리
		
		int c = num1 + num2;
		System.out.println("두 수의 합계 : " + c);
		

	}

}
