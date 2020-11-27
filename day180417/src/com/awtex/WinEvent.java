package com.awtex;

import java.awt.event.*;

public class WinEvent extends WindowAdapter {
	
	 // x버튼을 눌렀을 때 닫기 이벤트를 구현한 클래스
	// 스윙은 바로 되는데 awt는 따로 구현을 해주어야 함.
	
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
			System.exit(0);
			
		}

}
