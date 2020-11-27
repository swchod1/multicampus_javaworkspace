package com.game;

public class SiegeTank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! SiegeTank   x: " + x +  ", y: " + y +"¿‘¥œ¥Ÿ.");
	}

	@Override
	void stop() {
		System.out.println("Destination?");
		
	}

	@Override
	void message() {
		System.out.println("Mesage:: Go SiegeTank!!!");
	}

	void changeMode() {
		System.out.println("Yes, Sir!");
	}


}
