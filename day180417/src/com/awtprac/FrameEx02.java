package com.awtprac;

import javax.swing.*;

public class FrameEx02 extends JFrame {
	
	public FrameEx02() {
		// TODO Auto-generated constructor stub
		/*
		super("임시창");
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		new FrameEx02();
		*/
		
		JFrame jf = new JFrame("임시창");
		
		jf.setSize(300, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

	}

}
