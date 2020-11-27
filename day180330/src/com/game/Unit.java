package com.game;

public abstract class Unit { // 추상 클래스
	
	int x, y;
	
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();

}
