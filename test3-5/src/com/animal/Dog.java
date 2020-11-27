package com.animal;

public class Dog extends Animal {

	private String name;


	public Dog() {
		name = getClass().getSimpleName(); //클래스 지정 후(getClass()), 클래스가 가지고 있는 이름을 가져다 쓸 수있음(getSimpleName())
		//name = "Dog" 와 같다.
	}
	
	@Override
	public String scream() {
		
		return "멍~~~~멍";
		
	}
	
	@Override
	public String getName() {
		return name;
		
	}
	

}
