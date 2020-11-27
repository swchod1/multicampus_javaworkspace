package comex.inher;
//자바의 클래스는 다중 상속이 안됀다.
public class SuperEx2 { // rect circle ---> InherEx2 에서 실행
	
	protected double area;
	private String title;
	
	
	public SuperEx2() {
		// TODO Auto-generated constructor stub

		
	}
	
	public SuperEx2(String title) {
		// TODO Auto-generated constructor stub
		
		this.title = title;
		
	}
	
	public void write() {
		
		System.out.println(title + area);
		
	}
	

}
