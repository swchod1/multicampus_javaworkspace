package systemInOut;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		while (true) {
			System.out.println("== 메뉴 ==");
			System.out.println("1. 예금 조회");
			System.out.println("2. 예금 출금");
			System.out.println("3. 예금 입금");
			System.out.println("4. 종료 하기");
			System.out.print("메뉴를 선택하세요 -> ");

			InputStream is = System.in;

			byte[] b = new byte[8];
			int readByte = is.read(b);

			String input = new String(b, 0, readByte - 2);

			switch (input) {
			case "1":
				System.out.println("예금 조회를 선택하셨습니다.");
				return;
			case "2":
				System.out.println("예금 출금을 선택하셨습니다.");
				return;
			case "3":
				System.out.println("예금 입금을 선택하셨습니다.");
				return;
			case "4":
				System.out.println("종료 하기를 선택하셨습니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 선택하세요");
				break;
			}

		}
		*/

		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		System.out.print("메뉴를 선택하세요 -> ");

		InputStream is = System.in;

		char inputChar = (char) is.read();

		switch (inputChar) {
		case '1':
			System.out.println("예금 조회를 선택하셨습니다.");
			break;
		case '2':
			System.out.println("예금 출금을 선택하셨습니다.");
			break;
		case '3':
			System.out.println("예금 입금을 선택하셨습니다.");
			break;
		case '4':
			System.out.println("종료 하기를 선택하셨습니다.");
			break;
		}
		
	}

}
