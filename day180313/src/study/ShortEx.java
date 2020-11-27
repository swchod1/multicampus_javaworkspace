package study;

/* 
 * short
 * 크기 : 2byte
 * 범위 : -32768 ~ 32767(-2^15~2^15-1)
 *   ex) short s = -32768 ~ 32767 중 하나 ;
 * 
 * 
 */


public class ShortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       short s=10;
       /*
        *  s = 10 초기값을 설정해야함
        *  c 에서는 에러가 발생하지 않고 쓰레기 값이 저장됨
        *  java 에서는 초기값을 정장하지 않으면 에러가 발생 하므로 초기화를 함
        *  
        */
       
       System.out.println(s);
	}

}
