package com.awtex;

import javax.swing.*;

public class FrameEx2 extends JFrame {
	
	public FrameEx2() { // Ex1과 비교
		// TODO Auto-generated constructor stub
		
		//1
		
		super("프레임 두번째");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ex1의 닫기 클래스를 따로 해놓은 것과 다름
		
		//1
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		
		new FrameEx2(); 
		
		// 1
		
		// 2번
		/*
		JFrame f = new JFrame("프레임 두번째");
		
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
		// 2번

	}

}
