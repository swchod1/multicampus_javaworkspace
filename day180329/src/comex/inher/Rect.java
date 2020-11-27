package comex.inher;

public class Rect extends SuperEx2 {
	
	private int w, h;
	
	public Rect() {
		
	}
	
	public void calc (int w, int h) {
		
		this.w = w;
		this.h = h;
		
		area = w*h;
		write();
		
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형 : " + area);
		
	}
	
	

}
