package com.excp;

public class ExceptionEx4 {
	

	////자신을 호출한 메소드로 익셉션을 위임함(전가) -> 메인에 전가 등...
	
	private static void test() throws Exception {
		
		System.out.println(6/0);
		
	}
	
	
	

	public static void main(String[] args) { // throws Exc... IOExc... 을 쓰거나
		// TODO Auto-generated method stub
		
		ExceptionEx4 ee = new ExceptionEx4();
		
		// ee.test(); // 이걸 쓰려면 위에 
		
		///// 혹은  이렇게///////
		try {
			ee.test();
			// 메소드를 호출한 곳에서도 try ~ catch 구문으로 예외처리 해야함
		} catch (Exception e) {
			e.printStackTrace();
		} 
		///// 혹은  이렇게///////
		

	}

}
