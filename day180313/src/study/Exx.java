package study;

// 실수형의 기본 자료형은 double형이다.

public class Exx {

	int aa=15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exx fe = new Exx();
	
		
		
		System.out.println(fe.aa);
		fe.aaaa();
		fe.bbbb();
		fe.aa();
	
	int d = fe.aa();
System.out.println(d);	
	}//end main
	
	
	
	public void aaaa() {
		System.out.println(aa);
	}
	
	public void bbbb() {
	
		System.out.println(aa);
	}
	public int aa() {
		int c=0;
		int a=2,b=3;
		c=a+b;
		return c;
	//	System.out.println(c);
		// 메인이 아닌 공간은 직접 출력하지 못하며 함수기능만 가지고 있는다.
		
	}
	
	
	
	
}
