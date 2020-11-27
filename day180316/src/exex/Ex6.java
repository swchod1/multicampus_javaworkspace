package exex;

/*
 * 사용자로부터 임의의 알파벳 한 문자를 입력 받아
 * 이를 판별하여 알파벳이 모음일 경우만 결과를 출력하시오.
 * 
 * a i e o u 대문자 포함
 * 
 * 단, 대소문자를 모두 적용할 수 있도록 작성
 * 또한 알파벳 이외의 수가 들어오면 오류로 처리한다.
 */

import java.util.*;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
        char ch;
		
		System.out.print("알바벳 입력 : ");
		ch = sc.next().charAt(0);
		/*
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'a' && ch <= 'z')) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.printf("입력하신 정보 %c는 모음(소문자)입니다.", ch);
				} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					System.out.printf("입력하신 정보 %c는 모음(대문자)입니다.", ch);
				}
			} else {
				System.out.println("입력하신 정보가 모음이 아닙니다(자음). 다시 입력해 주세요.");
			}
		} else {
			System.out.println("입력하신 정보가 알바벳이 아님니다. 다시 입력해 주세요.");
		}*/


		String a = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "알파벳 소문자 모음" : (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "알바벳 대문자 모음" : ((ch >= 'a' && ch <= 'z') || (ch >= 'a' && ch <= 'z')) ? "알바벳 자음" : "알파벳 아님";
		
		System.out.println("입력하신 정보는 " + a +"입니다.");
		
		
	}

}
