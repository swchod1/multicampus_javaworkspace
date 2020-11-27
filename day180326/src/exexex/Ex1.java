package exexex;

public class Ex1 {
	
	private long number;  
	public String owner;

	public static void main(String[] args) {
		
		Ex1 myCard = new Ex1();
		
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "유 재석";
		
		System.out.print("카드번호 : " + myCard.number);
		System.out.println(" , 카드소유자 :  " + myCard.owner);

	}
}
