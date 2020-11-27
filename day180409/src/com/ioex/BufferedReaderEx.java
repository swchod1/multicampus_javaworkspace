package com.ioex;

import java.io.*;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream("d:/hello.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			// 한 라인씩 읽어 들인 문자열을 저장할 변수 선언
			String str = null;
			
			// readLine() 개행문자를 만나면 개행문자 이전까지의 문자열을 반환하고 스트림 끝에서 null을 반환함
			
			while ((str = br.readLine()) != null) {
				System.out.println(str);
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
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
			try {
				if (isr != null) {
					isr.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException io) {
				io.printStackTrace();
			}
		}

	}

}
