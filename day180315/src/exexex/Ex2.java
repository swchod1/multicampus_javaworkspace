package exexex;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int com = (int)(Math.random() * 3 + 1);
		
		
		/*
		int na;
		
		int a, b;
		
		System.out.print("가위 : 1, 바위 : 2, 보 : 3 ?");
		na = sc.nextInt();
	
		
		a = na - com;
		b = na + com;

		if (a == 0) {
			System.out.println("나" + na + "컴퓨터" + com + "\n비겼습니다.");
		} else if (b == 4) {
			if(a > 0) {
				System.out.println("나" + na + "컴퓨터" + com + "\n졌습니다.");
			} else if (a < 0) {
				System.out.println("나" + na + "컴퓨터" + com + "\n이겼습니다.");
			}
		} else {
			if(com > na) {
				System.out.println("나" + na + "컴퓨터" + com + "\n졌습니다.");
			} else if (com < na) {
				System.out.println("나" + na + "컴퓨터" + com + "\n이겼습니다.");
			}
		}
		*/
		
		String x = "", y = "";
		System.out.print("가위? 바위? 보? : ");
		x = sc.next();
		int a=0, l, m;
		
		switch (com) {
	     case 1 :
	    	 y = "가위";
	    	 break;
	     case 2 :
	    	 y = "바위";
	    	 break;
	     case 3 :
	    	 y = "보";
	    	 break;
	    }
		
		switch (x) {
		     case "가위" :
		    	 a = 1;
		    	 break;
		     case "바위" :
		    	 a = 2;
		    	 break;
		     case "보" :
		    	 a = 3;
		    	 break;
		}
		
		
		l = a - com;
		m = a + com;

		if (l == 0) {
			System.out.printf("나는 %s를 내고 컴퓨터는 %s를 내서 비겼습니다.", x, y);
		} else if (m == 4) {
			if(l > 0) {
				System.out.printf("나는 %s를 내고 컴퓨터는 %s를 내서 졌습니다.", x, y);
			} else if (l < 0) {
				System.out.printf("나는 %s를 내고 컴퓨터는 %s를 내서 이겼습니다.", x, y);
			}
		} else {
			if(com > a) {
				System.out.printf("나는 %s를 내고 컴퓨터는 %s를 내서 졌습니다.", x, y);
			} else if (com < a) {
				System.out.printf("나는 %s를 내고 컴퓨터는 %s를 내서 이겼습니다.", x, y);
			}
		}
		
		

		
	}

}
