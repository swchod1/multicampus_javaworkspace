package com.ioexam;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c://fileout.txt");
			String message = "안녕하세요 여러분 반갑습니다.";
			fos.write(message.getBytes());
			fos.close(); // 다썼으면 닫아주기
			
			
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			
			fe.printStackTrace();
			
		} catch (IOException ii) {
			
			ii.printStackTrace();
		
		} finally {
			
			try {
				
				if(fos != null) { // 안전장치
					fos.close();
				}
				
			} catch (IOException ii) {
				// TODO: handle exception
				
				ii.printStackTrace();
				
			}
		}
		

	}

}
