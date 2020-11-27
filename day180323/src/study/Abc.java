package study;

class BBB{
	
	
	
	
	void aa(int a, int b) {
		int c;
		
		c = a + b;
		System.out.println(c);
		
	}
		
}





public class Abc extends BBB {/// 상속 받기
	
/*	public Abc() {

	}

	public Abc(int a) {

	}

	public Abc(int a, int b) {

	}*/
	
	
	// 컨트롤 + 스페이스에서 aa(상속받을 메소드)를 선택하면 불러와 진다.
	/*@Override
	void aa(int a, int b) {
		// TODO Auto-generated method stub
		super.aa(a, b);
	}*/
	
	@Override
	void aa(int a, int b) {
		
        int c;
		
		c = a + b;
		System.out.println(c);
		
	} // ---- 그대로 가져다 쓸 수도 있다.
	
	
	int aa(int a, int b, int d) { /// d가 빠지면 왜 안됌?
		
        int c;
		
		c = a + b + d;
		
		return c;
		//System.out.println(c);
		
	} 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aa(10,20,30); /// 에러
		
		/*Abc abc = new Abc();// Abc 클래스의 메소드를 abc라는 이름으로 메인에 불러옴
		                              // 참조
		abc.aa(10,20,30);
		
		
		
		System.out.println(abc.aa(10, 20, 30));*/
		
		
		Abc abc = new Abc(); /// abc a1 a2 .... 객체 -- 하나의 사물을 지칭하는 명칭
		Abc a1 = new Abc();
		Abc a2 = new Abc();
		Abc a3 = new Abc();
		Abc a4 = new Abc();
		
		abc.aa(10,20,30);
		
		a1.aa(10, 20);
		a1.aa(10, 50, 40);
		
		a2.aa(10,20,80);
		a2.aa(39, 30);
		

	}

}
