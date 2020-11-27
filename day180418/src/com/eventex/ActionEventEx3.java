package com.eventex;

import java.awt.event.*;
import java.awt.*;

import com.awtex.WinEvent;

public class ActionEventEx3 extends Frame implements ActionListener {
	
	private MenuBar mb = new MenuBar();
	
	private Menu file = new Menu("File");
	private MenuItem now = new MenuItem("Now");
	private MenuItem exit = new MenuItem("Exit");
	
	public ActionEventEx3() {
		// TODO Auto-generated constructor stub
		
		super("메뉴이벤트");
		
		setMenuBar(mb);
		
		
		mb.add(file);
		file.add(now);
		file.addSeparator();
		file.add(exit);
		
		// 1
		// exit.addActionListener(this);
		// 1
		
		//2
		now.addActionListener(this);
		exit.addActionListener(this);
		//2
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(300, 300);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				
		// 1
		// System.exit(0);
		// 1

		// 2
		if(e.getSource() == now) {
			System.out.println("지금이 언제야???? 졸지마랑....");
		} else if(e.getSource() == exit) {
			System.exit(0);
		}
		
		// 2

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ActionEventEx3();

	}

}
