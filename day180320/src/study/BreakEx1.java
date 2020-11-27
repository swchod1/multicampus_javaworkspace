package study;

public class BreakEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		while (i <= 100) {
			
			System.out.print("" + i);
			if (i == 20) {
				break;
			}
			
			i++;
		}
		System.out.println();

	}

}
