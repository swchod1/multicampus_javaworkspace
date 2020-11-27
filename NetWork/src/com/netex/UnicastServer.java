package com.netex;

import java.io.*;

import java.net.*;

// 일대일 통신

public class UnicastServer {
	
	
	
	
	public UnicastServer() {
		// TODO Auto-generated constructor stub
		
		ServerSocket server = null;
		
		try {
			// 서버 소켓 생성
			
			server = new ServerSocket(4600);
			
		} catch (IOException io) {
			// TODO: handle exception
			System.out.println("해당 포트가 사용중입니다.");
			System.exit(0);
		}
		
		try {
			while(true) {
				System.out.println("Server Ready...");
				// 클라이언트이 연결 요청이 접수되면 해당 클라이언트와 통신할 Socket을 생성함
				Socket socket = server.accept();
				
				// 클라이언트와 메시지를 송수신 할 UnicastServerThread 생성
				// 클라이언트와 접속을 유지하기 위해 스레드 생성
				
				// UnicastServerThread 스레드 생성시 Socket을 전달함
				UnicastServerThread thread = new UnicastServerThread(socket);
				
				
				// UnicastServerThread의 start()를 호출하여 스레드를 시작함
				thread.start();
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new UnicastServer();

	}

}
