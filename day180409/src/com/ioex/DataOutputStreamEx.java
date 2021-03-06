package com.ioex;

import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DataOutputStream은 기본 자료형 타입 그대로 스트림을 통해서 기록할 수 있음.

		// 스트림에서 사용되는 자료형
		// - readBoolean(), writeBoolean(boolean b), readInt(), writeInt(int v),
		// readUTF(), writeUTF(Strirng s) 등

		// DataOutputStream은 다른 스트림을 통해서 특정 Device와 연결 할 수 있음.

		DataOutputStream dos = null;

		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream("c:/data.sav");

			dos = new DataOutputStream(fos);

			int i = 10;
			double d = 3.14;
			String s = "사랑해요 김태희!!!";

			// DataOutputStream은 기본 자료형 별로 write()가 존재함.

			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);

		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
			
			try {
				if(dos != null) {
					dos.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
				
			}
			
		}
	}

}
