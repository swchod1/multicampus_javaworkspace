package exexex;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExAccount account = new ExAccount();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(30000);
		System.out.println("현재 잔고 : " + account.getBalance());

	}

}
