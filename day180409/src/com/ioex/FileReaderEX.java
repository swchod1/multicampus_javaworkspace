package com.ioex;


import java.io.*;

public class FileReaderEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader reader = null;
		
		try {
			
			// 파일로 부터 한문자 단위로 읽어 올수 있는 reader 객체 생성
			reader = new FileReader("c:/song.txt");
			
			// 스티림을 토애 읽어 들인 유니코드 값을 저장할 변수
			
			int readValue = 0;
			
			while ((readValue = reader.read()) !=- 1) {
				System.out.println((char)(readValue));
			}
			
			
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}

		}
	}

}
