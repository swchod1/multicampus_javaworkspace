package com.homework180421prac;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GaMenu extends JFrame implements ActionListener {
	

	
	public GaMenu() {
		// TODO Auto-generated constructor stub
		
		JMenuBar mb = new JMenuBar();
		
		JMenu m1 = new JMenu("기능(F)");
		JMenu m2 = new JMenu("계산기(C)");
		JMenu m3 = new JMenu("도움말(H)");
		
		JMenuItem m11 = new JMenuItem("저장하기(S)");
		JMenuItem m12 = new JMenuItem("불러오기(L)");
		JMenuItem m21 = new JMenuItem("실행하기(0)");
		JMenuItem m31 = new JMenuItem("정보(I)");
		
		setJMenuBar(mb);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		m1.add(m11);
		m1.add(m12);
		m2.add(m21);
		m3.add(m31);
		
		mb.setVisible(true);
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}


}
