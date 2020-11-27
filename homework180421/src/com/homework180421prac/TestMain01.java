package com.homework180421prac;

public class TestMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double x = 2555;
		double y = Math.sqrt(x);
		
		// System.out.println(y);
		
		String s = "Math.sqrt(2555)";
		String w = "2.6 + 2.3";
		
		int u = w.indexOf('+');
		
		// System.out.println(u);
		
		double q = Double.parseDouble(w.substring(0, u-1));
		// System.out.println(q);
		
		String d = "1/3";
		
		double a = 2.6;
		double b = 2.6;
		
		// System.out.println(a + b);
		
		String z = "0 = ";
		
		String[] tempsarr = z.split(" ");
		
		
		
		for(int i = 0; i < tempsarr.length; i++) {
			System.out.println(tempsarr[i]);
		}
		
		double e = Double.parseDouble(tempsarr[0]);
		
		System.out.println(e);
		
		String a1 = "(2 + 2)";
		
		// a1 = a1.substring(0, a1.length()-1);
		
		
		a1 = a1.substring(a1.lastIndexOf(" "), a1.length());
		
		// System.out.println(a1.indexOf(" "));
		
		// System.out.println(a1);

	}

}
