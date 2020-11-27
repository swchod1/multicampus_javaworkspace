package com.inner;


// 추상 클래스
/*
abstract class AbsExam { // 추상 클래스
	
	int data = 10000;
	
	public abstract void printDate(); // 추상 메소드

}

*/


// 인터페이스

interface AbsExam {

	int data = 10000;

	public abstract void printDate(); // 추상 메소드

}


public class AnonyInner { // 객체가 없는 익명 클래스 -> 이벤트??? 할 때 많이 사용함.
	
	/// 클래스
	// AbsExam ae = new AbsExam(); // 추상 클래스는 객체 생성 안됨
/*
	AbsExam ae = new AbsExam() {
		
		public void printDate() {
			
			System.out.println("data : " + data);
			
		} // 여기는 자동으로 생긴 ; 를 제거해 주고
	}; // 여기는 ; 없으니까 빼먹지 말고 ; 넣어 주고
	*/
	
	// 인터페이스

	public void Exam() {

		new AbsExam() {

			public void printDate() {

				System.out.println("data : " + data);

			}

		}.printDate();

	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스
/*
		AnonyInner ai = new AnonyInner();
		ai.ae.printDate();
		*/
		
		
		// 인터페이스
		
		AnonyInner ai = new AnonyInner();
		ai.Exam();
	}

}
