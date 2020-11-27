package study;

public class StaticExam {
	
	/*
	 * Ex를 여기에 명시해도 동작 됨.
	 * 
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(StaticEx.x); // 에러남
		// 에러 이유 : 객체를 생성하지 않고 접근을 시도했기 때문
		// 해결 방법 : 객체를 생성해서 접근해야함 올바른 접근이 됨
		
		// 위의 문제 해결
		StaticEx se = new StaticEx();		
		// StaitcEx 클래스의 객체 성성
		
		System.out.println(se.x);
		// 객체를 생성해서 StaticEx 클래스 멤버필드에 접근
		
		
		
		// StaticEx.y = 100; // 값을 설정해 주지 않으면 자동으로 0으로 초기화 됨.
		// y는 StaticEx 클래스의  static 멤버필드이기 때문에 객체를 생성하지 않더라도 접근이 가능함
		// 반면 y는 x와 달리 static 으로 선언되었기 때문에 가능 
		// static 동일한 패키지에서 접근 가능
		
		System.out.println(StaticEx.y);
		
		

	}

}
