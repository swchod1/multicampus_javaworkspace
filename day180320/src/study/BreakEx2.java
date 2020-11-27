package study;

public class BreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		One : for (int i = 0; i < 5; i++) {
			
			Two : for (int j = 0; j < 3; j++) {
				
				if (j == 2) {
					break Two;
				}	
					System.out.print(j + "x" + i + "  ");
			}
		}
		System.out.println();

	}

}
