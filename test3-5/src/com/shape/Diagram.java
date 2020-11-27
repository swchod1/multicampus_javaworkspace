package com.shape;

// 추상클래스

// 추상 메소드
// - 추상 메소드는 private로 선언안됨
// - 이유: 자식이 오버라이딩 해야하는데 못하기 때문

// 추상메소드가 static으로선언될 수 없는 이유
// - 객체 없이도 호출이 되는 메소드 이므로, 반드시 body가 정의되어야 호출할 수 있다.

public abstract class Diagram {

	abstract void draw();
	//추상 메소드 선언(일종의 틀. 자식 클래스가 무조건 오버라이딩 해서 재정의해야한다)
	
	
}
