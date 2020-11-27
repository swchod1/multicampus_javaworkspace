package exexex;

public class Ex1 {
	
	// 대문자 ---> 소문자
	
	public char lower(char ch) {
		
		if(ch >= 'A' && ch <= 'Z') {
			return (char)(ch+32);
		}
		
		return ch;
	}
	
	// 소문자 ---> 대문자
	public char upper(char ch) {
		
		if(ch >= 'a' && ch <= 'z') {
			return (char)(ch-32);
		}
		
		return ch;
	}
	
}
