package bank;

public class Account {
	
	// 필드
	private String name; // 이름
	private long balance; // 잔고
	
	
	// 생성자
	public Account(String name) { 
		// TODO Auto-generated constructor stub
		
		this.name = name;
		
	}

    // get set
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	// 메소드(입출금)
	// 입금	
	public void deposit(long amount) {
	// 입금기능을 구현한 메소드
    // 잔고 에 amount를 누적시킴
		
		balance += amount;
		
	}
	
	// 출금
    public void withdraw(long amount) {
		
		if(balance < amount) {
		//잔고가 출금하고자 하는 금액보다 작은 경우 
			
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
		
		} else {
			
    	balance -= amount;
		
		}
		
		
	}
	
}
