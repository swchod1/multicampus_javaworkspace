// 자바의 표준 입출력
// import.java.io.*
// 메소드 뒤에 throws IOExceoption을 반드시 기재해야 함.


// System Class와 기본 입출력
// - in, out, err(PrintStream)

// print()
// println()
// write() - 화면 출력시 버퍼에 담음( System.out.flush() 메소드를 호출. )
// 단, byte 배열 사용시에는 autoflush가 됨.


// 번외 편..
// 입력받을 시 커서가 깜빡거린다 -> 실행과 동시에 버퍼가 만들어졌다는 의미이다. (입력하는 자와 변수 사이를 연결시켜주는 일종의 인터페이스)
// 엔터를 침과 동시에 버퍼에 있던 내용이 사라지고, 그 내용을 밖으로 내보내고 (이는 flush 메소드 호출로 가능)
// 다음 수행될 명령어를 버퍼에 입력받을 준비를 시킨다.
// 단, 위에서도 말했듯이 byte 배열 사용시에는 autoflush가 자동으로 되어, 따로 flush의 메소드를 호출할 필요가 없다.

package study;

import java.io.IOException;;

public class InputOutput  {

	public static void main(String[] args) throws IOException {
		
		//write 메소드를 이용하여 버퍼에 입력한 상태.
		System.out.write(65);
		System.out.flush(); // 버퍼에 있는 내용을 출력해라.
		
		
		// byte배열은 flush 메소드 사용할 필요없이 화면에 바로 출력이된다.
		byte[] by = {'J', 'A', 'V', 'A' };
		
		System.out.write(by, 0, 4);
		// 즉, byte배열 사용 시에는 autoflush 기능이 내장되어있다.
	}
}
