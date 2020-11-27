package com.ioexam;

import java.io.File;
import java.io.IOException;

// 파일, 디렉토리 생성 및 삭제

public class FileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 파일 생성

		// 빈 파일이 만들어짐
		// 파일이 있으 해당 파일을 가져오고 없으면 새로 만듬
		File f1 = new File("c:/Hello.txt");

		if (f1.exists()) {
			System.out.println("파일 이름 : " + f1.getName());
		} else {
			try {
				if (f1.createNewFile()) {
					System.out.println("새로운 파일을 만들었습니다.");
				} /*
					 * catch (IOException e) { e.printStackTrace();
					 */

			} catch (IOException e) {
				e.printStackTrace();

			}

		}
		// 디렉토리 생성
		
		File f2 = new File("c:/pk");
		
		if(!f2.exists()) {
			f2.mkdirs();
		} else {
			System.out.println("디렉토리 이름 : " + f2.getPath());
		}
		
		
		// 파일 및 디렉토리 삭제
		
		File f3 =  new File("c:/abc.txt");
		if(f3.exists()) {
			f3.delete();
		}
		
		// 파일 및 디렉토리 이름 변경
		
		File src = new File("c:/Hello.txt");
		
		File dest = new File("c:/pk/dest.txt");
		File dest2 = new File("c:/pk/dest2.txt");
		
		if(src.exists()) {
			
			src.renameTo(dest);
			src.renameTo(dest2);
			
		}
		
		if(f2.isDirectory()) {
			String dir[] = f2.list();
			
			for(String dirs : dir) {
				System.out.println(" dirs : " + dirs);
			}
		}
		
		
		
	}

}
