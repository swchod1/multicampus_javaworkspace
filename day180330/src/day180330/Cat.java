package day180330;

public class Cat extends Animal {
	
	private String name;
	
	public Cat() {
		
		name = getClass().getSimpleName(); // 해당 클래스가 가지고 있는 이름을 그래도 가져다 씀
		// name = "Dog"; 랑 같음
		
	}
	
	@Override
	public String Scream() {
		// TODO Auto-generated method stub
		
		return "야~~~~~~~~~옹";
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
