package regerence;

public class ReferExam2 {
	
	private int w, h;
	
	public int area() {
		return w*h;
	}
	
	public void write(int a) {
		System.out.println("결과 : " + a);
	}
	
/*	public int length() {
		return 2*(w+h);
	}
	
	
	
	public void setData(int w, int h) {
		this.w = w;
		this.h = h;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 인스턴스 생성
		
		ReferExam2 rr = new ReferExam2();
		
		rr.w = 10;
		rr.h = 20;
		
		int a = rr.area();
		rr.write(a);
		
		ReferEx1 r1 = new ReferEx1();
		
		//System.out.println(r1.height);

	}

}
