package com.swingex;

import java.awt.*;

import javax.swing.*;

import javax.swing.border.*;

public class BorderEx extends JFrame {
	
	private JButton[] jb = new JButton[6];
	
	// private Icon icon = new ImageIcon("src/img/icon001.jpg");
	
	public BorderEx() {
		// TODO Auto-generated constructor stub
		
		super("다양한 선모양");
		
		Container con = this.getContentPane();
		
		con.setLayout(new GridLayout(3, 2, 10, 10));
		
		for(int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(i + 1 + "번 버튼"); // ,icon
			// jb[i].
			con.add(jb[i]);
		}
		
		// 경계선 지우기
		EmptyBorder eb = new EmptyBorder(10, 10, 10, 10); // 숫자의 의미??? 상하좌우 두께?
		jb[0].setBorder(eb);
		
		
		LineBorder lb = new LineBorder(Color.red, 5); // 숫자 -> 두께
		jb[1].setBorder(lb);
		
		EtchedBorder eb1 = new EtchedBorder(); // 가를 살짝 깎는다
		jb[2].setBorder(eb1);
		
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED); // ???
		jb[3].setBorder(bb);
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jb[4].setBorder(sbb);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.green);
		jb[5].setBorder(mb);
		
		
		setSize(900, 900);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new BorderEx();

	}

}
