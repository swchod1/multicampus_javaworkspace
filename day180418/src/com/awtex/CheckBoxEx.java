package com.awtex;

import java.awt.*;

public class CheckBoxEx extends Frame {
	
	private Label la = new Label("좋아하는 과일은 ?");
	
	private Checkbox[] cb = {
			new Checkbox("바나나"),
			new Checkbox("사과"),
			new Checkbox("딸기"),
			new Checkbox("파인애플")
	};
	
	private Button bt = new Button("확인");
	
	public CheckBoxEx() {
		// TODO Auto-generated constructor stub
		
		super("체크박스");
		
		setLayout(new GridLayout(6, 1));
		
		add(la);
		
		for(int i = 0; i < cb.length; i++) {
			add(cb[i]);
		}
		
		add(bt);
		

		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(300, 200);
		setVisible(true);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CheckBoxEx();

	}

}
