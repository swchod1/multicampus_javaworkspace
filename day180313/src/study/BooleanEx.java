package study;

/*
 * boolean : 유일한 논리형태의 자료형 : 크기 1byte 이지만 
 * 사용하는 것은 1bit 만 사용 나머지(7bit)는 공간만 차지
 * 1 = true, 0 = false
 * 
 *   ex) boolean b =  true or false;
 *		
 * System.out.println("변수 b 의 값은 :" + b + "입니다.");
 * 
 * System.out.printf("변수 b 의 값은 :%b 입니다.\n" , b);
 *  a + b = c , 1, 2, 3 a = 1 b = 2 c = 3
 * \n 새로운 줄로 이동 
 * 
 */





public class BooleanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b =  true;
		
		System.out.println("변수 b 의 값은 :" + b + " 입니다.");
		System.out.printf("변수 b 의 값은 :%b 입니다.\n" , b);
	}

}
