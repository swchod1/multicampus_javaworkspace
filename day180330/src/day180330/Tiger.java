package day180330;

public class Tiger extends Animal {
	
	private String name;
	
	public Tiger() {
		
		name = getClass().getSimpleName();
		
	}
	
	@Override
	public String Scream() {
		// TODO Auto-generated method stub
		return "어~~~~~~~흥";
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
