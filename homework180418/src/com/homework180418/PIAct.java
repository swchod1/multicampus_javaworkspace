package com.homework180418;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PIAct extends JFrame implements ActionListener {
	
	JButton bt;
	TextField[] tf;
	CheckboxGroup cg;
	JLabel[] l = new JLabel[4];

	public PIAct(JButton bt,  TextField[] tf, CheckboxGroup cg) {
		// TODO Auto-generated constructor stub

		this.bt = bt;
		this.tf = tf;
		this.cg = cg;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		JDialog d = new JDialog(this, "정보 확인", false);
		d.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		if (e.getSource() == bt) {	
			
			if(tf[1].getText().equals(tf[2].getText())) {
				
				for(int i = 0; i < 3; i++) {
					l[i] = new JLabel();
					
					if(i == 2) {
						
						if(cg.getSelectedCheckbox().getLabel().equals("여자")) {
							
							l[2].setText("Woman");	
							
						} else {
							
							l[2].setText("Man");
							
						}
						
					} else  {	
						
						l[i].setText(tf[i].getText());
						
					}
					
					d.add(l[i]);	
					
				}		
				
			} else {
				/*
				l[3] = new JLabel("비밀번호가 일치하지 않습니다.", JLabel.CENTER);
				d.add(l[3]);	
				*/
				
				JOptionPane.showMessageDialog(this, "비밀번호가 일치하지 않습니다.", 
						"메시지", JOptionPane.INFORMATION_MESSAGE, icon2);
				
				return;	
			}
			
			d.setSize(250, 100);
			d.setResizable(false);
			d.setVisible(true);
			d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		}

	}
	
	private Icon icon1 = new ImageIcon("src/img/icon001.jpg");
	private Icon icon2 = new ImageIcon("src/img/icon002.jpg");
	private Icon icon3 = new ImageIcon("src/img/icon003.jpg");
	private Icon icon4 = new ImageIcon("src/img/icon004.jpg");
	

}
