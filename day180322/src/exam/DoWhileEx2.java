package exam;

/*
 * 0과 100 사이에 존재하는 짝수의 합을 구하는 프로그램 작성
 */



public class DoWhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 0, sum = 0;
		do {
			
			sum += x;
			x += 2;
			
		} while (x <= 100);
		
		System.out.print("0과 100 사이에 존재하는 짝수의 합 : " + sum);
		
		

	}

}
