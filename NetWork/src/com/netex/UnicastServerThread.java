package com.netex;

import java.io.*;

import java.net.*;

public class UnicastServerThread extends Thread {
	
	// 서버로 부터 전달된 Socket(클라이언트와 연결된)을 저장함.
	
	Socket socket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	// BufferedReader keyboard = null;
	
	// 객체 생성시 Socket을 전달 받아서 멤버변수에 저장하는 생성자 함수.
	
	public UnicastServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		
		this.socket = socket;
		
	}
	
	@Override
	public void run() { 
		// TODO Auto-generated method stub
		
		try {
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 입력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 출력 스트림
			
			// 스트림이 생성된 후 클라이언트와 송수신 대화 시작
			
			while(true) {
				
				
				// 서버는 클라이언트가 전달한 메시지를 수신함
				String msg = br.readLine();
				// System.out.println(msg);
				
				// 메시지를 확인하고 클라이언트로 메시지를 전송함
				bw.write(msg + "\n");
				bw.flush();
				// 메시지를 전달하고 버퍼를 비움
				
				
				
				
			}
			
			
			
		} catch (IOException e) { 
			// TODO: handle exception
			
			// 클라이언트와 연결이 끊어진 경우 발생하는 예외처리
			
			InetAddress ip = socket.getInetAddress();
			String address = ip.getHostAddress();
			
			System.out.println("[" + address+ "]와의 연결이 끊어졌습니다.");
			System.out.println(" 다시 접속하여 주시기 바랍니다.");
	
			
		} catch (NullPointerException e) {
			
		}
		
		
		
	}

}
