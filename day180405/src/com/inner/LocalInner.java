package com.inner;

public class LocalInner {
	
	int a = 100; // 클래스의 인스턴스 변수


	public void innerEx(int k) { // 인스턴스 메소드
		
		int b = 200; // 지역변수
		final int c = k; // 상수
		// static int d = 300; // 컴파일 에러 static 변수는 사용불가 // 외부 클래스가 
		
		class Inner { // 클래스가 메소드 안에 들어와 있음
			
			public void getData() {
				
				System.out.println("int a : " + a);
				// 로컬 내부클래스는 지역변수와 상수 모두 사용 가능하다.

				System.out.println("int b : " + b);
				System.out.println("final int c : " + c);
			}
			
		}// 내부클래스 엔드
		
		// 메소드 내에 로컬 내부클래스의 인스턴스 생성 가능
		Inner i = new Inner();
		i.getData();
		// 생성한 인스턴스(객체)를 통해서 메소드 호출가능함.
		
	}// 메소드 엔드


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalInner li = new LocalInner();
		
		li.innerEx(1000);
		

	}

}
