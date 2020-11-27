package com.homework180421prac;

import java.awt.*;


import java.io.*;

import javax.swing.*;

public class GaSave extends JFrame {
	
	FileDialog fd = new FileDialog(this, "저장하기", FileDialog.SAVE);
	JTextArea ta1;
	JTextArea ta2;
	JLabel jl;
	
	public GaSave(JTextArea ta1, JTextArea ta2, JLabel jl) {
		// TODO Auto-generated constructor stub
		
		fd.setVisible(true);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		if(fd.getFile() == null) {
			return;
		}
		
		
		try {
			
			fw = new FileWriter(fd.getDirectory()+fd.getFile());
			bw = new BufferedWriter(fw);
			
			bw.write("■     수입     ■");
			// writer.write(System.lineSeparator());
			bw.newLine();
			bw.newLine();
			bw.write(ta1.getText());
			bw.newLine();
			bw.newLine();
			bw.write("■     지출     ■");
			bw.newLine();
			bw.newLine();
			bw.write(ta2.getText());
			bw.newLine();
			bw.newLine();
			bw.write("■     현재 잔액     ■");
			bw.newLine();
			bw.newLine();
			bw.write(jl.getText());
			bw.newLine();
			bw.newLine();
			bw.flush();
			
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
			
			try {
				if(bw != null) {
					bw.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
				
			}
			
		}
		
	}

}
