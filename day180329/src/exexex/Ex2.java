package exexex;

public class Ex2 extends Ex1 {
	
	public String univ;
	public long number;
	
	public Ex2 (String name, long number, String univ, long idNumber) {
		super(name, number);
		this.univ = univ;
		this.number = idNumber;
		
	}
	
	
	public long getSNumber() {
		
		return super.number;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
