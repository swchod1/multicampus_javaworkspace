package study;

public class DoWhileEx5 {

	public static void main(String[] args) {
	
		int i =-50;
		
		do
		{
			System.out.printf("\t%d", i);
			i++;
			if(-i % 5==0)
				System.out.println();
		}while(i <=1);
		System.out.println();
		
		
		
		

	}

}
