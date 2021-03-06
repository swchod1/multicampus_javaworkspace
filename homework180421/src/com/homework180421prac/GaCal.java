package com.homework180421prac;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class GaCal extends JFrame implements ActionListener {
	
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
	long l;
	int count1 = 0, count2 = 0;
	
	
	
	JButton[] jb = new JButton[str.length];
	
	public GaCal() {
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
		
		// 연산
		
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
			
			/*System.out.println(temp1);
			System.out.println(temp2);*/
			

		} else if (e.getSource() == jb[3]) { // CE
			
			temp2 = "0";
			tf2.setText(temp2);
			
			/*System.out.println(temp1);
			System.out.println(temp2);*/
			
		} else if (e.getSource() == jb[4]) { // C
			
			temp1 = "";
			temp2 = "0";
			tf1.setText(temp1);
			tf2.setText(temp2);

		} else if (temp2.indexOf(" ") != -1) {

			if (e.getSource() == jb[9]) { // √

				temp2 = temp2.substring(0, temp2.lastIndexOf(" ") - 2);
				
				temp3 = "sqrt(" + temp2 + ")";
				

				if (tf2.getText() == "0") {
					temp2 = "0";
				} else {
					dtemp1 = Math.sqrt(Double.parseDouble(temp2));

					temp2 = String.valueOf(dtemp1);
					
				}

				
				if (temp1 == null) {

					temp1 = temp3;
					

				} else {

					temp1 += temp3;

				}
				
				
				tf1.setText(temp1);
				tf2.setText(temp2);

			} else if (e.getSource() == jb[19]) { // 1/x

				temp2 = temp2.substring(0, temp2.lastIndexOf(" ") - 4);
				temp3 = "reciproc(" + temp2 + ")";

				try {

					dtemp1 = 1 / Double.parseDouble(temp2);

					temp2 = String.valueOf(dtemp1);

				} catch (NumberFormatException nfe) {
					// TODO: handle exception
					temp2 = "0으로 나눌 수 없습니다.";
				}
				if (temp1 == null) {

					temp1 = temp3;

				} else {

					temp1 += temp3;

				}

				tf1.setText(temp1);
				tf2.setText(temp2);

			} else if (e.getSource() == jb[21]) { // +-
				
			} else if (e.getSource() == jb[24]) { // =
				
			} else {
				
				int count = 0;
				
				String[] tempsarr1 = temp1.split(" ");
				
				for (int i = 0; i < tempsarr1.length; i++) {
					if(tempsarr1[i] == "*" || tempsarr1[i] == "/" || tempsarr1[i] == "%") {
						count++;
					}
				}
				
				String[] tempsarr2 = temp2.split(" ");
				
				switch (tempsarr2[1]) {
				case "*" :
					
					break;
				case "/" :

					break;
				case "%" :

					break;
				case "+" :

					break;
				case "-" :

					break;	

				default :
					break;
				}
					
				
				if (temp1 == null) {

					temp1 = temp2;

				} else {

					temp1 += temp2;

				}

				tf1.setText(temp1);
				tf2.setText(temp2.substring(0, temp2.indexOf(" "))); // temp1.length() - 3)
				temp1 = "";
			}
			

		} else {
			
			tf2.setText(temp2);
			
		}
		
		
			
		}


		
		
		

		/*	
		for (int i = 0; i < jb.length; i++) {

			if (e.getSource() == jb[i]) {

				if (temp1 == null) {
					temp1 = jb[i].getText();
					if (e.getSource() == jb[9]) { // √

						temp1 = temp1.replaceAll(" √ ", " sqrt(" + tf2.getText() + ") ");

					} else if (e.getSource() == jb[19]) { // 1/x

						temp1.replaceAll("1/x", "reciproc(" + tf2.getText() + ")");

					}
				} else {
					temp1 += jb[i].getText();
				}

				if (e.getSource() == jb[2]) { // ← 

				} else if (e.getSource() == jb[3]) { // CE

				} else if (e.getSource() == jb[4]) { // C
					
					temp1 = null;
					temp2 = null;
					tf1.setText("");
					tf2.setText("0");
					return;

				} // else if(e.getSource() == jb[])

				if (jb[i].getText().indexOf(" ") != -1) {

					if (e.getSource() == jb[24]) { // =
						
						
						String[] tempsarr = tf1.getText().split(" ");
						double[] tempdarr = new double[]; 
						
						for(int j = 0; j < tempsarr.length; j ++) {
							
							if(j % 2 != 0) {
								tempdarr
							}
							
							switch (tempsarr[i]) {
							case "*":
								
								
								break;

							default:
								break;
							}
							
						}
		
						return;

					}

					if (temp2 == null) {

						temp2 = temp1;

					} else {

						temp2 += temp1;

					}
					if (e.getSource() == jb[9]) { // √

						temp2 = temp2.replaceAll("√", "sqrt(" + temp1 + ")");

					} else if (e.getSource() == jb[19]) { // 1/x

						temp2.replaceAll("1/x", "reciproc(" + temp1 + ")");

					}

					tf1.setText(temp2);
					tf2.setText(temp1.substring(0, temp1.indexOf(" "))); // temp1.length() - 3)
					temp1 = "";
				} else {
					tf2.setText(temp1);
				}

				if (jb[i].getText() == "=") {

				}

			}

		}
*/
		


	public static void main(String[] args) {
		new GaCal();
	}
	
	
}
