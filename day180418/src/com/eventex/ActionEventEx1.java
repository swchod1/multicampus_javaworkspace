package com.eventex;

import java.awt.*;

import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx1 extends Frame implements ActionListener {
	
	private TextField tf = new TextField(10);
	
	public ActionEventEx1() {
		// TODO Auto-generated constructor stub
		
		super("액션이벤트");
		setLayout(new FlowLayout());
		
		add(tf);
		
		// 액션 이벤트에 등록
		tf.addActionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == tf) { //
			
			String im = tf.getText();
			
			System.out.println("메시지 : " + im);
			
			tf.setText(""); // 엔터 후 초기화
		}
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ActionEventEx1();

	}

}
