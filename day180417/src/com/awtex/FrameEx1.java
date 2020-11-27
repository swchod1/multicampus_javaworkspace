package com.awtex;

import java.awt.*;

public class FrameEx1 { // 종료 클래스 따로 생성

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 프레임 객체를 생성 // 생성자에 "제목"이 있음
		Frame f = new Frame("2D프로그래밍");
		
		// 닫기 기능 활성화
		WinEvent we = new WinEvent(); 
		f.addWindowListener(we);
		
		// 프레임의 크기
		f.setSize(300, 200);
		// 프레임 보임 가불
		f.setVisible(true);

	}

}
