package com.homework180421;

import java.awt.*;

import java.io.*;

import javax.swing.*;

public class GaLoad extends JFrame {
	
	FileDialog fd = new FileDialog(this, "불러오기", FileDialog.LOAD);
	
	JTextArea jta = new JTextArea();
	JScrollPane jsp = new JScrollPane(jta);

	public GaLoad() {
		// TODO Auto-generated constructor stub
		
		super("내역");
		
		Container con = this.getContentPane();
		con.add(jsp);
		
		fd.setVisible(true);
		
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		if(fd.getFile() == null) {
			return;
		}
		
		try {
			fis = new FileInputStream(fd.getDirectory()+fd.getFile());
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			String str = null;
			
			while ((str = br.readLine()) != null) {
				jta.append(str + "\n");
			}
			
		} catch (FileNotFoundException fe) {
			
			// TODO: handle exception
			fe.printStackTrace();
			
		} catch (IOException io) {
			
			io.printStackTrace();
			
		} finally {
			
			try {
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
			
		}
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		/*
		setSize(400, ds.height - 50);
		setLocation(ds.width-getWidth(), 5);
		*/
		setBounds(ds.width-400, 5, 400, ds.height - 50);
		
		
		setResizable(false);
		setVisible(true);
		jta.setEditable(false);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
