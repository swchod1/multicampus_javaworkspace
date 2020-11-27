package exexex;

public class Ex3 {
	
    ///////// 내가 한거 ///////////
	
/*	int num;
	boolean isKwang;
	
	public Ex3() {
		
		this.num = 1;
		this.isKwang = true;
		
	}
	
	public Ex3(int num, boolean isKwang ) {
		
		this.num = num;
		this.isKwang = isKwang;
		
	}
	
	String info() {
		if(isKwang) {
			return String.valueOf(num) + "K";
		} else {
			return String.valueOf(num);
		}
		
	}*/
	
	//////// 정답 //////////
	
	int num;
	boolean isKwang;
	
	// 생성자
	Ex3() {
	this(1, true); // SutdaCard(1, true) . 를 호출한다
	}
	Ex3(int num, boolean isKwang) {
	this.num = num;
	this.isKwang = isKwang;
	}
	
	
	// 메소드
	String info() { // . ( ) K . 숫자를 문자열로 반환한다 광 인 경우 를 덧붙인다 光
	return num + ( isKwang? "K" : "");
	}

		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ex3 card1 = new Ex3(3, false);
		Ex3 card2 = new Ex3();
		System.out.println(card1.info());
		System.out.println(card2.info());
		}

}
