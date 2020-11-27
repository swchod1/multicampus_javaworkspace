package com.animal;

public class Dog extends Animal {

	private String name;


	public Dog() {
		name = getClass().getSimpleName(); //Ŭ���� ���� ��(getClass()), Ŭ������ ������ �ִ� �̸��� ������ �� ������(getSimpleName())
		//name = "Dog" �� ����.
	}
	
	@Override
	public String scream() {
		
		return "��~~~~��";
		
	}
	
	@Override
	public String getName() {
		return name;
		
	}
	

}
