package com.threadprac;

public class MusicBoxExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MusicBox musicbox = new MusicBox();
		
		MusicPlayer cho = new MusicPlayer(1, musicbox);
		MusicPlayer kim = new MusicPlayer(2, musicbox);
		MusicPlayer lee = new MusicPlayer(3, musicbox);
		
		cho.start();
		kim.start();
		lee.start();

	}

}
