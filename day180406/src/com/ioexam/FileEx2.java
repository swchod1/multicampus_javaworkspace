package com.ioexam;

import java.io.File; // 자동 생성 x ??


public class FileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File directory = new File("c:/windows");
		
		if(directory.exists()) { // 디렉토리가 존재하는지 알아보는 함수
			
			if(directory.isDirectory()) { // 존재하긴 하는데 이게 디렉토리인지 아닌지 확인
				
				String[] fileNameList = directory.list();
				for(String fileName : fileNameList) {
					System.out.println("파일이름 : " + fileName);
				}
				
			}
			
		}
		
		

	}

}
