package study;

/* byte -> Byte  short -> Short  int -> Integer
 * long -> Long   float -> Float   double -> Double
 * 
 * boolean -> Boolean   char -> Character
 * 
 * 래퍼클래스 : 기본 자료형을 변화시킨 것 ?
 * 버퍼 : 임시기억 공간
 * 스트립 : 버퍼를 채워주는 것?
 * int a; ->a라는 공간 확보(버퍼)
 * 시스템 아웃하면 키보드로 a값 입력 ->스트립?
 * BufferedReader, Scanner 둘다 입력 시키는거
 * 예) Scaner : sc = new Scanner(system.in.~~~)
 *      BufferedReader : br = new BufferedReader(~~~
 *                                  new ~~~(system.in.~~~)) 
 * 
 * 
 */
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a_min = Byte.MIN_VALUE;
		System.out.println("a_min 값은 : " + a_min);
		byte a_max = Byte.MAX_VALUE;
		System.out.println("a_max 값은 : " + a_max);
		
		char b_min = Character.MIN_VALUE;
		System.out.println("b_min 값은 : " + (int)b_min);
		char b_max = Character.MAX_VALUE;
		System.out.println("b_max 값은 : " + (int)b_max);
		
		//숫자를 문자열로
		int one = 30;
		String ss = String.valueOf(one);
		
		System.out.println(ss);
		//문자열 안에 있는 숫자를 빼어내는 것 반대 개념....
		
		
		//문자열을 숫자로
		String sss = "123";
		int b = Integer.parseInt(sss);
		//문자열 안에 있는 숫자를 빼어내는 것
		
		System.out.println(b);
		
		
		
		
		
		
		
		
	}

}
