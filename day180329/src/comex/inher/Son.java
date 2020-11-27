package comex.inher;

public class Son extends ParentEx {
	
	int foo = 7;
	
	public int getNumber(int a) {
		return a+2;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ParentEx p = new ParentEx();
		Son s = new Son();
		
		ParentEx ps = new Son();
		
		// System.out.println("부모 메소드는? : " + p.getNumber(0));
		// System.out.println("부모 멤버필드는? : " + p.foo);
		System.out.println("자식 메소드는? : " + s.getNumber(0));
		System.out.println("자식 멤버필드는? : " + s.foo);
		System.out.println("다형성 메소드는? : " + ps.getNumber(0));
		System.out.println("다형성 멤버필드는? : " + ps.foo);
		
		System.out.println();
		

	}

}
