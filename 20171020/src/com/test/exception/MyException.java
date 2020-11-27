package com.test.exception;

public class MyException extends Exception {
	
	public MyException() {
		super("내가 만든 익셉션");
	}
	
	public MyException(String message) {
		super(message);
	}
}






