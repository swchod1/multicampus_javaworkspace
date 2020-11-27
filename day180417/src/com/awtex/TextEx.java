package com.awtex;

import java.awt.*;

public class TextEx extends Frame {
	
	private TextField tf = new TextField("제목 : ");
	private TextArea ta = new TextArea("메모", 10, 15); // 10은 가로 15는 줄
	private Button bt = new Button("확인");
	private Label la = new Label("내용");
	
	
	
	public TextEx() {
		// TODO Auto-generated constructor stub
		
		super("메모장");
		
		setLayout(new BorderLayout());
		
		add("North", tf);
		add("South", bt);
		add("West", la);
		add("Center", ta);
		
		
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(400, 400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TextEx();

	}

}
