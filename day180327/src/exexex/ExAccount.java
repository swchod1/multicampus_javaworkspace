package exexex;

public class ExAccount {
	
	private int balance; // 필드
	
	static final int MIN_BALANCE = 0; // 상수 설정
	static final int MAX_BALANCE = 1000000;
	
	// GET SET
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			
			this.balance = balance;
			
		}
		
		
	}
	
	// 메소드
	
	
	
	
	
	
	

}
