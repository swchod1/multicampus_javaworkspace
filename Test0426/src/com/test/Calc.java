package com.test;
/*
Calc 클래스를 작성하고 사칙연산을 계산하는 메소드를 구현
단, 메소드는 반환형을 갖으며 두 개의 인자 값을 받는다.
CalcExam 실행클래스에서 네 개의 메소드를 호출하여 결과값을 반환받아 결과를
출력하시오.
메소드명은 add(), sub(), mul(), div()로 정의 하시오.
*/
public class Calc {
	
	int a, b;
	
	
	public Calc(int a, int b) {
		// TODO Auto-generated constructor stub

		this.a = a;
		this.b = b;

	}

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public int mul() {
		return a * b;
	}

	public int div() {
		return a / b;
	}

}
