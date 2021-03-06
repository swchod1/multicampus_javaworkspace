package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class JTableEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("학생정보");

		f.setPreferredSize(new Dimension(300, 200));
		f.setLocation(500, 400);
		Container contentPane = f.getContentPane();

		String colNames[] = { "이름", "나이", "성별", "주소" };

		DefaultTableModel model = new DefaultTableModel(colNames, 0);

		JTable table = new JTable(model);

		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		// 패널추가
		Panel p = new Panel();
		// 텍스트 필드 추가
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		JTextField text4 = new JTextField(30);
		
		// 버튼
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		JButton button3 = new JButton("출력");
		
		// 라벨
		p.add(new JLabel("이름"));
		p.add(text1);
		p.add(new JLabel("나이"));
		p.add(text2);
		p.add(new JLabel("성별"));
		p.add(text3);
		p.add(new JLabel("주소"));
		p.add(text4);
		
		p.add(button1);
		p.add(button2);
		p.add(button3);
		
		contentPane.add(p, BorderLayout.SOUTH);
		
		// 추가 이벤트
		button1.addActionListener(new AddActionListener(table, text1, text2, text3, text4));
		
		// 삭제 이벤트
		button2.addActionListener(new RemoveActionListener(table));
		
		// 출력 이벤트 전에꺼 끌어다 옴
		button3.addActionListener(new PrintActionListener(table));
		
		f.setSize(900, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
