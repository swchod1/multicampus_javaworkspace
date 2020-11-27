package com.eventex;

import java.awt.event.*;
import java.awt.*;

import com.awtex.WinEvent;

public class ActionEventEx2 extends Frame implements ActionListener {
	
	private Button bt1 = new Button("확인");
	private Button bt2 = new Button("종료");
	
	
	public ActionEventEx2() {
		// TODO Auto-generated constructor stub

		super("");

		setLayout(new FlowLayout());

		add(bt1);
		add(bt2);

		// 액션 이벤트에 등록
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		WinEvent we = new WinEvent();
		addWindowListener(we);

		setSize(300, 300);
		setVisible(true);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == bt1) {
			System.out.println("왜 눌러 .....");
		} else if (e.getSource() ==  bt2) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ActionEventEx2();
		

	}

}
