package test;

/*
 * 1 ~100 까지의 수중에서 짝수들의 합계를 구하시오.
 * 단, while 문 사용
 * 
 * 1 ~100 까지의 수중에서 홀수들의 합계를 구하시오.
 * 단, while 문 사용
 * 
 */

public class TestEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, sum1 = 0, sum2 = 0; // 바깥 쪽의 초기값 선언

		while (i <= 100) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}

			i++;

		}
		System.out.print("1~100까지의 짝수의 합은 : " + sum1);
		System.out.print("\n1~100까지의 홀수의 합은 : " + sum2);

	}

}
