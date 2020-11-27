package study;

import protectedEx.Exam; //// 접근제한자 protected 에서 다른 패키지에 접근

// protectedEx -- 패키지명

/// 혹은 import protectedEx.*;


class CreditCard extends Exam {

	
	// public 접근제한자
	//public long number;
	private String owner;
	
	// static 예
	static public long number;
	
	
	////// 3의 결과
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	//// 3의 결과
	
	
	/// 접근제한자를 private 로 바꾸면 ..... 1
	
	
	/// 접근제한자 private 에 접근하는 방법 getters, setters
	
	/// get set 쓰는 법마우스 우클릭, 소스, 제너레이트 get set 하면 .......  3
	
		
	
	
}



public class Exam1 {
	
	protected void name() {
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체를 생성한다.  --- class CreditCard 에 접근하기 위해서
		// new 연산자
		
		 CreditCard card = new CreditCard(); //// 객체 생성
		 card.number = 123456;
		// static 변수 설정 없이 바로 가능
		// CreditCard.number = 12346;

		
		
		// card.owner = "홍길동";      /////// 컴파일 에러가 뜬다 ...... 2
		
		//// 접근제한자가 public 이기 때문에 문제없이 불러 옴
		
		
		
		
		
		
		
		
		/// 3 쓰는 법
		/// card.setOwner("홍길동");
		/// 값을 집어 넣을 때는 set
		
		
		//System.out.println(card.number);
		//System.out.println(card.getOwner());
		// 값을 불러 올 때는 get
		
		
		

	}

}
