package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx5 extends Frame { // 종료 익명클래스 활용

	public FrameEx5() {
		// TODO Auto-generated constructor stub

		super("다섯번째 프레임");
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FrameEx5();

	}

}
