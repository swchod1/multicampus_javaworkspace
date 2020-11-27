package study;

public class SalayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary sa = new Salary();
		
		sa.setPay(10000, "1234"); // 비밀번호 1234가 틀리면 출력이 0 이됨 --- 출력이 인식 안됌
		
		int myPay = sa.getPay();
		
		System.out.println("나의 계좌에 입급한 금액 : " + myPay);
		

	}

}
