package com.ioex;

import java.io.*;

public class FileWriteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter writer = null;

		try {
			// 파일에 한문자 단위로 기록할 수 잇는 FileWriter 객체 생성

			writer = new FileWriter("d:/song.txt");

			// writer : 생성된 객체는 바로 문자열을 기록할 수 있음

			String s = "학교 종이 땡땡땡 어서 모이자";

			writer.write(s);

			/*
			 * 한글자 단위로 읽고 쓸 수 있는 Reader, Writer 계열의 스트림은 내부적으로 버퍼를 내장하고 있음.
			 * 내장된 버퍼는 버퍼가 가득찼을 때만 스트림을 통해 내보냄. 
			 * flush()는 버퍼가 가득차지 않아도 비우게 하는 메소드임. 
			 * 하여 반드시 flush()를 써서 강제로 자료를 보내 줘야 함.
			 */

			writer.flush();

		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {

			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}

		}

	}

}
