package com.abstr;


// 추상 클래스
public abstract class Diagram {
	
	// 추상 메소드
	abstract void draw();
	
	
}
/* 추상 메소드는 private로 선언 안됨
 * 이유 - 자식이 오버라이딩 해야하는데 못하기 때문에
 * 
 * 추상 메소드가 static으로 선업 안됨
 * 이유 - 객체 없어도 호출이 되는 메소드이므로 반듯이 바디가 정의 되어야 호출할 수 있다.
 * 
 * 
 * 
 */
