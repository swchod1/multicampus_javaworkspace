package dowhileexam;

public class DoWhileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 2;
		do {
			System.out.printf("=구구단 %d단=\n", i);
			int j = 1;
		    do { 
				System.out.printf("%d X %d = %d\n", i, j, (i*j));
				j++;
			} while (j <= 9);
			i++;
		} while (i <= 9);

	}

}
