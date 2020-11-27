package com.swingex;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class AddActionListener implements ActionListener {
	
	JTable table;
	JTextField text1, text2, text3, text4;
	
	public AddActionListener(JTable table, JTextField text1, JTextField text2, 
			JTextField text3, JTextField text4) {
		// TODO Auto-generated constructor stub
		
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String arr[] = new String[4];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		arr[3] = text4.getText();
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(arr); // 행 추가
		
		

	}


}
