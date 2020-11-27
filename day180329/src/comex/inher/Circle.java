package comex.inher;

public class Circle extends SuperEx2 {
	
	public Circle (String title) { // (String title) 요런 변수가 있는 
		
		super(title); // 상위 클래스의 생성자를 의미함
		
	}
	
	public void calc(int r) {
		
		area = r*r*3.14;
		
		write();
		
	}
	

}
