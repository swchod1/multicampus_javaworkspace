package com.animal;

public class Hospital {

	public void inject(Animal animal) {
		
		System.out.println(animal.getName() + "을(를) 치료");
		System.out.println(animal.scream());
		
	}
	
}
