package InputOutput;

public class BitThreeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 21, b = 16;
		
		System.out.printf("a = %d, b = %d \n", a, b);
		
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println();
		System.out.printf("a = %d, b = %d \n", a, b);

	}

}
