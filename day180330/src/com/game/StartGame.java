package com.game;

public class StartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Unit[] ref = new Unit[3]; // 유닛이 들어갈 공간을 만든다. 
		
		ref[0] = new Marine(); // 다형화
		ref[1] = new SiegeTank();
		ref[2] = new DropShip();
		
		for(int i = 0; i < ref.length; i++) {
			
			System.out.println("==========================");
			
			// 모든 유닛을 이동시킴
			ref[i].move(100, 200);
			ref[i].message();
			
			System.out.println("==========================");
			
		}
		

	}

}
