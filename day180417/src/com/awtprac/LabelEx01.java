package com.awtprac;

import java.awt.*;

public class LabelEx01 extends Frame {
	
	Label la1, la2, la3, la4;
	Font f1, f2;
	
	public LabelEx01() {
		// TODO Auto-generated constructor stub
		
		super("임시창");
		
		f1 = new Font("굴림체", Font.BOLD, 30);
		f2 = new Font("바탕체", Font.ITALIC, 30);
		
		la1 = new Label("안녕하세요");
		la2 = new Label("홍길동 입니다.", Label.CENTER);
		la3 = new Label("잘부탁드립니다.", Label.RIGHT);
		la4 = new Label("수고하세요.", Label.LEFT);
		
		setLayout(new GridLayout(4, 1));
		
		add(la1);
		add(la2);
		add(la3);
		add(la4);
		
		la1.setFont(f1);
		la2.setFont(f2);
		la3.setFont(f1);
		la4.setFont(f2);
		
		la1.setBackground(Color.red);
		la2.setBackground(Color.yellow);
		la3.setBackground(Color.black);
		la4.setBackground(Color.pink);
		
		la1.setForeground(Color.green);
		la2.setForeground(Color.darkGray);
		la3.setForeground(Color.white);
		la4.setForeground(Color.blue);
		
		
		WinEvent01 we = new WinEvent01();
		addWindowListener(we);
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new LabelEx01();

	}

}
