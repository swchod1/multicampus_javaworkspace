package com.awtex;

import java.awt.*;
import java.awt.GraphicsDevice.WindowTranslucency;

public class LabelEx extends Frame {
	
	Label la1, la2, la3, la4;
	Font f1;
	Font f2;
	public LabelEx() {
		// TODO Auto-generated constructor stub
		
		super("라벨");
		
		f1 = new Font("굴림체", Font.BOLD, 20);
		f2 = new Font("바탕체", Font.ITALIC, 25); // f1??
		
		la1 = new Label("안녕하세요!!");
		la2 = new Label("홍길동입니다.", Label.CENTER);
		la3 = new Label("홍길동입니다.", Label.RIGHT);
		la4 = new Label("홍길동입니다.");
		
		setLayout(new GridLayout(4, 1)); 
		// 4, 1 ? -> 4행 1열 
		// 4, 1, 5, 5 -> 4행 1열 버튼과 버튼 사이의 옆 간격 5 ??, 버튼과 버튼 사이의 위아래 간격 5 ??
		// 그리드 레이아웃 ??
		
		la1.setFont(f1);
		la2.setFont(f2);
		la3.setFont(f2);
		la4.setFont(f1);
		
		
		add(la1);
		add(la2);
		add(la3);
		add(la4);
		
		la1.setForeground(Color.CYAN);
		
		
		la1.setBackground(Color.red);
		la2.setBackground(Color.blue);
		la3.setBackground(Color.green);
		la4.setBackground(Color.pink);
		
		
		
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new LabelEx();

	}

}
