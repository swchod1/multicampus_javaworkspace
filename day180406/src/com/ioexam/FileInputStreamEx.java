package com.ioexam;

import java.io.*;


public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		// 크기 정하기
		byte _read[] = new byte[100]; // 저장할 수 있는 공간?????
		byte console[] = new byte[100];

		try {
			System.out.print("파일명 : ");
			System.in.read(console); // console에 입력
			String file = new String(console).trim(); // 공백제거 후 읽어서 file에 저장하고
			
			fis = new FileInputStream(file); // 스트림으로 읽어 들여서
			fis.read(_read, 0, _read.length); // _리드로 읽어 들임 (배열길이에 맞게) 
			
			System.out.println(new String(_read).trim()); // 내용물을 출력함
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ii) {
			ii.printStackTrace();
		} finally {
			
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException ie) {
				// TODO: handle exception
				
				ie.printStackTrace();
			}
		}
		
	}

}
