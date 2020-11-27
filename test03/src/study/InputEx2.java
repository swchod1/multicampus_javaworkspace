package study;

import java.io.*;


public class InputEx2 {

	public static void main(String[] args) throws IOException {

		
		
		String name;
		String age;
		String addr;
		String tel;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//br.readLine(); // 버퍼를 읽어들인다.
		
		System.out.println("이름: ");
		name = br.readLine();
		System.out.println("나이: ");
		age = br.readLine();
		System.out.println("주소: ");
		addr = br.readLine();
		System.out.println("전화번호: ");
		tel = br.readLine();
		
		System.out.println();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + addr);
		System.out.println("전번: " + tel);
	}

	
}
