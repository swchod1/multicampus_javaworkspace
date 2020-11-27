package exexex;

public class Ex5 {

	int num;
	boolean isKwang;

	public Ex5() {
		this(1, true);
	}

	public Ex5(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() { //// 뭐냐??? info().....
		return num + (isKwang ? "K" : "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex5 card1 = new Ex5(3, false);
		Ex5 card2 = new Ex5();
		System.out.println(card1.info());
		System.out.println(card2.info());

		/*
		 * 결과가 3 1K 가 나오게
		 */

	}

}
