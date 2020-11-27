package study;

/*
 * static
 * 메소드나 멤버필드에 정의할 수 있으며 지역변수나
 * 클래스에는 정의 불가.
 * 
 *  - static 키워드를 사용하면 static 변수 (클래스 변수), static 메소드 라고 함.
 *  - 멤버변수나 멤버 메소드는 해당 객체가 생성될 때 heep 메모리 영역에 존재
 *  - static 으로 선언된 필드 또는 메소드는 static 영역에 유일하게 만들어지면서
 *    모든 객체들이 사용할 수 있는 공유개념을 가짐 
 *  - 객체를 생성하지 않더라도 사용 가능
 *   - 클래스명.변수명 or 클래스명.메소드명 으로도 접근 가능함.
 *   
 * 선언 방법
 * static 메소드
 *  접근제한자 static 반환형 메소드명 (매개변수....) {}
 * 
 * static 필드
 *  접급제한자 static 자료형 변수명;
 * 
 */



public class StaticEx {
	
	// 멤버 필드
    int x;
    
    // static 멤버 필드
    static int y;
    	

}
