package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxEx extends JFrame {
	
	public JComboBoxEx() {
		// TODO Auto-generated constructor stub
		
		super("콤보박스");
		
		setLayout(new FlowLayout());
		
		// 방법 1
		String[] citems = {"용돈", "월급"};
		
		JComboBox combo = new JComboBox(citems);
		
		add(combo);
		
		
		
		// 방법 2
		DefaultComboBoxModel cmodel = new DefaultComboBoxModel();
		
		cmodel.addElement("짜장면");
		cmodel.addElement("치킨");
		cmodel.addElement("탕수육");

		combo = new JComboBox();
		combo.setModel(cmodel);
		
		
		add(combo);
		
		
		
		setBounds(300, 200, 300, 100); // ????
		// setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JComboBoxEx();

	}

}
