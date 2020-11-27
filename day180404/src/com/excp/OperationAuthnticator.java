package com.excp;

public class OperationAuthnticator implements Authenticator {

	@Override
	public void inputFormat(String str) throws AuthenticatorException {
		// TODO Auto-generated method stub

		String temp[] = str.split(",");
		if (temp.length != 2) {
			throw new AuthenticatorException("숫자입력 형식 오류 : " + str); //// ?????????
		}

	}

	@Override
	public void number(String str) throws AuthenticatorException {
		// TODO Auto-generated method stub

		try {
			if (str.indexOf(".") != -1) {
				double num = Double.parseDouble(str);
			} else {
				int num = Integer.parseInt(str);
			}
		} catch (NumberFormatException ne) {
			// TODO: handle exception

			throw new AuthenticatorException("숫자로 변환 불가능 : " + str);

		}
	}

	@Override
	public void operator(char ch) throws AuthenticatorException {
		// TODO Auto-generated method stub

		switch (ch) {
		case '+':

		case '-':

		case '*':

		case '/':

			return;

		default:
			throw new AuthenticatorException("연산자 입력 오류 : " + ch);

		}

	}

}
