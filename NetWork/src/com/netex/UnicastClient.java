package com.netex;

import java.io.*;

import java.net.*;

// 클라이언트가 입력한 메시지를 서버에 전송
public class UnicastClient {
	
	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;
	
	
	public UnicastClient() {
		// TODO Auto-generated constructor stub
		
		try {
			// 소켓 생성
			socket = new Socket("localhost", 4600); // "서버주소"
			
					
		} catch (UnknownHostException e) {
			// TODO: handle exception
			
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
			
		} catch (IOException io) {
			
			System.out.println("서버와 연결할 수 없습니다.");
			System.exit(0);
			
		}
		
		
		try {
			// keyboard와 연결된 스트림 얻기
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			// socket으로부터 스트림 얻기
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 출력 스트림
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 입력 스트림
			
			// 서버와 메시지 주고받기를 함
			
			while(true) {
				// 키보드로 입력 내용 읽기 ??
				System.out.print("전송메시지 : ");
				String msg = keyboard.readLine();
				
				// 메시지 서버로 전송
				bw.write(msg + "\n");
				bw.flush();
				
				// 서버가 전송함 메시지 수신
				
				String getMsg = br.readLine();
				System.out.println("수신된 메시지 : " + getMsg);
				
			}
			
			
		} catch (IOException e) {
			// TODO: handle exception
			
			System.out.println("서버와 연결이 끊어졌습니다.");
			System.exit(0);
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new UnicastClient();

	}

}
