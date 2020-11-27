package study;

class ThisEx {

	String name, jumin, tel;
	
	
    ///// 위가 private String 일 때 ??/
	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}

	public String getTel() {
		return tel;
	}
	/* 클래스에서 name, jumin, tel가 초기화가 안되어 있기 때문에 
	 * 생성자에 초기화 되어 있는 값을 불러 온다는 뜻 ?????
	 * 
	 */

	// 생성자
	public ThisEx() {

		this.name = "Guest";
		this.jumin = "000000-1000000";
		this.tel = "000-1111-1234";

	}

	public ThisEx(String name) {

		this(); // 위의 매개변수가 없는 생성자 함수 호출
		this.name = name;
	}

	public ThisEx(String name, String jumin) {

		this(name); // 위의 매개변수가 하나인 생성자 함수 호출
		this.jumin = jumin;
	}

	public ThisEx(String name, String jumin, String tel) {

		this(name, jumin); // 위의 매개변수가 두개인 생성자 함수 호출
		this.tel = tel;
	}
	
	
}





public class ThisEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisEx t = new ThisEx();
		
		System.out.println(t.getName()); 
		System.out.println(t.getJumin());
		System.out.println(t.getTel());
		
		System.out.println();
		
		System.out.println(t.name); 
		System.out.println(t.jumin);
		System.out.println(t.tel);
		
		

	}

}
