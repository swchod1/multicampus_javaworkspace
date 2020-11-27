package com.ioex;

import java.io.*;

public class PrintStreamEx { // 모든 자료형을 제공한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		
		BufferedOutputStream bos = null;
		
		PrintStream ps = null;
		
		try {
			
			fos = new FileOutputStream("d:/hello2.txt");
			
			bos = new BufferedOutputStream(fos);
			
			ps = new PrintStream(bos, true); // 오토블래시 기능을 사용하겠느냐???
			
			ps.print("홍길동");
			ps.println(1234);
			ps.println(true);
			ps.println('a');
			
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		} finally {

			try {
				if(fos != null) {
					fos.close();
				}
				if(bos != null) {
					bos.close();
				}
				if(ps != null) {
					ps.close();
				}
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
			
			
		}

	}

}
