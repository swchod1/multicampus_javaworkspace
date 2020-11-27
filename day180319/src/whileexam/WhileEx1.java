package whileexam;

/*
 * while 문을 이용하여 1~100까지의 합계를 구하시오.
 * 
 * 
 */

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 변수 선언
		int i = 0, sum = 0;
		
		while (i <= 100) {
			sum += i; // sum = sum + i
			i++; // i = i + 1
		}
		
		System.out.println("1~100까지의 합계 : " + sum);
		
		//구구단 
        int dan = 2;
		
		while (dan <= 9) {
	        System.out.printf("=구구단 %d단=\n", dan);
	        int y=1;
			while (y <= 9) {
				System.out.printf("%d X %d = %d\n", dan, y, (dan*y));
				y++;
			}
		dan++;
		
		}
		

	}

}
