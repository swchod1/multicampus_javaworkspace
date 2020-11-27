package com.ioex;

import java.io.*;

public class BufferedWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw = null;
		
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("d:/hello.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("태희누나 ");
			bw.newLine(); // 라인 띄기
			bw.write("사랑해요 !!!!!!"
					+ System.getProperty("line.separator")); // 라인 띄기
			bw.write("그리고 반가워요....");
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
