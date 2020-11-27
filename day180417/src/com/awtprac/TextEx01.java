package com.awtprac;

import java.awt.*;

public class TextEx01 extends Frame {
	
	private TextField tf = new TextField("제목 : ");
	private TextArea ta = new TextArea("입력", 10, 15);
	private Button bt = new Button("저장");
	private Label la = new Label("내용");
	
	public TextEx01() {
		// TODO Auto-generated constructor stub
		
		super("임시창");
		
		setLayout(new BorderLayout());
		
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(bt, BorderLayout.SOUTH);
		add(la, BorderLayout.WEST);
		
		tf.setBackground(Color.red);
		ta.setBackground(Color.red);
		bt.setBackground(Color.red);
		la.setBackground(Color.red);
		
		tf.setForeground(Color.yellow);
		ta.setForeground(Color.yellow);
		bt.setForeground(Color.yellow);
		la.setForeground(Color.yellow);
		
		tf.setFont(new Font("굴림체", Font.BOLD, 20));
		ta.setFont(new Font("굴림체", Font.BOLD, 20));
		bt.setFont(new Font("굴림체", Font.BOLD, 20));
		la.setFont(new Font("굴림체", Font.BOLD, 20));
		
		WinEvent01 we = new WinEvent01();
		addWindowListener(we);
		
		setSize(500, 500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TextEx01();

	}

}
