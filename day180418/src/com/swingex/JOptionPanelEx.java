package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionPanelEx extends JFrame implements ActionListener {
	
	private Icon icon1 = new ImageIcon("src/img/icon001.jpg");
	private Icon icon2 = new ImageIcon("src/img/icon002.jpg");
	private Icon icon3 = new ImageIcon("src/img/icon003.jpg");
	private Icon icon4 = new ImageIcon("src/img/icon004.jpg");
	
	JButton b1, b2, b3, b4;
	
	String[] str = {"로그인", "회원가입"};
	
	public JOptionPanelEx() {
		// TODO Auto-generated constructor stub
		
		super("옵션패널");
		
		setLayout(new FlowLayout());
		
		b1 = new JButton("MessageDialog");
		b2 = new JButton("ConfirmDialog");
		b3 = new JButton("InputDialog");
		b4 = new JButton("OptionDialog");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		setLocation(300, 200);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == b1) {
			
			JOptionPane.showMessageDialog(this, "메시지 다이얼로그 박스", 
					"메시지", JOptionPane.INFORMATION_MESSAGE, icon2);

		}

		else if (e.getSource() == b2) {
			
			JOptionPane.showConfirmDialog(this, "확인 다이얼로그 박스", 
					"확인", JOptionPane.YES_NO_CANCEL_OPTION);

		}

		else if (e.getSource() == b3) {
			
			JOptionPane.showInputDialog(this, "입력 다이얼로그 박스", "입력",
					JOptionPane.YES_NO_OPTION);

		}

		else if (e.getSource() == b4) {
			
			JOptionPane.showOptionDialog(this, "옵션 다이얼로그 박스", "옵션", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
					null, str, str[0]);

		}
		
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JOptionPanelEx();

	}

}
