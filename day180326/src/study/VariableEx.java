package study;

public class VariableEx {
	
	
	/*
	 * 메소드 정의시 통일된 인자의 자료형에 ... 라고
	 * 명시함으로 이를 통해 메소드를 수행하는데 필요한 
	 * 인자의 수를 유연하게 구현할 수 있음
	 * (내부적으로 배열화 작업을 자동으로 해줌) 
	 * 
	 */
	
	
	public void argTest(String ... n) { //// 배열에 String 변수를 넣는다.(String 띄고 ... 띄고 n)
		/*
		 * String n[] = {"댜댜","냐냔","갸약","야됵","안욛",....} 의 절차를 자동으로 해줌
		 */
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("n [" + i + "] : " + n[i]);
		}
		
		System.out.println();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VariableEx ve = new VariableEx();
		
		ve.argTest("홍길동", "김유신");
		ve.argTest("100", "200", "300");
		
		
		
		
		

	}

}
