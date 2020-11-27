package test;

/*
 * 사용자로 부터 임의의 알파벳을 입력받은 후 입력받은 알파벳이 소문자면 대문자로
 * 대문자면 소문자로 변환하는 프로그램을 완성하시오
 * 단, 입력은 system.in.read()메소드 사용
 */

import java.io.*;

public class TestEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
/*		
		char ch; // 문자를 입력 받을 변수
		
		System.out.print("알파벳 입력 : ");
		ch = (char)System.in.read();
		
		// 대문자를 입력받았을 경우 소문자로 변환
		if (ch >= 65 && ch <= 90) {
			ch += 32;
		    System.out.println(ch);
		} else if (ch >= 97 && ch <= 122) {
			ch -= 32;
			System.out.println(ch);
		} else {
			System.out.println("입력하신 문자가 알파벳이 아닙니다.");
		}
        */
		
/*		int n; // 범위를 정하기 위한 변수
		char ch; // 문자를 입력 받을 변수
		
		System.out.print("알파벳 한 문자 입력 : ");
		n = (char)System.in.read();
		
		// 대문자를 입력받았을 경우 소문자로 변환
		if (n >= 65 && n <= 90) {
			n += 32;
			ch = (char)(n);
			System.out.println(ch);
		} else if (n >= 97 && n <= 122) {

			n -= 32;
			ch = (char)(n);
			System.out.println(ch);
		} else {
			System.out.println("입력오류!!!");
		}*/
		
		char ch;
		
		System.out.print("알파벳 입력 : ");
		ch = (char)System.in.read();
		
		if (ch >= 'A' && ch <= 'Z') {
			ch += 32;
		    System.out.println(ch);
		} else if (ch >= 'a' && ch <= 'z') {
			ch -= 32;
			System.out.println(ch);
		} else {
			System.out.println("입력하신 문자가 알파벳이 아닙니다.");
		}
		

	}

}
