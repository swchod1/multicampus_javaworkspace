package com.threadprac;

public class MusicBox {

	public synchronized void playMusicA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("신난 음악");
			
			try {
				Thread.sleep((int) Math.random() * 10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		

	}

	public synchronized void playMusicB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("슬픈 음악");
			
			try {
				Thread.sleep((int) Math.random() * 10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		

	}

	public void playMusicC() {
		for (int i = 0; i < 10; i++) {
			
			synchronized(this) {
				System.out.println("까페 음악");
			}
			
			

			try {
				Thread.sleep((int) Math.random() * 10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
