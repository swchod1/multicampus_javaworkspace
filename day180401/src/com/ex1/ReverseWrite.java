package com.ex1;

public class ReverseWrite extends ReverseCal {
	
    ///////////////////// 2차(1차에서 한거 클래스 쪼개보기) ///////////////////////
	
	
	void write() {
		
		System.out.println("입력하신 정수는 "+jari()+"자리 정수 입니다.");
		System.out.print("반대로 출력한 결과 : ");
		for( int i : reverse()) {
			System.out.print(i);
		}
		
	}
	

}
