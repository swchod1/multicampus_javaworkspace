package com.test.human;

public class Human {
	private String name;
	private int age;
	private String socialNumber;
	
	/*
	 * Constructors
	 */
	public Human() {}

	public Human(String name, int age, String socialNumber) {
		this.name = name;
		this.age = age;
		this.socialNumber = socialNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
		
		if ((obj instanceof Human) == false) {
			return false;
		}
		
		Human h = (Human) obj;
		
		if (this.socialNumber.equals(h.socialNumber) == false) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", socialNumber=" + socialNumber + "]";
	}

	/*
	 * Getters and setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSocialNumber() {
		return socialNumber;
	}

	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}
}
