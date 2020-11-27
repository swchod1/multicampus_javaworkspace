package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx4 extends Frame { // 종료 내부클래스 활용

	public FrameEx4() {
		// TODO Auto-generated constructor stub
		
		super("네번째 프레임");
		addWindowListener(new WinEventEx());
		setSize(300, 200);
		setVisible(true);
		
	}
	
	class WinEventEx extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FrameEx4();

	}

}
