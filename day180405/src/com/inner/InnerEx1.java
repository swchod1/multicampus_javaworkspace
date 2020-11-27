package com.inner;

class OuterEx {
	
	public class InnerEx {
		
		int x = 5;
		
	}
	
}


public class InnerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 외부클래스 인스턴스부터 먼저 생성한다.
		OuterEx oe = new OuterEx();
		
		// 외부클래스를 통해서 내부클래스의 인스턴스를 생성한다.
		
		OuterEx.InnerEx ie = oe.new InnerEx();

	}

}
