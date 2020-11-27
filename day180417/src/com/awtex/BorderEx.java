package com.awtex;

import java.awt.*;

public class BorderEx extends Frame {
	
	Label a, b, c, d, e;
	
	public BorderEx() {
		// TODO Auto-generated constructor stub
		
		super("보더레이아웃");
		
		// 레이아웃 설정
		setLayout(new BorderLayout(3,3));
		
		a = new Label("상", Label.CENTER);
		b = new Label("하", Label.CENTER);
		c = new Label("좌", Label.CENTER);
		d = new Label("우", Label.CENTER);
		e = new Label("이동", Label.CENTER);
		
		
		
		
		setBackground(Color.yellow);
		
		a.setBackground(Color.gray);
		b.setBackground(Color.red);
		c.setBackground(Color.green);
		d.setBackground(Color.blue);
		e.setBackground(Color.magenta);
		
		a.setForeground(Color.white);
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);
		
		add("North", a);
		add("South", b);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add("Center", e);
	
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		
		
		// 2
		setLocation(300, 300);
		pack();
		// pack(); ??? -> 자기 마음데로 늘린다???
		
		//2
		
		
		// 1
		// setSize(300, 300);
		// 1
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new BorderEx();

	}

}
