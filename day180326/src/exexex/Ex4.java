package exexex;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex3 park = new Ex3();
		Ex3 lee = new Ex3();
		
		park.owner = "박지성";
		park.setNumber(4567_8467_0547_8020l);
		
		
		lee.owner = "이민정";
		lee.setNumber(1419_0404_1150_4013l);
		
		park.use(15000);
		park.payBill(10000);
		park.addPoint(15000);
		
		lee.use(20000);
		lee.payBill(20000);
		lee.addPoint(20000);
		
		System.out.println("성명 : " + park.owner);
		System.out.println("카드번호 : " + park.getNumber());
		System.out.println("미지불액 : " + park.getBalance());
		System.out.println("적립된 포인트 : " + park.getPoint());
		
		
		System.out.println("성명 : " + lee.owner);
		System.out.println("카드번호 : " + lee.getNumber());
		System.out.println("미지불액" + lee.getBalance());
		System.out.println("적립된 포인트 : " + lee.getPoint());


	}

}
