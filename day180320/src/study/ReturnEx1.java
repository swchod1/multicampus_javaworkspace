package study;

public class ReturnEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnEx1 rr = new ReturnEx1();
		
/*		int d = rr.add(3, 8);
		
		System.out.println(d);*/
		
		rr.add(3, 3);
		System.out.println();

	}
	
/*	public int add(int a, int b) {
		int result = 0;
		
		result = a + b;
		return result;*/
	
	// void는 리턴문이 없다.
	public void add(int a, int b) {
			int result = 0;
			
			result = a + b;
			System.out.println(result);
		
		
	}
	

}
