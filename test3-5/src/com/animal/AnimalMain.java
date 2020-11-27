package com.animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		hospital.inject(tiger);
		hospital.inject(cat);
		hospital.inject(dog);
		
	}
	
}
