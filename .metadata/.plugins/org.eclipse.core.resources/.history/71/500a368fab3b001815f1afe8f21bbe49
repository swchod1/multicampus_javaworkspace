package com.ioex;

import java.io.*;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectOutputStream oos  = null;
		
		try {
			// 메모리에 생성된 객체를 직렬화 해서 스트림을 통해 기록할 수 있는 ObjectOutputStream 객체를 생성함.
			
			oos = new ObjectOutputStream(
					new FileOutputStream("c:/obj.sav"));
			
			// ObjectOutputStream을 통해서 직렬화 된 후 파일로 기록될 Data 객체 생성
			
			// Data 클래스는 반드시 Serializable 인터페이스로 구현되어 있어야 함.
			
			// 데이터 객체 생성
			Data data = new Data();
			
			data.setNo(33);
			data.setName("이순신");
			data.setMail("lee@naver.com");
			
			// ObjectOutputStream 객체를 직렬화 해서 스트림을 통해 기록할 수 있는 writeObject()를 통해 기록함.
			
			oos.writeObject(data);

		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
		}
	}

}
