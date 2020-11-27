package control;

import java.util.Scanner;// 이거 생김 2

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * {}안에서 2줄 이상 처리해야 할때 {}가 없으면 끝나는 지점 인식 X 따라서 에러 
		 * 단, 1줄이면 없어도 됨
		 */
		
		Scanner sc = new Scanner(System.in); // 이거 쓰고 컨트롤 쉬프트 o(영어 오)
		                                                      // 하면 1
		
		int i;
		
		System.out.println("수를 입력 : ");
		i = sc.nextInt();
		
		//중첩if
		if(i>0) {

		if (i % 2 == 0) {
			System.out.println("짝수입니다.");
			System.out.println("참 잘했어요. ^^");
		} else {
			System.out.println("홀수 입니다.");
		}
		} else {
			System.out.println("입력하신 수는 0보다 작습니다.");
			System.out.println("다시 입력하세요");}
		}

	}


