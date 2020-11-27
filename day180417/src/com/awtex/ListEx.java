package com.awtex;

import java.awt.*;

public class ListEx extends Frame {
	
	private Label lb = new Label("과목명");
	private List li = new List(4, true); // 4 ?? true ??
	private Button bt = new Button("확인");
	private String[] name;
	
	
	public ListEx(String[] a) {
		// TODO Auto-generated constructor stub

		super("리스트 목록");

		name = a;
		
		setLayout(new BorderLayout());
		
		for(int i = 0; i < name.length; i++) {
			li.add(name[i]);
		}
		
		add("North", lb);
		add("South", bt);
		add("Center", li);
		
		li.setFont(new Font("굴림체", Font.BOLD, 30));
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);

		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ListEx(args);

	}

}
