package com.eventex;

import java.awt.*;
import java.awt.event.*;
import com.awtex.WinEvent;

public class MouseMotionEventEx extends Frame implements MouseMotionListener {
	
	
	public MouseMotionEventEx() {
		// TODO Auto-generated constructor stub

		super("마우스 모션");
		
		addMouseMotionListener(this);

		
		WinEvent we = new WinEvent();
		addWindowListener(we);

		setSize(300, 300);
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
/*
		if(e.getSource() == this ) {
			System.out.println("X = " + e.getX() + ", Y = " + e.getY());
		}
		*/

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == this ) {
			System.out.println("X = " + e.getX() + ", Y = " + e.getY());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MouseMotionEventEx();

	}

}
