package com.homework180418;

import javax.swing.*;
import java.awt.*;

public class PILay {
	
	// extends JFrame
	
/*
	JLabel[] l = new JLabel[3];

	TextField[] tf = new TextField[3];

	CheckboxGroup cg = new CheckboxGroup();

	Checkbox man = new Checkbox("남자", cg, true);
	Checkbox woman = new Checkbox("여자", cg, false);

	JButton bt = new JButton("확인");

	public PILay() {
		// TODO Auto-generated constructor stub

		super("개인 정보");

		Container con = this.getContentPane();

		con.setLayout(new GridLayout(4, 1));

		Panel p[] = new Panel[4];

		for (int i = 0; i < p.length; i++) {
			p[i] = new Panel(new FlowLayout(FlowLayout.CENTER));
			con.add(p[i]);
		}
		;

		l[0] = new JLabel("아이디 입력 :", JLabel.CENTER);
		l[1] = new JLabel("비밀번호 입력 :", JLabel.CENTER);
		l[2] = new JLabel("비밀번호 재입역 :", JLabel.CENTER);

		for (int i = 0; i < tf.length; i++) {
			tf[i] = new TextField(10);
			p[i].add(l[i]);
			p[i].add(tf[i]);
			tf[i].setFont(new Font("굴림체", Font.BOLD, 15));
		};

		p[3].add(man);
		p[3].add(woman);
		p[3].add(bt);
	

		tf[1].setEchoChar('*');
		tf[2].setEchoChar('*');
		
		bt.addActionListener(new PIAct(bt, tf, cg));

		setSize(250, 150);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	*/
	
	public static void main(String[] args) {
		JFrame jf = new JFrame("개인 정보");
		
		JLabel[] l = new JLabel[3];

		TextField[] tf = new TextField[3];

		CheckboxGroup cg = new CheckboxGroup();

		Checkbox man = new Checkbox("남자", cg, true);
		Checkbox woman = new Checkbox("여자", cg, false);

		JButton bt = new JButton("확인");
		
		Container con = jf.getContentPane();

		con.setLayout(new GridLayout(4, 1));

		Panel p[] = new Panel[4];

		for (int i = 0; i < p.length; i++) {
			p[i] = new Panel(new FlowLayout(FlowLayout.CENTER));
			con.add(p[i]);
		}
		;

		l[0] = new JLabel("아이디 입력 :", JLabel.CENTER);
		l[1] = new JLabel("비밀번호 입력 :", JLabel.CENTER);
		l[2] = new JLabel("비밀번호 재입역 :", JLabel.CENTER);

		for (int i = 0; i < tf.length; i++) {
			tf[i] = new TextField(10);
			p[i].add(l[i]);
			p[i].add(tf[i]);
			tf[i].setFont(new Font("굴림체", Font.BOLD, 15));
		};

		p[3].add(man);
		p[3].add(woman);
		p[3].add(bt);
	

		tf[1].setEchoChar('*');
		tf[2].setEchoChar('*');
		
		bt.addActionListener(new PIAct(bt, tf, cg));

		jf.setSize(250, 150);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	

}
