package study;

class MyClass {
	
	private String name;
	private int age;
	
	// 생성자 오버로딩
	
	public MyClass() {
		// TODO Auto-generated constructor stub
		
		name = "무명";	
	}
	
	public MyClass(String n) {
		name = n;
	}
	
	public MyClass(String n, int a) {
		
		//name = n;
		
		this(n); // this() 이것은 다른 생성자에게 받음
		age = a;
	}
	
	public MyClass(int a, String n) {/// 여기는 인자값 순서가 다름
		name = n;
		age = a;
	}
	
	
	// 생성자 오버로딩
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}











public class MyClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
