package com.awtex;

import java.awt.*;

public class CheckBoxGroupEx extends Frame {
	
	GridLayout gl = new GridLayout(4, 1);
	
	Label la = new Label("당신의 성별은 ?");
	
	CheckboxGroup cg = new CheckboxGroup();
	
	Checkbox man = new Checkbox("남성", cg, true); // t ? 실행(컨트로 에프11) 직후 체크가 되어있느냐
	Checkbox woman = new Checkbox("여성", cg, false); // f? 안되어 있는냐
	
	Button bt = new Button("확인");
	
	public CheckBoxGroupEx() {
		// TODO Auto-generated constructor stub
		
		super("라디오버튼");
		
		
		setLayout(gl);
		
		add(la);
		add(man);
		add(woman);
		add(bt);
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(200, 200);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CheckBoxGroupEx();

	}

}
