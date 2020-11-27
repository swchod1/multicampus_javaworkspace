package com.inner;

public class StaticInner {
	
	int a = 10;
	private int b = 10;
	static int c = 200;
	
	static class Inner {
		
		/*
		 * 어쩔 수 없이 내부 클래스를 static으로 선언해야 할 경우가 있음
		 * 그건 바로 내부 클래스의 멤버필드 중 하나라도 static 필드가 있을 경우 사용함
		 * 
		 */
		
		static int d = 1000;
		
		public void printData() {
			
			// System.out.println("int a : " + a); // static 인 내부클래스 에서는 static 만 받는 듯?? 암튼 에러남
			// System.out.println("private int b : " + b); // static 인 내부클래스 에서는 static 만 받는 듯?? 암튼 에러남
			System.out.println("static int c : " + c);
			System.out.println("static int d : " + d);
			
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticInner.Inner si = new StaticInner.Inner();
		
		si.printData();
		
		
		

	}

}
