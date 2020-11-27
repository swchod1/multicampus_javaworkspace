package com.ioexam;

import java.io.File;



public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일 객체 생성
		File f = new File("c:/abc.txt"); // 파일 위치와 파일명
		// or File f = new File("c://abc.txt"); -> 리눅스 할때는 // ????
		
		System.out.println("파일인지 여부 : " + f.isFile());
		System.out.println("디렉토리인지 여부 : " + f.isDirectory()); // 쓰고 있는 폴더??
		System.out.println("상대경로 : " + f.getPath());
		System.out.println("절대경로 : " + f.getAbsolutePath());
		System.out.println("디렉토리 혹은 파일 이름 : " + f.getName());
		System.out.println("파일의 길이 : " + f.length());
		System.out.println("파일 최종 수정 날짜 : " + f.lastModified());
		
		// 결과
		/*
		파일인지 여부 : true
		디렉토리인지 여부 : false
		상대경로 : c:\abc.txt
		절대경로 : c:\abc.txt
		디렉토리 혹은 파일 이름 : abc.txt
		파일의 길이 : 92
		파일 최종 수정 날짜 : 1522976523979 ???? 인트형으로 바뀌어서 나온 것
		*/

	}

}
