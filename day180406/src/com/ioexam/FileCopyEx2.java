package com.ioexam;

import java.io.*;

public class FileCopyEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===파일 복사 시작===");
		long start = System.currentTimeMillis(); // 시스템의 현재 시간의 저장
		
		FileInputStream src = null; // 원본
		FileOutputStream dest = null; // 복사본
		
		
		
		try {
			// 원본 파일을 읽기 위한 FileInputStream 객체를 생성함.
			src = new FileInputStream(new File("c://windows/win.ini"));
			// "C://fileout.txt"을 new File에 읽어서
			// 
			
			// 복사본 파일을 생성하기 위한 FileOutputStream 객체를 생성함.
			dest = new FileOutputStream(new File("c://dest.txt"));
			
		
			int length = 0;
			
			byte[] buffer = new byte[1024*8]; // 8kbyte 크기의 임시기억 공간을 선언
			
			
			// inputstream을 통해서 읽어들인 data를 임시저장소인 buffer에 쌓고
			// data 개수를 length에 저장함.
			while((length = src.read(buffer)) != -1) {
				
				// outputstream 을 통해서 buffer 에 쌓여있는 data를 lenth 만큼 파일에 기록함.
				dest.write(buffer, 0, length);
				
			}
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			
			fe.getLocalizedMessage();
			
		} catch (IOException ii) {
			
			ii.printStackTrace();
			
		} finally {
			
			try {
				if(dest != null) {
					dest.close();
				}
			} catch (IOException ii) {
				// TODO: handle exception
				
				ii.printStackTrace();
			} try {
				if(src != null) {
					src.close();
				}
			} catch (IOException ii) {
				// TODO: handle exception
				
				ii.printStackTrace();
			}
			
		}
		
		long end = System.currentTimeMillis();
		
		long copyTime = (end -start)/1000;
		
		System.out.println("복사하는데 걸린 시간 : " + copyTime + "초");
		
		

	}

}
