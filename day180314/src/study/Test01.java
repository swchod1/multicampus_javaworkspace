package study;

public class Test01 {

    static int c;
	//전역변수는 초기화 하지 않아도 된다. 자동으로 0으로 초기화 됨
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 선언 및 초기화(메모리에 값 할당)
		/* 지역변수는 초기화 해주지 않으면 출력할 때 에러
		 * 
		 * 
		 */
        int a = 0 , b = 0;
		/*
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/
        
        a = 10;
        b = 30;
        
       int c = a + b;
        // 변수 a와 b에 할당된 값을 계산하여 c라는 변수에 저장한다.
        
        // 출력문을 이용하여 마지막으로 계산된 값을 출력한다.
        
        System.out.println("두 수의 합계 : "+c);
        
	}

}
