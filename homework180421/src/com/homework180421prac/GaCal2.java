package com.homework180421prac;


import java.awt.*;

import java.awt.event.*;
import javax.swing.*;


public class GaCal2 extends JFrame implements ActionListener  {
	
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	
	String[] str = {
			"", "", " ← ", " CE ", " C ", 
			"7", "8", "9", " / ", " √ ", 
			"4", "5", "6", " * ", " % ", 
			"1", "2", "3", " - ", " 1/x ", 
			"0", " ± ", ".", " + ", " = "
			
	};
	
	String temp1, temp2 = "0", temp3; // tf1, tf2, 연산용
	double dresult, dtemp1;
	double dtemp[] = new double[3];
	int count = 0;
	
	JButton[] jb = new JButton[str.length];
	
	
	
	public GaCal2() {
		// TODO Auto-generated constructor stub

		super("계산기");

		Container con = this.getContentPane();
		con.setLayout(new BorderLayout(5, 5));

		Panel p1 = new Panel(new GridLayout(2, 1));

		p1.add(tf1);
		p1.add(tf2);
		
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf2.setHorizontalAlignment(JTextField.RIGHT);
		
		tf1.setEditable(false);
		tf2.setEditable(false);
		
		
		Panel p2 = new Panel(new GridLayout(5, 5, 5, 5));
		
		for(int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(str[i]);
			p2.add(jb[i]);
			jb[i].addActionListener(this);
		}
		
		con.add(p1, BorderLayout.NORTH);
		con.add(p2, BorderLayout.CENTER);
		
		
		setSize(350, 350);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tf1.setText(temp1);
		tf2.setText(temp2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		for (int i = 0; i < jb.length; i++) {

			if (e.getSource() == jb[i]) {

				if (temp2 == "0") {
					temp2 = jb[i].getText();
				} else {
					temp2 += jb[i].getText();
				}
			}
		}
		
		
		

		if (e.getSource() == jb[2]) { // ←

			if (temp2.indexOf(" ") > 1) {
				temp2 = temp2.substring(0, temp2.indexOf(" ") -1);
			} else {
				temp2 = "0";
			}

			tf2.setText(temp2);
			
		} else if (e.getSource() == jb[3]) { // CE
			
			temp2 = "0";
			tf2.setText(temp2);
					
		} else if (e.getSource() == jb[4]) { // C
			
			temp1 = "";
			temp2 = "0";
			for(int i = 0; i < dtemp.length; i++) {
				dtemp[i] = 0;
			}			
			tf1.setText(temp1);
			tf2.setText(temp2);

		}  else if (temp2.indexOf(" ") != -1) {
			
			if (temp1 == null) {

				temp1 = temp2;

			} else {

				temp1 += temp2;

			}
			
			String[] tempsarr2 = temp2.split(" ");
			dtemp[1] = Double.parseDouble(tempsarr2[0]);
			
			String[] tempsarr1 = temp1.split(" ");
			
			if(dtemp[0] == 0) {
				dtemp[0] = Double.parseDouble(tempsarr1[0]);
			}
			
			
			
			switch (tempsarr2[1]) {
			case "√":
				
				break;

			case "1/x":
				
				break;

			case "±":
				
				break;

			}

			if (tempsarr1.length >= 4 || e.getSource() == jb[24]) {

				switch (tempsarr1[tempsarr1.length - 3]) {
				case "*":

					dtemp[0] = dtemp[0] * dtemp[1];
					temp2 = String.valueOf(dtemp[0]) + " ";

					break;
				case "/":

					try {
						dtemp[0] = dtemp[0] / dtemp[1];
						temp2 = String.valueOf(dtemp[0]) + " ";
					} catch (NumberFormatException nfe) {
						// TODO: handle exception
						temp2 = "0으로 나눌 수 없습니다.";
					}

					break;

				case "%":

					dtemp[0] = dtemp[0] % dtemp[1];
					temp2 = String.valueOf(dtemp[0]) + " ";

					break;

				case "+":

					dtemp[0] = dtemp[0] + dtemp[1];
					temp2 = String.valueOf(dtemp[0]) + " ";

					break;

				case "-":

					dtemp[0] = dtemp[0] - dtemp[1];
					temp2 = String.valueOf(dtemp[0]) + " ";

					break;
				}

				if (e.getSource() == jb[24]) {
					temp1 = "";
					for (int i = 0; i < dtemp.length; i++) {
						dtemp[i] = 0;
					}
				}

			}
			
			
			tf1.setText(temp1);
			tf2.setText(temp2.substring(0, temp2.indexOf(" "))); // temp1.length() - 3)
			
			temp2 = "0";


		} else {
			
			tf2.setText(temp2);
			
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GaCal2();

	}

}
