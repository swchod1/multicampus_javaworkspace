package com.excp;

public interface Authenticator {
	
	public void inputFormat(String str) throws AuthenticatorException;
	public void number(String str) throws AuthenticatorException;
	public void operator(char ch) throws AuthenticatorException;

}
