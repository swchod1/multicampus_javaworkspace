package test;

/*
 * 1부터 100까지의 합을 구하되
 * 10의 배수가 될때마다 결과를 출력하시오.
 * 
 * 결과 1~10까지의 합 : 55
 *       1~20까지의 합 : 210
 *                             465

 *       
 *                            5050
 *       
 */



public class TestEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 1, sum = 0;
		while (i <= 100) {
			sum += i;
			if (i % 10 == 0) {
				System.out.printf("1~%d까지의 합 : %d\n", i, sum);
			}
			
			i++;

		}

	}

}
