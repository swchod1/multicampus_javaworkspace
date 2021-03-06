package com.ioex;

import java.io.*;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectInputStream ois = null;
		
		try {
			
			// 파일에 저장된 객체를 읽어들이기 위해 ObjectInputStream 객체 생성
			
			ois = new ObjectInputStream(
					new FileInputStream("c:/obj.sav"));
			
			// ObjectInputStream 으로부터 읽어들인 직렬화된 객체를 역직렬화 해서 객체를 생성할 수 있음
			// 역직렬화 할 때 필요한 클래스 파일을 찾지 못했을 경우 예외처리 발생함.
			// ClassNotFoundException
			
			Data data = (Data)ois.readObject();
			
			System.out.println("번호 : " + data.getNo());
			System.out.println("이름 : " + data.getName());
			System.out.println("메일 : " + data.getMail());

			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
		}
	}
}
