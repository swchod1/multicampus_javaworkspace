package com.awtprac;

import java.awt.*;

public class BorderEx01 extends Frame {

	Label a, b, c, d, e;
	
	public BorderEx01() {
		// TODO Auto-generated constructor stub
		
		super("임시창");
		
		a = new Label("상", Label.CENTER);
		b = new Label("하", Label.CENTER);
		c = new Label("좌", Label.CENTER);
		d = new Label("우", Label.CENTER);
		e = new Label("중", Label.CENTER);
		
		setLayout(new BorderLayout(3,3));
		
		setBackground(Color.yellow);
		
		add(a, BorderLayout.NORTH);
		add(b, BorderLayout.SOUTH);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add(e, BorderLayout.CENTER);
		
		a.setBackground(Color.BLACK);
		b.setBackground(Color.BLACK);
		c.setBackground(Color.BLACK);
		d.setBackground(Color.BLACK);
		e.setBackground(Color.BLACK);
		
		a.setForeground(Color.white);
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);
		
		a.setFont(new Font("굴림체", Font.BOLD, 20));
		b.setFont(new Font("굴림체", Font.BOLD, 20));
		c.setFont(new Font("굴림체", Font.BOLD, 20));
		d.setFont(new Font("굴림체", Font.BOLD, 20));
		e.setFont(new Font("굴림체", Font.BOLD, 20));
		
		
		WinEvent01 we = new WinEvent01();
		addWindowListener(we);
		setSize(500, 500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new BorderEx01();

	}

}
