package com.animal;

public class Tiger extends Animal {

	private String name;
	
	public Tiger() {
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
