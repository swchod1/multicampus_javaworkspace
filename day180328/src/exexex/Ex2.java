package exexex;

import java.util.*;


public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Ex1 ex = new Ex1();
		
		System.out.print("문자열 입력 : ");
		String a = sc.next();
		
		char aa[] = new char[a.length()];
		
		// 대 - 소  소 -대
		for(int i = 0; i < a.length(); i++ ) {
			
			aa[i] = a.charAt(i); 
			//System.out.println(aa[i]);
			
			if (aa[i] >= 'A' && aa[i] <= 'Z') {
				System.out.print(ex.lower(aa[i]));
			} else {
				System.out.print(ex.upper(aa[i]));
			}
			
		}
	
	}

}
