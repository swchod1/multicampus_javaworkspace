package com.awtex;

import java.awt.*;

import javax.swing.*;

public class FileDialogEx extends JFrame {
	
	FileDialog fd = new FileDialog(this, "저장하기", FileDialog.SAVE);
	
	
	public FileDialogEx() {
		// TODO Auto-generated constructor stub
		
		super("파일 대화 상자");
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(300, 300);
		setVisible(true);
		fd.setVisible(true);
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FileDialogEx();

	}

}
