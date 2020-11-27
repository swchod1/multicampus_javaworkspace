package com.game;

public class StartGame {

	public static void main(String[] args) {
		Unit[] ref = new Unit[3];
		
		ref[0] = new Marine();
		ref[1] = new SiegeTank();
		ref[2] = new Dropship();
	
		for(int i= 0; i<ref.length; i++ ) {
			System.out.println("===================");
			//¸ðµç À¯´Ö ÀÌµ¿½ÃÅ´
			ref[i].move(100, 200);
			ref[i].message();
			System.out.println("===================");
			System.out.println();
		}
		
		
	}
	
}
