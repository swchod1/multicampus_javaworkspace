package exexex;

public class Ex2 {
	
	private long number;
	public String owner;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance += amount;
		System.out.println("현재 카드 사용액 : " + balance);		
	}
	
	public void payBill(int amount) {
		balance -= amount;
		System.out.println("지불액 : " + amount + ", 지불 잔액 : " + balance);		
	}
	
	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println("보너스 포인트 : " + point);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 myCard = new Ex2();
		myCard.number = 1234_4567_5224_4567l;
		myCard.owner = "조승우";
		System.out.println("카드번호 : " + myCard.number);
		System.out.println("카드소유자 : " + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		myCard.addPoint(30000);
		

	}

}
