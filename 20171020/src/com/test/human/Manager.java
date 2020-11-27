package com.test.human;

import java.util.ArrayList;

public class Manager {
	private ArrayList<Human> list;
	
	public Manager() {
		list = new ArrayList<>();
	}
	
	public boolean insert(Human h) {
		boolean isAdded = list.add(h);
		return isAdded;
	}
	
	public Human select(String socialNumber) {
		Human result = null;
		for (int i = 0; i < list.size(); i++) {
			Human temp = list.get(i);
			
			if (socialNumber.equals(temp.getSocialNumber())) {
				result = temp;
				break;
			}
		}
		return result;
	}
	
}








