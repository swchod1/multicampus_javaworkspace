package com.eventex;

import java.awt.event.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.*;
import com.awtex.WinEvent;

public class ActionEventEx4 extends Frame implements ActionListener {
	
	/*
	private Icon icon[] = {
			new ImageIcon("src/img/icon001.jpg"),
			new ImageIcon("src/img/icon002.jpg"),
			new ImageIcon("src/img/icon003.jpg"),
			new ImageIcon("src/img/icon004.jpg"),
	};*/
	
	// 버튼 4개
	private Button[] bt = new Button[4];
	// 패널 4개
	private Panel[] pp = new Panel[4];
	// 칼라 4개
	private Color[] cc = {
			Color.red, Color.green, Color.blue, Color.yellow
	};
	// 레이아웃 --> 카드 레이아웃
	private CardLayout card = new CardLayout();
	
	private Panel pptop;
	
	public ActionEventEx4() {
		// TODO Auto-generated constructor stub
		
		super("카드레이아웃");
		
		setLayout(new BorderLayout());
		
		Panel p = new Panel(new GridLayout(1, 4));
		
		for(int i = 0; i < bt.length; i++) {
			bt[i] = new Button(i + 1 +  "번 버튼");
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		
				
		
		
		add("North", p); 
		
		pptop = new Panel(card);
		
		for(int i = 0; i < pp.length; i++) {
			pp[i] = new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add("" + i, pp[i]);
		}
		
		
		add("Center", pptop);
		
		card.show(pptop, "0"); // "0" 첫번째 인덱스
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		for(int i = 0; i < 4; i++) {
			if(e.getSource() == bt[i]) {
				
				card.show(pptop, "" + i);
				
			}
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ActionEventEx4();

	}

}
