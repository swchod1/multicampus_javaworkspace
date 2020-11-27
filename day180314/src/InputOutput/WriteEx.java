package InputOutput;

/* 자바의 표준 입출력
 * 
 * import java.io.*;  * - 안에 있는 것을 다 사용함
 * JRE System Library - ra.jar -  java.io
 * 메소드 뒤에 throws IOException 을 반드시 기재해야함
 * 
 * System Class 와 기본 입출력
 * - in, out, err(PrintStream)
 * 
 * print()
 * println()
 * write() - 화면 출력시 버퍼에 담음, 버퍼에 남기는 것
 *              (System.out.flush() 메소드를 호출 - 버퍼에서 내보냄(버퍼 내용은 지워짐) - 출력)
 *              단, byte 배열 사용시에는 autoflush 가 됨
 *              java 의 기본 byte 4kb
 *              jsp 의 기본 byte 8kb
 *              컴퓨터 의 기본 byte 64kb
 * 
 * 
 * 
 */
import  java.io.*;

public class WriteEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.write(65);
		// write 메소드를 이용하여 버퍼에 입력한 상태

		System.out.flush();
		// 버퍼에 있는 내용을 출력

		byte[] by = { 'J', 'A', 'V', 'A' };
		System.out.write(by, 0, 4);
		// byte 배열 사용시에는 autoflush 기능이 내장됨
		 
		
		
	}

}
