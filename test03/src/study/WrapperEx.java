// byte -> Byte , short -> Short , int -> Integer
// long -> Long , float -> Float , double -> Double

// boolean -> Boolean , char -> Character

package study;

public class WrapperEx {

	public static void main(String[] args) {

		byte a_min = Byte.MIN_VALUE;
		System.out.println(a_min);

		byte a_max = Byte.MAX_VALUE;
		System.out.println(a_max);

		int b_min = Character.MIN_VALUE;
		System.out.println(b_min);

		// 혹은
		// char b_min = Character.MIN_VALUE;
		// System.out.println((int)b_min);

		int b_max = Character.MAX_VALUE;
		System.out.println(b_max);

		// 숫자를 문자열로 변환하는 방법
		int one = 30;
		String ss = String.valueOf(one);
		System.out.println(ss);

		// 문자열을 숫자로 변환하는 방법
		// 즉 이러한 것은, 문자열이 숫자로 구성되어 있을 때, 이 값을 숫자로써 빼내오고 싶을 때 사용

		String sss = "123";
		// String sss = "abc"; 문자->숫자로 바꾸고 싶은데, 얘는 애초에 문자이므로 Exception 에러 발생
		byte b = Byte.parseByte(sss);
		System.out.println(b);
	}

}
