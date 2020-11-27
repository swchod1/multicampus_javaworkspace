package exex;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> score = new ArrayList<Integer>();
		
		int i, j;
		for (i = 0; i < 30; i++) {
			score.add(i) ;
		}
		
		for (j = 0; j < score.size(); j++)

		      System.out.format("[%d] = %s%n", j, score.get(j));

		

	}

}
