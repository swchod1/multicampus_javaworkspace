package com.homework;

import java.util.*;

public class HomeWorkEx1_180402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set set = new HashSet<Integer>();
		
		int[] a = {2, 3, 7, 10, 11};

		int[] b = {3, 6, 10, 14};
		
		for(int i : a) {
			set.add(i);
		}
		
		for(int i : b) {
			set.add(i);
		}
		
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
