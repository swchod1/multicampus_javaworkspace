package homework180405prac;

import java.util.*;

public class PanmaiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		PanmaiImpl pi = new PanmaiImpl();
		
		while(true) {
			
			do {
				System.out.print("||1.상품등록||2.상품판매||3.종료|| > ");
				x = sc.nextInt();
				
			} while(x < 1 || x > 3);
			
			switch(x) {
			case 1 : 
				pi.productMainDsp();
				break;
			case 2 : 
				pi.saleMainDsp();
				break;
			case 3 : 
				System.exit(0);
			}
			
		}

	}

}
