package forexam;


/*
 * 다중 for 문을 이용하여 구구단을 작성하는 프로그램
 */

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 강사님이 하신거
		int i, j;
		
		for (i = 2; i<=9; i++) {//단 (바깥쪽 for문)
			for (j = 1; j <= 9; j++) {//(1~9) 안쪽 for문
				System.out.printf("%d X %d = %d\n", i, j, (i*j));
			}
			System.out.println();
		}
		
		// 구구단 내가 한거
/*		int i, j;
		
		for(i = 1; i < 10 ; i++) {
			System.out.printf("=구구단 %d단=\n", i);
			for(j = 1; j < 10 ; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*i);
			}
		}*/
		

	}

}
