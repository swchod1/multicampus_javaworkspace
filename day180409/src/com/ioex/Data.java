package com.ioex;

import java.io.Serializable;

public class Data implements Serializable {
	
	private int no;
	private String name;
	private String mail;
	
	/*
	 * 자바에서 입출력 데이터는 스트림을 통해 이동하는데 문자열이나 정수형 같은 데이터와는 달리
	 * 객체는 바이트형이 아니어서 스트림을 통해 파일에 저장하거나 네트워크로 전송할 수 없음.
	 * 따라서 객체를 스트림을 통해 입출력하려면 바이트 배열로 변환하는 것이 필요함 이것을 직렬화라고 함.
	 */
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
