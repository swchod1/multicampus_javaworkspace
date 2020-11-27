package exexex;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LOTTO
		
		int i, j, k, l, m, x, y, z;
		int[] lotto = new int[45];
		
		for (x = 0; x <= 44; x++) {
			lotto[x] = x + 1;
		}
		
		for (j = 1, i = 45; j <= 7; j++, i--) {
			l = (int) (Math.random() * i + 1 );
			
            if (lotto[l - 1] == l) {
				System.out.printf("%d번째 당첨번호는 %d입니다.", j, l);
			}
			
			for (k=0, m=0; k <= i-2; k++, m++) {
				if (k == l-1) {
					m++;
				}
				int[] newlotto = new int [i-2];
				newlotto[k] = lotto [m];
				System.out.println(newlotto[3]);
			}
			
			
			

		}
		
		

    }
		
	
	
	//int num = (int)(Math.random() * 45 + 1);
/*		
	int z, z1, z2, z3, z4, z5, z6, z7, zz;
	String zi;
	
	for (int i = 1; i <=  7; i++) {
		z =  (int)(Math.random() * 45 + 1);
		for (int j = 1; j <= 45; j++) {
			if (j == z) { 	
			System.out.println(i + "번 숫자 : " + j);
			}
		} 
		zi = */
	
	
/*		int num1 = (int)(Math.random() * 45 + 1);
		int num2 = (int)(Math.random() * 45 + 1);
		int num3 = (int)(Math.random() * 45 + 1);
		int num4 = (int)(Math.random() * 45 + 1);
		int num5 = (int)(Math.random() * 45 + 1);
		int num6 = (int)(Math.random() * 45 + 1);
		int num7 = (int)(Math.random() * 45 + 1);
		
		for (int i = 1; i <= 45; i++ ) {
			if (num1 == i) {
				System.out.println("첫번째 숫자 : " + num1);
			}
		}
		
		for (int i = 1; i <= 45; i++ ) {
			if (i != num1 && num2 == i) {
				System.out.println("두번째 숫자 : " + num2);
			}
		}
		for (int i = 1; i <= 45; i++ ) {
			if (i != num1 && i != num2 && num3 == i) {
				System.out.println("세번째 숫자 : " + num3);
			}
		}
		for (int i = 1; i <= 45; i++ ) {
			if (i != num1 && i != num2 && i != num3 && num4 == i) {
				System.out.println("네번째 숫자 : " + num4);
			}
		}
		for (int i = 1; i <= 45; i++ ) {
			if (i != num1 && i != num2 && i != num3 && i != num4 && num5 == i) {
				System.out.println("다섯번째 숫자 : " + num5);
			}
		}
		for (int i = 1; i <= 45; i++ ) {
			if (i != num1 && i != num2 && i != num3 && i != num4 && i != num5 && num6 == i) {
				System.out.println("여섯번째 숫자 : " + num6);
			}
		}
		for (int i = 1; i <= 45; i++ ) {
			if (i != num1 && i != num2 && i != num3 && i != num4 && i != num5 && i != num6 && num7 == i) {
				System.out.println("보너스 숫자 : " + num7);
			}
		}*/

	}


