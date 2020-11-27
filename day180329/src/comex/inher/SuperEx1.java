package comex.inher;

public class SuperEx1 { //InherEx1
	
	protected double area;
	//private double area;
	// protected : 하위 클래스, 동일 패키지에서만 접근 가능
	// private : 하위 클래스에서 접근 불가, 오직 클래스 내에서만 접근 가능
	
	// 생성자 --- 생성자 함수
	public SuperEx1 () {
		
		System.out.println("이곳은 슈퍼클래스 .......");
				
	}
	
	// 일반 함수--  메소드
	public void write(String title) {
		
		System.out.println(title + area);
	
	}
	
	
	
	
	
	

}
