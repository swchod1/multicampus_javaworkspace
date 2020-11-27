package com.abstr;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diagram[] ref = new Diagram[3];
		
		ref[0] = new Triagle();
		ref[1] = new Circle();
		ref[2] = new Rectagle(); 
		
		for(int i = 0; i< ref.length; i++) {
			ref[i].draw();
		}
		

	}

}
