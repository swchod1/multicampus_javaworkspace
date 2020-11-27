package com.homework180421prac;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class GaCal4 extends JFrame implements ActionListener  {
	
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	
	String[] str = {
			"", "", " ← ", " CE ", " C ", 
			"7", "8", "9", " / ", " √ ", 
			"4", "5", "6", " * ", " % ", 
			"1", "2", "3", " - ", " 1/x ", 
			"0", " ± ", ".", " + ", " = "
			
	};
	
	String temp1, temp2 = "0", temp3, temp4; // tf1, tf2, 연산용
	String[] tempsarr1;
	String[] s1t;
	double dtemp[] = new double[2];
	int count = 0;
	boolean b1;
	String stf1[] = new String[2];  // 0 : 연산용, 1 : 출력용
	String stf2[] = new String[2];  // 0 : 숫자 + 연산자(stf1[0]에 넘기기용), 1 : 숫자(출력)
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	
	
	JButton[] jb = new JButton[str.length];
	
	
	public GaCal4() {
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
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		stf2[0] = "0";
		stf2[1] = "0";
		
		tf1.setText(stf1[1]);
		tf2.setText(stf2[1]);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if((stf2[1].contains("0으로") || stf2[1].contains("입력이")) && e.getSource() != jb[4]) {
			return;
		} 
		
		
		try {
			if (s1t[s1t.length-1].equals("=")) {
				b1 = true;
			} else {
				b1 = false;
			}
			/*if (s1t[s1t.length-1].contains("*") && e.getActionCommand().indexOf(" ") != -1) {
				return;
			}*/
			
		} catch (NullPointerException ne) {
			// TODO: handle exception
			b1 = false;
		}
		
		

		for (int i = 0; i < jb.length; i++) {
			if (e.getSource() == jb[i]) {
				if ((stf2[0] == "0" && jb[i].getText().indexOf(" ") == -1)) { // stf2가 0이면서 jb가 연사자가 아닐 때
					stf2[0] = jb[i].getText(); // jb가 숫자 일때 0에서 jb로 교체
				} else if (b1) {
					if (e.getActionCommand().indexOf(" ") == -1) {
						return;
					} else {
						stf2[0] += jb[i].getText();
					}
				} else {
					stf2[0] += jb[i].getText();
				}
			}
		}
		
		stf2[1] = stf2[0].split(" ")[0];


		if (e.getSource() == jb[2]) { // ←

			if (stf2[0].indexOf(" ") > 1) {
				stf2[0] = stf2[0].substring(0, stf2[0].indexOf(" ") - 1);
			} else {
				stf2[0] = "0";
			}
			
			stf2[1] = stf2[0];

		} else if (e.getSource() == jb[3]) { // CE

			stf2[0] = "0";
			stf2[1] = "0";	

		} else if (e.getSource() == jb[4]) { // C
			
			stf1[0] = "";
			stf1[1] = "";
			stf2[0] = "0";
			stf2[1] = "0";		
			list.clear();

		} else if (e.getSource() == jb[9]) { // √
			
			double dtemp1;

			/*if (stf2[0] == "0") {
				dtemp1 = 0;
			} else {
				dtemp1 = Math.sqrt(Double.parseDouble(stf2[1]));
			}
			*/
			
			dtemp1 = Math.sqrt(Double.parseDouble(stf2[1]));
			
			if(Double.isNaN(dtemp1)) {
				stf1[1] = " sqrt(" + stf2[1] + ") ";
				stf2[1] = "입력이 잘못되었습니다.";
				stf2[0] = "0";
			} else {
				if (stf1[1] == null) {

					stf1[1] = " sqrt(" + stf2[1] + ") ";

				} else {

					//String[] tempsarr1 = stf1[1].split(" ");
					tempsarr1 = stf1[1].split(" ");
					
					if (tempsarr1[tempsarr1.length - 1].contains("sqrt")) {
						stf1[1] = "";
						for(int i = 0; i < tempsarr1.length-2; i++) {
							stf1[1] += tempsarr1[i] + " ";
						}
						
						stf1[1] += " sqrt(" + tempsarr1[tempsarr1.length - 1] + ") ";

					} else {
						stf1[1] += " sqrt(" + stf2[1] + ") ";
					}

				}
				
				stf2[1] = String.valueOf(dtemp1);
				stf2[0] = String.valueOf(dtemp1);
			}

			
			
		   /* if (stf1[0] == null) {
				stf1[0] = stf2[0];
			} else {
				stf1[0] += stf2[0];
			}*/

		} else if (e.getSource() == jb[19]) { // 1/x

			double dtemp1;
			
			dtemp1 = 1 / Double.parseDouble(stf2[1]);
			
			if(Double.isInfinite(dtemp1)) {
				stf1[1] = " reciproc(" + stf2[1] + ") ";
				stf2[1] = "0으로 나눌 수 없습니다.";
				stf2[0] = "0";
			} else {
				if (stf1[1] == null) {

					stf1[1] = " reciproc(" + stf2[1] + ") ";

				} else {

					// String[] tempsarr1 = stf1[1].split(" ");
					tempsarr1 = stf1[1].split(" ");

					
					if (tempsarr1[tempsarr1.length - 1].contains("reciproc")) {
						stf1[1] = "";
						for(int i = 0; i < tempsarr1.length-2; i++) {
							stf1[1] += tempsarr1[i] + " ";
						}
						
						stf1[1] += " reciproc(" + tempsarr1[tempsarr1.length - 1] + ") ";

					} else {
						stf1[1] += " reciproc(" + stf2[1] + ") ";
					}
					
				}
				
				stf2[0] = String.valueOf(dtemp1);
				stf2[1] = String.valueOf(dtemp1);
			}
			
			/*if (stf2[1].equals("0")) {
				stf1[1] = " reciproc(" + stf2[1] + ") ";
				stf2[1] = "0으로 나눌 수 없습니다.";
				stf2[0] = "0";
			} else {
				dtemp1 = 1 / Double.parseDouble(stf2[1]);
				
				if (stf1[1] == null) {

					stf1[1] = " reciproc(" + stf2[1] + ") ";

				} else {

					String[] tempsarr1 = stf1[1].split(" ");

					
					if (tempsarr1[tempsarr1.length - 1].contains("reciproc")) {
						stf1[1] = "";
						for(int i = 0; i < tempsarr1.length-2; i++) {
							stf1[1] += tempsarr1[i] + " ";
						}
						
						stf1[1] += " reciproc(" + tempsarr1[tempsarr1.length - 1] + ") ";

					} else {
						stf1[1] += " reciproc(" + stf2[1] + ") ";
					}
					
				}
				
				stf2[0] = String.valueOf(dtemp1);
				stf2[1] = String.valueOf(dtemp1);
				
				
			}*/

			

			
			
			
			

			/*
			temp2 = temp2.substring(0, temp2.lastIndexOf(" ") - 4);
			temp3 = "reciproc(" + temp2 + ")";
			
			if(Double.parseDouble(temp2) == 0) {
				tf2.setText("0으로 나눌수 없습니다.");
				return;
			}

			dtemp1 = 1 / Double.parseDouble(temp2);

			temp2 = String.valueOf(dtemp1);

			if (temp1 == null) {

				temp1 = temp3;

			} else {

				temp1 += temp3;

			}

			tf1.setText(temp1);
			tf2.setText(temp2);
			*/

		} else if (e.getSource() == jb[21]) { // +-
			
			// stf2[0] = stf2[0].substring(0, stf2[0].indexOf(" ") - 1);
			
			stf2[0] = String.valueOf((-1)*Double.parseDouble(stf2[1]));
			stf2[1] = stf2[0];
			
		} else if (stf2[0].indexOf(" ") != -1) { // 연산
			
			
			if(stf1[0] == null) {
				stf1[0] = stf2[0];
			} else {
				stf1[0] += stf2[0];
			}
			
			if(stf1[1] == null) {
				stf1[1] = stf2[0];
			} else {
				// String[] tempsarr1 = stf1[1].split(" ");
				
				tempsarr1 = stf1[1].split(" ");

				if (tempsarr1[tempsarr1.length - 1].contains("(")) {
					stf1[1] += " " + stf2[0].split(" ")[1] +" ";
				} else {
					stf1[1] += stf2[0];
				}

			}
			
			
			
			// String[] s1t = stf1[0].split(" ");
			
			s1t = stf1[0].split(" ");
			
			for(int i = 0; i < s1t.length; i++) {
				System.out.print(s1t[i] + " ");
			}
			
			System.out.println();
			
			
			double d1 = Double.parseDouble(s1t[0]);
			double d2 = 0;
			
			if (s1t.length >= 4 || e.getSource() == jb[24]) {

				for (int i = 1; i < s1t.length; i += 2) {
					if (s1t[i].equals("+") || s1t[i].equals("-") || s1t[i].equals("=")) {
						list.add(i);
					}
				}
				
				for(int k : list) {
					System.out.println(k);
				}
				
				try {
					for (int j = 1; j < list.get(0); j += 2) {

						if (s1t[j].equals("*")) {
							d1 = Double.parseDouble(s1t[j - 1]) * Double.parseDouble(s1t[j + 1]);
							s1t[j + 1] = String.valueOf(d1);
						} else if (s1t[j].equals("/")) {
							d1 = Double.parseDouble(s1t[j - 1]) / Double.parseDouble(s1t[j + 1]);
							s1t[j + 1] = String.valueOf(d1);
						}

					}
					
				} catch (IndexOutOfBoundsException ie) {
					// TODO: handle exception
					for(int j = 1; j < s1t.length - 2; j += 2) {
						if (s1t[j].equals("*")) {
							d1 = Double.parseDouble(s1t[j - 1]) * Double.parseDouble(s1t[j + 1]);
							s1t[j + 1] = String.valueOf(d1);
						} else if (s1t[j].equals("/")) {
							d1 = Double.parseDouble(s1t[j - 1]) / Double.parseDouble(s1t[j + 1]);
							s1t[j + 1] = String.valueOf(d1);
						}
					}
					
				}
	
				
				
				
				System.out.println();
				System.out.println("첫번째  + - 까지의 연산" + d1);
				System.out.println();

				for (int i = 1; i < list.size(); i++) {

					for (int j = list.get(i - 1); j < list.get(i); j += 2) {

						if (s1t[j].equals("*")) {
							d2 = Double.parseDouble(s1t[j - 1]) * Double.parseDouble(s1t[j + 1]);
							s1t[j + 1] = String.valueOf(d2);
						} else if (s1t[j].equals("/")) {
							d2 = Double.parseDouble(s1t[j - 1]) / Double.parseDouble(s1t[j + 1]);
							s1t[j + 1] = String.valueOf(d2);
						}

					}

				}
				
				System.out.println();
				System.out.println("중간 연산 결과");
				for(int i = 0; i < s1t.length; i++) {
					System.out.print(s1t[i] + " ");
				}
				
				System.out.println(" " + d1);
				System.out.println();
				


				for (int i = 0; i < list.size(); i++) {
					
					try {
						if (s1t[list.get(i)].equals("+")) {
							d1 += Double.parseDouble(s1t[list.get(i+1) - 1]);
						} else if (s1t[list.get(i)].equals("-")) {
							d1 -= Double.parseDouble(s1t[list.get(i+1) - 1]);
						}
					} catch (IndexOutOfBoundsException e2) {
						// TODO: handle exception
						break;
					}

				}
				
				
				
				
				list.clear();
				
				System.out.println();
				System.out.println("마지막  + - 연산" + d1);
				System.out.println();
				
				
				
			}
			
			
			
			System.out.println(d1);
			
			System.out.println("----------------");
			
			stf2[1] = String.valueOf(d1);
			/*
			System.out.println(stf1[0]);
			System.out.println(stf1[1]);
			System.out.println(stf2[0]);
			System.out.println(stf2[1]);
			
			System.out.println();
			
			*/
			
			// String[] s2t = stf1[1].split(" ");
			
			
		

			// stf1[1] = stf1[0];
			
			if(e.getSource() == jb[24]) {
				stf1[0] = "";
				stf1[1] = "";
				stf2[0] = String.valueOf(d1);
			} else {
				stf2[0] = "0";
			}
			
			/*
			System.out.println(stf1[0]);
			System.out.println(stf1[1]);
			System.out.println(stf2[0]);
			System.out.println(stf2[1]);
			
			System.out.println();
			
			*/

		} // 연산자
		
		
		tf1.setText(stf1[1]);

		tf2.setText(stf2[1]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GaCal4();

	}

}
