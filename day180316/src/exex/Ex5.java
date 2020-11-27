package exex;

/*
 * 사용자로 부터 임의의 정수 세개를 입력받아 작은수에서부터 큰수 순으로 출력하시오.
 * 
 * 16 8 21
 * 
 * --> 8 16 21
 * 
 * 단, if를 이용하여 처리하시고, 
 * BufferedReader 로 처리하시오.
 */
import java.io.*;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
		
		int a, b, c, d = 0;
		System.out.print("입력 수 1 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("입력 수 2 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("입력 수 3 : ");
		c = Integer.parseInt(br.readLine());
		
		System.out.printf("입력 수1 = %d, 입력 수2 = %d, 입력 수3 = %d \n", a, b, c);
		
/*		if (a >= b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		} 
		if (b >= c) {
				b = b ^ c;
				c = c ^ b;
				b = b ^ c;
	    }
		if (a >= b) {
				a = a ^ b;
				b = b ^ a;
				a = a ^ b;
	    }*/
		
		if (a >= b) {
			d = a;
			a = b;
			b = d;
		}
		if (b >= c) {
			d = b;
			b = c;
			c = d;
		}
		if (a >= b) {
			d = a;
			a = b;
			b = d;
		}
		
		System.out.println();
		System.out.printf("%d >= %d >= %d", a, b, c);

		

	}

}
