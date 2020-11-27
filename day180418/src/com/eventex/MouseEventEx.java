package com.eventex;

import java.awt.*;
import java.awt.event.*;
import com.awtex.WinEvent;


public class MouseEventEx extends Frame implements MouseListener {
	
	private Button bt = new Button("확인");
	private Button bt1 = new Button("취소");
	
	public MouseEventEx() {
		// TODO Auto-generated constructor stub
		
		super("마우스 이벤트");
		
		setLayout(new FlowLayout());
		
		add(bt);
		add(bt1);
		
		bt.addMouseListener(this);
		bt1.addMouseListener(this);
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == bt) {
			System.out.println("확인버튼");
		}
		

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == bt || e.getSource() == bt1) {
			System.out.println("마우스가 버튼 위로 올라갔음...");
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == bt || e.getSource() == bt1) {
			System.out.println("마우스가 버튼위에서 내려왔음...");
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == bt1) {
			System.out.println("취소버튼을 눌렀음...");
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == bt1) {
			System.out.println("취소버튼을 눌렀다가 띄었음..");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new MouseEventEx();

	}

}
