package com.awtprac;

import java.awt.*;

public class FrameEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame("임시창");
		
		WinEvent01 we= new WinEvent01();
		f.addWindowListener(we);
		
		f.setSize(300, 300);
		f.setVisible(true);
		
		

	}

}
