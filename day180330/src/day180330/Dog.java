package day180330;

public class Dog extends Animal {

	
	private String name;

	public Dog() {

		name = getClass().getSimpleName(); // 해당 클래스가 가지고 있는 이름을 그래도 가져다 씀
		// name = "Cat"; 랑 같음

	}
	
	@Override
	public String Scream() {
		// TODO Auto-generated method stub
		return "멍~~~~~~~~~멍";
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	

}
