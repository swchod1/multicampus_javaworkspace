package com.ioex;

import java.io.*;

public class PrintWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintWriter pw = null;
		
		try {
			
			fos = new FileOutputStream("d://printwriter.txt");
			
			bos = new BufferedOutputStream(fos);
			
			pw = new PrintWriter(bos, true);
					
			pw.println("안녕하세요");
			pw.println("또 만났네요");
			pw.println(100.0);
			pw.println(new Boolean(true));
			
			
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {

			try {
				if(fos != null) {
					fos.close();
				}
				if(bos != null) {
					bos.close();
				}
				if(pw != null) {
					pw.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
			
			
		}
		
		
		

	}

}
