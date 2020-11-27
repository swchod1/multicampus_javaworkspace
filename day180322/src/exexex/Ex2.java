package exexex;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 5-1
		/*int arr[] = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += i;
		}
		
		System.out.println("sum=" + sum);
		*/
		
		/*int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			
		}*/
		
		
		/*
		 * 1   2   3  4
		 * 12 13 14 5
		 * 11 16 15 6
		 * 10  9   8 7 
		 * 
		 * 
		 */
		
		int i, j, k = 11, l = 1, m = 0, o =1, p = 0;
		
		for(i = 1; i <= 4; i ++ ) {
			for (j = 1; j <= 4; j++) {
				if (i == j) {
					System.out.printf("%d\t", j);
				} else {
					
				}
			}
			
			System.out.println();
		}

	}

}
