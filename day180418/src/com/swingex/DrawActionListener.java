package com.swingex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DrawActionListener implements ActionListener {
	
	JTextField text1, text2, text3;
	DrawingPanel drawingPanel;
	
	public DrawActionListener(JTextField text1, JTextField text2, JTextField text3, DrawingPanel drawingPanel) {
		// TODO Auto-generated constructor stub
		
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.drawingPanel = drawingPanel;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		try {
			int kor = Integer.parseInt(text1.getText());
			int eng = Integer.parseInt(text2.getText());
			int mat = Integer.parseInt(text3.getText());
			drawingPanel.setScores(kor, eng, mat);
			drawingPanel.repaint(); // 페인트를 다시 실행 (앞에 클래스에 있음)
		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			
			JOptionPane.showMessageDialog(drawingPanel, "잘못된 숫자 형식입니다.", "에러메세지",
						JOptionPane.ERROR_MESSAGE);
			
		}
		

	}

}
