package com.animal;

public class Cat extends Animal {

	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();
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
