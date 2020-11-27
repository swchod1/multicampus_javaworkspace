package exexex;


public class Ex3 {
	
	public String owner;
	private long number;
	private int point;
	private int balance;
	
	
	public void use(int a) {
		balance += a;
	}
	
	public void payBill(int a) {
		balance -= a;
	}
	
	public void addPoint(int a) {
		point += a/1000;
	}
	
	
	

	
	
	

	public long getNumber() {
		return number;
	}








	public void setNumber(long number) {
		if (number < 1000_0000_0000_0000l) {
			System.out.println("잘못된 카드 번호입니다.");
			return;
		}
		
		this.number = number;
	}








	public int getPoint() {
		return point;
	}








	public void setPoint(int point) {
		this.point = point;
	}








	public int getBalance() {
		return balance;
	}








	public void setBalance(int balance) {
		this.balance = balance;
	}








	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		
		

	}

}
