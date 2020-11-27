package study;

/* char
 * 크기 : 2byte[unicode 사용]
 *  ex) char ch1 = '\u0041';
 *       char ch2 = 'A'
 *       
 *      char ch1 = 'A';                A = 65 아스키코드
 *		 char ch2 = '\u0041';        \u0041 유니코드 = A = 65 아스키코드  
 *		
 *		System.out.println("ch1 + ch2:" + ch1 + ch2);
 *   	System.out.println("ch1 + ch2:" + (ch1 + ch2));   문자는 더 할 수 없다
 *                                                                         하여, 코드 값 더한 값
 *                         
 *                                                                         
 *     System.out.println("ch1 + ch2:" + (char)(ch1 + ch2));  130의 문자 변환
 *     
 *     출력은    ch1 + ch2:AA
 *                ch1 + ch2:130
 *                ch1 + ch2:             없다 아스키코드는 130이 없다 (127이 끝)                                                              
 *       
 *       
 *       
 *       ch = 65, ch = 'A'
 *       ch = 97  ch = 'a'
 *  http://www.unicode.org/charts/PDF/UFF00.pdf   유니코드
 *  http://shaeod.tistory.com/228     아스키코드
 * 
 * 유니코드 : 2byte 문자 표현 (0 ~ 65535)
 * 아스키코드 : 1byte 문자 표현 (0 ~ 255)
 * 
 * 'A'
 * 유니코드  '/u0041', FF21 
 * 아스키코드  65
 * 
 *   
 * 한글이나 한자는 2byte 까지 표현(1byte로는 표현 불가)
 * 
 */




public class CharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch1 = 'A';
		char ch2 = '\u0041';
		
		System.out.println("ch1 + ch2:" + ch1 + ch2);
		System.out.println("ch1 + ch2:" + (ch1 + ch2));
		
		System.out.println("ch1 + ch2:" + (char)(ch1 + ch2));
	}

}
