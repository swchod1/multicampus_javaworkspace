package com.inner;

public class MemberInner {
	
	int a = 10;
	
	private int b = 100;
	
	static int c = 200;
	
	class Inner { // 내부 클래스 정의
		
		public void printData() {
			
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b); // 값 나옴
			// 외부클래스를 참조하여 데이터를 출력하고자 할때
		    // 내부클래스에 대한 접근을 아무 거부없이 허용
			System.out.println("static int c : " + c);
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberInner.Inner mi = new MemberInner().new Inner();
		
		mi.printData();
		

	}

}
