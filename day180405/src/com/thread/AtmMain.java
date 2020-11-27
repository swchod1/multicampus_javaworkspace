package com.thread;

public class AtmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		// 먼저 실행 되는 쪽에서 제어권을 쥐고 for문 끝까지 행함
		
		mother.start();
		son.start();

	}

}
