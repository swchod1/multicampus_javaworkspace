package com.awtprac;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameEx04 extends Frame {

	public FrameEx04() {
		
		super("임시창");
		addWindowListener(new WinEvent01Ex());
		setSize(300, 300);
		setVisible(true);
	}
	
	class WinEvent01Ex extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FrameEx04();

	}

}
