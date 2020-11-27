package com.homework180421prac;

import java.util.*;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// String str = "3 + 9 / 3 + 2 * 5 * 9 - 9 / 2 = "; // 91.5 
		// String str = "0 - 3 * 3 + 9 / 3 + 2 * 5 * 9 - 9 / 2 = "; // 79.5
		 String str = "96 - 3 - 6 - ";
		
		String s[] = str.split(" ");
		
		double d1 = Double.parseDouble(s[0]); // 첫 + - 전까지 연산
		double d2 = 0; // 이후 +- 사이 연산
		
		for(int i = 1; i < s.length; i += 2 ) {
			if(s[i].equals("+") || s[i].equals("-") || s[i].equals("=")) {
				al.add(i);
			}
		}
		
		System.out.println(al.size());
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		// System.out.println(al.get(3));
		
		// 첫 + 혹은 - 까지의 연산
		for(int j = 1; j < al.get(0); j += 2) {
			
			if (s[j].equals("*")) {
				d1 = Double.parseDouble(s[j - 1]) * Double.parseDouble(s[j + 1]);
				s[j + 1] = String.valueOf(d1);
			} else if (s[j].equals("/")) {
				d1 = Double.parseDouble(s[j - 1]) / Double.parseDouble(s[j + 1]);
				s[j + 1] = String.valueOf(d1);
			}	
		}
		
		
		// 이후 연산 연산
		for (int i = 1; i < al.size(); i++) {

			for (int j = al.get(i - 1); j < al.get(i); j += 2) {

				if (s[j].equals("*")) {
					d2 = Double.parseDouble(s[j - 1]) * Double.parseDouble(s[j + 1]);
					s[j + 1] = String.valueOf(d2);
				} else if (s[j].equals("/")) {
					d2 = Double.parseDouble(s[j - 1]) / Double.parseDouble(s[j + 1]);
					s[j + 1] = String.valueOf(d2);
				}

			}

		}

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		
		for(int i = 0; i < al.size(); i++) {
			
			try {
				if(s[al.get(i)].equals("+")) {
					d1 += Double.parseDouble(s[al.get(i+1)-1]); 
				} else if(s[al.get(i)].equals("-")) {
					d1 -= Double.parseDouble(s[al.get(i+1)-1]); 
				}
			} catch (IndexOutOfBoundsException ie) {
				// TODO: handle exception				
			}
		
		}
		
		System.out.println(d1);
		
		

		System.out.println(d1);
		
		/*

		if (stf1[0] == null) {

			stf1[0] = temp2;
			stf1[1] = temp2;

		} else {

			stf1[0] += temp2;
			stf1[1] += temp2;

		}

		String[] tempsarr1 = stf1[0].split(" ");
		
		double d = Double.parseDouble(tempsarr1[0]);
		double d1 = 0;
		
		if (tempsarr1.length >= 4 || e.getSource() == jb[24]) {
			
			list.clear();

			for(int i = 1; i < tempsarr1.length; i += 2 ) {
				if(tempsarr1[i].equals("+") || tempsarr1[i].equals("-") || tempsarr1[i].equals("=")) {
					list.add(i);
				}
			}
			
			
			for(int i = 0; i < list.size(); i++) {
				
				if(i == 0) {
					for(int j = 1; j < list.get(0); j += 2) {
						
						if (tempsarr1[j].equals("*")) {
							d = Double.parseDouble(tempsarr1[j - 1]) * Double.parseDouble(tempsarr1[j + 1]);
							tempsarr1[j + 1] = String.valueOf(d);
						} else if (tempsarr1[j].equals("/")) {
							d = Double.parseDouble(tempsarr1[j - 1]) / Double.parseDouble(tempsarr1[j + 1]);
							tempsarr1[j + 1] = String.valueOf(d);
						}
						
					}
					
					d1 = d;
					
				} else {
					for(int j = list.get(i-1); j <list.get(i); j += 2) {
						
						if (tempsarr1[j].equals("*")) {
							d = Double.parseDouble(tempsarr1[j - 1]) * Double.parseDouble(tempsarr1[j + 1]);
							tempsarr1[j + 1] = String.valueOf(d);
						} else if (tempsarr1[j].equals("/")) {
							d = Double.parseDouble(tempsarr1[j - 1]) / Double.parseDouble(tempsarr1[j + 1]);
							tempsarr1[j + 1] = String.valueOf(d);
						}
						
					}
				}
				
			}
			
			d=d1;
			
			for(int i = 0; i < list.size(); i++) {
				
				if(tempsarr1[list.get(i)].equals("+")) {
					d += Double.parseDouble(tempsarr1[list.get(i+1)-1]); 
				} else if(tempsarr1[list.get(i)].equals("-")) {
					d -= Double.parseDouble(tempsarr1[list.get(i+1)-1]); 
				}
				
			}
			
			if(e.getSource() == jb[24]) {
				stf1[1] = stf1[1].substring(0, stf1[1].length() - 2);
				
			}
			
			stf2[1] = String.valueOf(d);
			stf2[0] = String.valueOf(d);
			
		} 

		
		stf2[0] = "0";
		
		*/


	}
}
