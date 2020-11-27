package exam;

/*
 * -1^2 + 2^2 - 3^2 + 4^2 - 5^2 + ... + 100^2 의 합을 구하는 프로그램을 작성하시오.
 */



public class DoWhileEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 내가 한거
		/*int x = 1, y = -1, sum = 0;
		do {
			sum += y*(x*x);
			x++;
			y=-y;
		} while (x <= 100);
		
		System.out.print("총계 : " + sum);*/
		
		
		///// 강사님이 하신거
		
		int i = 1, p =1, sum = 0;
		
		do {
			p = -p;
			sum += p*(i*i);
			i++;
		} while (i <= 100);
		
		System.out.println(sum);
		
		
		
		
		

	}

}
