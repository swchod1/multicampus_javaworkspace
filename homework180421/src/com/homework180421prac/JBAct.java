package com.homework180421prac;

import java.awt.event.*;

import javax.swing.*;

public class JBAct implements ActionListener {
	
	JButton bt;
	JComboBox combo;
	JTextField tf1;
	JTextField tf2;
	JTextArea ta;
	JLabel jl;
	int won;
	
	public JBAct() {
		// TODO Auto-generated constructor stub
	}
	
	public JBAct(JButton bt, JComboBox combo, JTextField tf1, JTextField tf2 , JTextArea ta, JLabel jl, int won) {
		// TODO Auto-generated constructor stub
		
		this.bt = bt;
		this.combo = combo;
		this.tf1 = tf1;
		this.tf2 = tf2;
		this.ta = ta;
		this.jl = jl;
		// this.won = won;
		
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
				
		ta.append(combo.getSelectedItem().toString() + "\t" + tf1.getText() + "원\n" + tf2.getText() + "\n\n");
		
		
		if(bt.getText().equals("INCOME")) {
			won = won + Integer.parseInt(tf1.getText());			
		} else if(bt.getText().equals("EXPENSE")) {
			won = won - Integer.parseInt(tf1.getText());
		}
		jl.setText("현재 잔액 : " + won + "원");
	}
	
	/*public Integer returnWon() {
		return won;
	}*/

}
