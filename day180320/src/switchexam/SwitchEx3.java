package switchexam;

/*
 * 1/2 +2/3+3/4+ .... +9/10 =?
 * while 문 사용
 * 누적변수는 double로 선언
 * 결과  : 7.07
 *
 */



public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;	
		double sum = 0;

		
		while (n < 9 ) {
			sum += (double)(n+1)/(n+2);
			n++;
		}
		
		System.out.printf("%.2f", sum);

	}

}
