package com.ioexam;

import java.io.*;

public class FileCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===파일 복사 시작===");
		long start = System.currentTimeMillis(); // 시스템의 현재 시간의 저장
		
		FileInputStream src = null; // 원본
		FileOutputStream dest = null; // 복사본
		
		
		
		try {
			// 원본 파일을 읽기 위한 FileInputStream 객체를 생성함.
			src = new FileInputStream(new File("c://fileout.txt"));
			// "C://fileout.txt"을 new File에 읽어서
			// 
			
			// 복사본 파일을 생성하기 위한 FileOutputStream 객체를 생성함.
			dest = new FileOutputStream(new File("c://dest.txt"));
			
			// FileInputStream을 통해서 읽어들인 값을 저장할 변수
			int readValue = 0;
			
			// FileInputStream의 read() 메소드를 통해서 읽어들인 값을 변수 readValu 에 저장함
			
			while((readValue = src.read()) != -1) { // -1 -> 값이 존재 하지 않음
				
				// readValue에 저장된 값을 FileOutputStream의 write() 메소드를 통해서 파일에 씀
				
				dest.write(readValue);
				
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
