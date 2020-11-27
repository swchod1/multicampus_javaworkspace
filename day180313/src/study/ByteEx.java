package study;

public class ByteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* byte 
		 * 크기 :1byte
		 * 입출력 범위 : -128~127
		 * ex) byte b = 129 java에서는 컴파일 시 에러 ???? - 안정성 때문에 메모리를 벗어난다. 
		 *      c프로그램에서는 127로 나옴 컴파일러가 다르다. 마이너스로 해서 넘긴다. 
		 *   ex) byte bb =  -128~127;
		 */
		byte bb = -128;
		bb++;
		
		/* bb++=bb+1  ++는 1씩 증가 --는 1씩 감소
		 * ++bb는 연산자는 내일
		 * byte에서 bb=bb+1은 에러가 난다. (순환?)
		 *
		 * 
		 * 
		 */

		System.out.println(bb);
	}

}
