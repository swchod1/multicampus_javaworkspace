package study;

public class DoWhileEx4 {

	public static void main(String[] args) {

		int i =1, p =1, sum =0;
		
		do {
			
			p=-p;
			sum += p*(i*i);
			i++;
						
		}while(i<=100);
		
		System.out.println(sum);
	
	}

}
