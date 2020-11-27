package com.eventex;


import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class KeyEventEx extends Frame implements KeyListener {
	
	Label la = new Label("주민번호 : ", Label.RIGHT);
	Label la1 = new Label("-", Label.CENTER);
	
	TextField jumin1 = new TextField(10);
	TextField jumin2 = new TextField(10);
	
	Button bt = new Button("확인");
	
	
	public KeyEventEx() {
		// TODO Auto-generated constructor stub
		
		super("키 이벤트");
		
		setForm();
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		// setSize(400, 160);
		
		pack();
		
		setVisible(true);
		
	}
	
	
	public void setForm() {
		
		setLayout(new BorderLayout());
		
		add("West", la);
		
		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		/*
		p.add("West", jumin1);
		p.add("Center", la1);
		p.add("East", jumin2);
		*/
		
		p.add(jumin1);
		p.add(la1);
		p.add(jumin2);

		add("Center", p);
		
		Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		
		p1.add(bt);
		add("South", p1);
		
		
	}
	

	@Override
	public void keyPressed(KeyEvent e) { // 키가 눌렸을 때
		// TODO Auto-generated method stub
		
		

	}

	@Override
	public void keyReleased(KeyEvent e) { // 키가 눌렸다가 놓았을 때
		// TODO Auto-generated method stub
		
		if (e.getSource() == jumin1) {
			
			if(jumin1.getText().trim().length() == 6) {
				jumin2.requestFocus(); // 커서 넘김
			}

		}

		if (e.getSource() == jumin2) {
			
			if(jumin2.getText().trim().length() == 7) {
				bt.requestFocus();
			}

		}

	}
	

	@Override
	public void keyTyped(KeyEvent e) { // 키가 같이 눌리거나 기능키와 같이 누를 때
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new KeyEventEx();

	}

}
