package com.awtprac;

import java.awt.*;

public class ListEx01 extends Frame {
	
	private Label la = new Label("목차", Label.CENTER);
	private List li = new List(1, true); /// ???????
	private Button bt = new Button("확인");
	private String str[];
	
	
	public ListEx01(String str[]) {
		// TODO Auto-generated constructor stub
		
		super("임시창");
		
		this.str = str;
		
		setLayout(new FlowLayout());
		
		for(int i = 0; i < this.str.length; i++) {
			li.add(this.str[i]);
		}
		
		add(la, BorderLayout.NORTH);
		add(li, BorderLayout.CENTER);
		add(bt, BorderLayout.SOUTH);
		
		la.setBackground(Color.gray);
		li.setBackground(Color.gray);
		bt.setBackground(Color.gray);
		
		la.setForeground(Color.blue);
		li.setForeground(Color.blue);
		bt.setForeground(Color.blue);
		
		la.setFont(new Font("굴림체", Font.BOLD, 30));
		li.setFont(new Font("굴림체", Font.BOLD, 30));
		bt.setFont(new Font("굴림체", Font.BOLD, 30));
		
		WinEvent01 we = new WinEvent01();
		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ListEx01(args);

	}

}
