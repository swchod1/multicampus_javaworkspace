package study;


//// 값에 의한 호출 call by value
public class ValuePrameter {
	
	public int increase (int n) {
		++n;
		return n;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//// 값에 의한 호출 call by value
		int var1 = 100;
		
		ValuePrameter vv = new ValuePrameter();
		int var2 = vv.increase(var1);
		
		System.out.println("var1 : " + var1 + ", var2 : " +var2);
		
		
		/*
		 * 메소드 호출시 기본자료형의 값을 인자로 전달받는 방식
		 * 
		 * 
		 */
		
		

	}

}
