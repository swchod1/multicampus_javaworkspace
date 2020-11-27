package InputOutput;

import java.util.*;

public class BitFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int var; // 입력받을 수
		int offset; // 이동할 수
		int temp, result;
		
		System.out.print("입력받을 수 : ");
		var = sc.nextInt();
		
		System.out.print("이동할 수 : ");
		offset = sc.nextInt();

		result = var >> offset;
		temp = var << offset;
		
		System.out.printf(" %d >> %d = %d \n", var, offset, result);
		System.out.printf(" %d << %d = %d \n", var, offset, temp);
		
		
	}

}
