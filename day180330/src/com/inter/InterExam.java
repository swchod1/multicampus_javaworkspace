package com.inter;

public class InterExam implements InterEx {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}
	
	public static void main(String[] args) {
		
		InterExam ie = new InterExam();
		System.out.println(ie.getA());
		
		
	}
	

}
