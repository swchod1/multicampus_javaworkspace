
// ASCII code 값 입력받기.

package study;

import java.io.*;

public class InputEx1 {

	public static void main(String[] args) throws IOException {
			System.out.println("문자 입력: ");
			
			// 아스키코드 값이 무엇인지 궁금할 때 사용한다.
			int i = System.in.read();		
			System.out.println("ASCII 값: " + i);
			
			// 단, 문자를 그대로 출력하고 싶을때는?
			char j = (char)System.in.read();
			System.out.println(j);
	}

}
