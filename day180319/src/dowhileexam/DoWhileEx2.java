package dowhileexam;


import java.io.*;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class DoWhileEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*int menu = 0;
		
		do {
			System.out.println("1. 부대찌게");
			System.out.println("2. 해물파전");
			System.out.println("3. 김치찌게");
			System.out.println("0. 저녁메뉴마감");
			
			System.out.print("메뉴를 선택하세요 : ");
			
			menu = System.in.read()-48;
			System.in.skip(2);
		} while (menu != 1 && menu != 2 && menu != 3 && menu != 0);
		
		System.out.println("당신이 선택한 오늘의 저녁메뉴는 : " + menu);*/
		
        int menu = 0;
		
		do {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원조회");
			System.out.println("3. 회원탈퇴");
			System.out.println("0. 프로그램종료");
			
			System.out.print("메뉴를 선택하세요 : ");
			
			menu = System.in.read()-48;
			System.in.skip(2);
		} while (menu != 1 && menu != 2 && menu != 3 && menu != 0);
		
		System.out.println("당신이 선택한 오늘의 저녁메뉴는 : " + menu);

	}

}
