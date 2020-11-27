package com.excp;

public class ExceptionEx3 {
	
	int[] ss;
	
	public ExceptionEx3() {
		// TODO Auto-generated constructor stub
		
		ss = new int[3];
		
	}
	
	public void program() {
		
		for(int i = 0; i <= ss.length; i++ ) {
			System.out.println("for문 시작 " + i + "번째");
			try {
				System.out.println(ss[i]);
			} catch (Exception e) {
				// TODO: handle exception
				
				System.out.println("예외발생" + e);
				return;
			} finally {
				System.out.println("나 무조건 나와!!");
			}
			System.out.println("for문 끝 " + i + "번째");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionEx3 ee = new ExceptionEx3();
		
		ee.program();
		// ee.test();

	}

}
