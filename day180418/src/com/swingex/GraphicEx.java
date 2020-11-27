package com.swingex;

import java.awt.*;
import javax.swing.*;

public class GraphicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("학생 성적 그래프");

		f.setPreferredSize(new Dimension(400, 400));
		f.setLocation(500, 200);
		f.setVisible(true);

		Container contentPane = f.getContentPane();
		
		DrawingPanel drawingPanel = new DrawingPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		

		JPanel controlPanel = new JPanel();

		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);

		JButton button1 = new JButton("그래프 그리기");

		controlPanel.add(new JLabel("국어점수"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("영어점수"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("수학점수"));
		controlPanel.add(text3);

		controlPanel.add(button1);

		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		button1.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));
		

		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
