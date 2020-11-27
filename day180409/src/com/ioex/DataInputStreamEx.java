package com.ioex;


import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			
			fis = new FileInputStream("c:/data.sav");
			
			dis = new DataInputStream(fis);
			
			/*
			 * DataInputStream은 기본 자료형을 유지한 채로 저장된 값을 읽어들일 수 있는 read() 메소드가 존재함.
			 * 
			 * 읽어들일 때는 반듯이 (*****) 기록한 순서대로 읽어와야함. ---> ???
			 * 
			 */
			
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();

			System.out.println("i 값 : " + i);
			System.out.println("d 값 : " + d);
			System.out.println("s 값 : " + s);

		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
			
			try {
				if(dis != null) {
					dis.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
				
			}
		}

	}

}
