package com.excp;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 50;
		int result = 0;

		for (int i = 0; i < 10; i++) {

			try { // 예외처리가 발생할 가능성이 있는 코드부분
				result = num / (int) (Math.random() * 5);
				System.out.println(result);
			} catch (ArithmeticException e) { // ArithmeticException 예상되는 예외 객체
				                                          // e : 객체의 변수명
				// 예외가 발생했을때 어떤 예외인지 이부분에 출력
				// System.out.println("Exception 발생!!!!!!!!");
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		

	}

}
