package com.swingex;

import java.awt.*;
import javax.swing.*;




public class JTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("학생정보");
		
		f.setPreferredSize(new Dimension(300, 200));
		// f.setSize(300, 300);
		f.setLocation(500,400);
		Container contentPane = f.getContentPane();
		
		String colNames[] = {"이름", "나이", "성별", "주소"}; // 필드명
		
		Object data[][] = {
				{"홍길동", 52, '남', "강원도 두메산골"},
				{"김태희", 30, '여', "강원도 두메산골"},
				{"한가인", 31, '여', "강원도 두메산골"},
				{"송혜교", 32, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				{"전지현", 33, '여', "강원도 두메산골"},
				
		};
		
		JTable table = new JTable(data, colNames);
		
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JButton button = new JButton("출력");
		
		// 이벤트리스너
		button.addActionListener(new PrintActionListener(table));
		
		contentPane.add(button, BorderLayout.SOUTH);
		
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
