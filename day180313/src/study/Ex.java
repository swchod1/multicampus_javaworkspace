package study;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 범위값 초기값이 범위를 벗어나면 초과
		 * 
		 * 연산 1 byte a1 = -128; byte a2 = 0; byte a3 = 127; a3++;
		 * 
		 * System.out.println(a3);
		 * 
		 * 결과 -128 한바퀴 돌아옴 -128~127에서 128이 없어서 처음으로 - 쓰레기 값(엉터리 값)
		 */
		/*
		 * int aa = -2147483648; int bb = -3; int cc = aa + bb;
		 * 
		 * System.out.println(cc);
		 * 
		 * 결과 - 2147483645 한바퀴 돌아옴 -2147483648~2147483647에서 뒤로 세 칸 돔
		 */

		int a1 = 15;
		if (a1 > 10) {
		}
		int a2 = a1 - 10;
		int a3 = a1 + a2 + 20;

		System.out.println(a3);
		
		byte b1 =127;
		int b2 = 127;
		for(int i = 0; i<5; i++) {
			b1++;
			b2++;
			System.out.println("b1 : " + b1 + "\t" +"b2 : " + b2);
			
			/*
			 * 결과 b1 : -127	b2 : 129
                      b1 : -126	b2 : 130
                      b1 : -125	b2 : 131
                      b1 : -124	b2 : 132
			 */
			
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
				
		int unicode = c1;
		int unicode1 = c3;
		
		System.out.println("c1 : " + c1 + ", c2 :" + c2 + ", c3 :" + c3);
		System.out.println("c4 : " + c4 + ", c5 :" + c5 + ", c6 :" + c6);
		System.out.println(unicode);
		System.out.println(unicode1);
		
		/*
		 * 결과 b1 : -124	b2 : 132
                  c1 : A, c2 :A, c3 :가
                  c4 : 가, c5 :가, c6 :가
                  65
		 * 
		 */
		
		char c = 32; // unicode 32     공백 
		
		System.out.println("나는"+c+"졸린"+c4+"?");
		
		/*  
		 * 자동변환은 
		 * int iv = 65; 와 byte bv = 65;는
		 * char cv = iv; 안됨
		 * int와 byte 등 음수 값을 가질 수 있는 타입은 양수만 가질 수 있는 char로 변환X
		 * 
		 * 강제변환은
		 * int intvalue = 'A';
		 * char charvalue = (char) intvalue;
		 * system.out.println(charvalue);
		 * 으로 가능
		 * 
		 * 마찮가지로 실수형도 정수형로 자동변환 X
		 * 하지만 실수형이 정수로 구성되어있을 경우 강제변환해도 값은 같다.
		 * 소수점 이하 부분이 있다면 버려지고 정수로 저장됨.
		 */
		
		//강제
		int intvalue = 65;
		char charvalue = (char) intvalue;
		System.out.println(charvalue);
		//결과 A
		
		//자동
		byte z1 = 127;
		int z2 = z1;
		System.out.println(z2);
		//결과 127
		
		char z3 = '조';
		int z4 = z3;
		System.out.println("조의 유니코드는 "+z4+"이다.");
		//결과 조의 유니코드는 51312이다.
		
		char z5 = 51312;
		System.out.println(z5);
		//결과 조
		
		z2 = 800;
		long z6 = z2;
		System.out.println(z6);
		//결과 800
		
		z2 = 400;
		double z7 = z2;
		System.out.println(z7);
		//결과 400.0
		
		float z8 = z2;
		System.out.println(z8);
		//결과 400.0
		
		/*
		 * byte s1 = 10;
		 * byte s2 = 20;
		 * byte s3 = s1 + s2;
		
		 * char s4 = 65;
		 * char s5 = s4 +1;
		 * 
		 * byte와 char는 연산이 불가한 것이라??????  X
		 * 	는 논리적으로  안된다.
		 * 
		 */
		
		
	
		}
		
	}
	
	
	
}
