package exexex;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int lotto[] = new int [45];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		/*for (int i : lotto) {
			System.out.print(i+" ");
		}*/
		
		int x;
		for (int i =1, y = 44; i <= 7; i++, y--) {
			x = (int) (Math.random() * y );
			
/*			System.out.println("돌아간 숫자 갯수 : "+y+"+1");
			
			System.out.println("숫자 배열 : ");
			for (int l : lotto) {
				System.out.print(l +" ");
			}
			System.out.println();
			System.out.println("뽑힌숫자"+x+"+1");
			
			
			System.out.println();*/
			
			if (i != 7) {
				System.out.printf("%d번째 당첨번호는 %d입니다.", i, lotto[x]);
			} else {
				System.out.printf("보너스 번호는 %d입니다.", lotto[x]);
			}
			for (int j = 0, k = -1; j < lotto.length; j++) {
				if (x == 0) {
					k++;
				}
				if (lotto[j] != lotto[x+1]) {
					k++;
				}
				lotto[k] = lotto[j];
			}
			
			System.out.println();
			
			
			System.out.println();
		}
		

		
		
		////////////////////////////
/*		int  l1, l2, l3, l4, l5, l6, l7;
		
		int lotto1[] = new int[45];
		int lotto2[] = new int[44];
		int lotto3[] = new int[43];
		int lotto4[] = new int[42];
		int lotto5[] = new int[41];
		int lotto6[] = new int[40];
		int lotto7[] = new int[39];
		
		for (int i = 0; i < lotto1.length; i++) {
			lotto1[i] = i+1;
		}
		
		l1 = (int) (Math.random() * lotto1.length + 0 );
		
		System.out.println("첫번째 당첨번호는 " + lotto1[l1] + "입니다." );
		
		for (int i = 0, j = -1; i < lotto1.length; i++) {
			if (lotto1[i] != lotto1[l1+1]) {
				j++;
			}
			lotto2[j] = lotto1[i];
		}
		
		
		System.out.println();
		for (int i : lotto2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
        l2 = (int) (Math.random() * lotto2.length + 0 );
		
        System.out.println();
		System.out.println("첫번째 당첨번호는 " + lotto2[l2] + "입니다." );
		
		for (int i = 0, j = -1; i < lotto2.length; i++) {
			if (lotto2[i] != lotto2[l2+1]) {
				j++;
			}
			lotto3[j] = lotto2[i];
		}
		
		
		for (int i : lotto2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : lotto3) {
			System.out.print(i+" ");
		}*/
		
		
		
		/*int k = 0, l = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i]%2 == 0) {
				a3[k] = a1[i];
				k++;*/
		 
		

			
			
			


	}

}
