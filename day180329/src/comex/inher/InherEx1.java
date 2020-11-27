package comex.inher;

import java.io.*;


public class InherEx1 extends SuperEx1 {
	
	
	public InherEx1() {
		// TODO Auto-generated constructor stub
		
		System.out.println("여기는 sub 클래스 ......");
		
	}
	
	public void circle() throws IOException {
		
		int r = 10;
		super.area = r*r*3.14;
		write("원 : ");
		
	}
	
	public void rect() throws IOException {
		
		int w = 20, h = 15;
		area = w*h;
		write("사각형 : ");
		
	}
	
	
	
    // 자바의 클래스는 다중 상속이 안됀다.
	
	public static void main(String[] args) throws IOException { // throws IOException 이결 잘 모르겠음
		// TODO Auto-generated method stub
		
		InherEx1 r = new InherEx1();
		
		r.circle();
		r.rect();
				
		
		
		
		
		
		

	}

}
