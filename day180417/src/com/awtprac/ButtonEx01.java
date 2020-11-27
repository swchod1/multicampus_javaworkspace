package com.awtprac;

import java.awt.*;

public class ButtonEx01 extends Frame {
	
	private String str[] = {
			"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "C", "=", "/"
	};
	
	private Button bt[] = new Button[str.length];
	
	public ButtonEx01() {
		// TODO Auto-generated constructor stub
		
		super("임시창");
		
		setLayout(new GridLayout(4, 4));
		
		for(int i = 0; i < bt.length; i++) {
			bt[i] = new Button(str[i]);
			add(bt[i]);
			bt[i].setFont(new Font("굴림체", Font.BOLD, 30));
			bt[i].setBackground(Color.green);
			bt[i].setForeground(Color.yellow);
		}
		
		
		WinEvent01 we = new WinEvent01();
		addWindowListener(we);
		setSize(500, 500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ButtonEx01();

	}

}
