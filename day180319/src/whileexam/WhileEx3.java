package whileexam;

public class WhileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
