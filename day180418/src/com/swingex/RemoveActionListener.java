package com.swingex;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener {
	
	JTable table;
	
	public RemoveActionListener(JTable table) {
		// TODO Auto-generated constructor stub
		
		this.table = table;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int row = table.getSelectedRow();
		
		if(row == -1) { // -1 -> null
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row);

	}

}
