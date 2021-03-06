package com.swingex;

import java.awt.*;

import javax.swing.*;

/*
 * Swing 구현의 4단계
 * 
 * 1. import javax.swing.*;
 * 2. JFrame 클래스 상속
 * 3. Component에 맞게 앞에 J이니셜 추가
 * 4. Container con = this.getContentPane();
 * 
 */

/*
 * 이미지 추가 방법
 * 
 * new ImageIcon(이미지 파일 경로 및 이름);
 * new ImageIcon("src/img/ico01.jpg");
 * 
 */




public class JLabelEx extends JFrame {
	
	private Icon icon = new ImageIcon("src/img/ico01.jpg"); // 방법 1, 2, 3 으로 구현
	
	private JLabel jlb1 = new JLabel(icon); // 방법 1
	private JLabel jlb2 = new JLabel("Two", JLabel.CENTER); // "Two" ??\
	private JLabel jlb3 = new JLabel("T	hree", icon, SwingConstants.RIGHT); // 방법 3
	
	
	
	
	
	public JLabelEx() {
		// TODO Auto-generated constructor stub
		
		super("JLabel");
		
		Container con = this.getContentPane();
		
		con.setLayout(new GridLayout(3, 1)); // 여기서 레이아웃 설정
		
		con.add(jlb1); // 방법 1
		con.add(jlb2); // 방법 2
		jlb2.setIcon(icon); // 방법 2
		
		con.add(jlb3);
		
		setSize(300, 200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 스윙의 종료
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JLabelEx();

	}

}
