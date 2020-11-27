package com.inner;

import java.awt.*;
import java.awt.event.*;


public class ActionEventEx extends Frame implements ActionListener {

	private TextField tf = new TextField(10);

	public ActionEventEx() {
		// TODO Auto-generated constructor stub

		super("엑션이벤트");

		setLayout(new FlowLayout());
		add(tf);

		tf.addActionListener(this);

		setSize(300, 200);
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == tf) {
			
			String imsi = tf.getText();
			System.out.println("메세지 : " + imsi);
			tf.setText("");
			
		}
		
		
	}
	
	
	
	
	

	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*super("액션이벤트");
		
		setLayout(new FlowLayout());
		add(tf);
		
		tf.addActionListener(this);
		
		setSize(300, 200);
		setVisible(True);*/
		

	}

}
