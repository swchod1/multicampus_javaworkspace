package com.threadprac;

public class MusicPlayer extends Thread {
	
	int type;
	MusicBox musicbox;	
	
	public MusicPlayer(int type, MusicBox musicbox) {
		// TODO Auto-generated constructor stub
		
		this.type = type;
		this.musicbox = musicbox; 
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		switch (type) {
		case 1:
			musicbox.playMusicA();
			break;
		case 2:
			musicbox.playMusicB();
			break;
		case 3:
			musicbox.playMusicC();
			break;
		}
	}

}
