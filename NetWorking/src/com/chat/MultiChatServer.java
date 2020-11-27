package com.chat;

// 멀티 챗에 필요한 임포트 세부목록
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {
	
	// 서버소켓과 클라이언트 연결 소켓
	private ServerSocket ss =null;
	private Socket s = null;
	
	
	// 연결된 클라이언트 스레드를 관리하는 ArrayList
	ArrayList<ChatThread> chatlist = new ArrayList<ChatThread>();
	
	
	// 멜티채팅 메인 구성
	
	public void start() {
		// TODO Auto-generated method stub
		
		try {
			
			// 서버 소켓 생성
			ss = new ServerSocket(5000);
			System.out.println("server start");
			
			// 무한루프를 돌면서 클라이언트 연결을 기다림
			while(true) {
				
				s = ss.accept();
				// 연결이 되면
				
				
				// 연결된 클라이언트에서 스래드 클래스 생성함
				ChatThread chat = new ChatThread();
				
				
				// 클라이언트를 리스트에 추가
				chatlist.add(chat);
				
				// 스레드 시작
				chat.start();
				
			} // end while
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("[MultiChatServer]start() Exception 발생");
			
		}

	}
	
	
	// 연결된 클라이언트에게 메시지 중계함

	void msgSendAll(String msg) {

		for (ChatThread ct : chatlist) {
			
			ct.outMsg.println(msg);

		}

	}

	// 각 클라이언트 관리를 위한 스레드 클래스
	class ChatThread extends Thread {

		// 수신메시지와 피시메시지처리를 위한 변수 선언
		String msg;
		String[] rmsg;

		// 입출력 스트림 생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			// 스레드의 시작 여부
			boolean status = true; 
			
			System.out.println("ChatThread Start");
			
			try {
				// 입출력 스트림 생성
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				outMsg = new PrintWriter(s.getOutputStream(), true); // true 플래쉬 기능 수행 // 버퍼지움
				
				// status 상태 정보가 true면 루프를 돌면서 사용자에게서 수신한 메시지를 처리함
				while(status) {
					
					// 수신된 메시지를 msg 변수에 저장함.
					msg = inMsg.readLine();
					
					// 읽어들인 메시지를 파싱함. 구분자를 기준으로함.
					// 구분자는 '/' 구분자를 기준으로 메시지를 문자열 배열로 파싱함
					// 파싱 ??? 숫자를 문자로 문자를 숫자로 ???
					
					rmsg = msg.split("/");
					
					// 파싱된 문자열 배열의 두번째 인덱스 값에 따라 처리됨 ???
					
					
					if(rmsg[1].equals("logout")) { // 로그아웃 메시지 일 때 
						
						chatlist.remove(this);
						msgSendAll("server/" + rmsg[0] + "님이 종료하셨습니다.");
						
						// 해당 클라이언트 스레드 종료로 status를 false로 설정
						
						status = false;
						
					} else if(rmsg[1].equals("login")) { // 로그인 메시지 일 때
						
						msgSendAll("server/" + rmsg[0] + "님이 로그인 하셨습니다.");
						
						
					} else { // 그 밖의 메시지 일 때
						
						msgSendAll(msg);
						
					}
					
				} // end while
				
				// 반복문인 루프를 벗어나면 클라이언트 연결이 종료되므로 인터럽트가 발생됨
				
				this.interrupt();
				System.out.println("##" + this.getName() + "Stop");
				
				
			} catch (IOException r) {
				// TODO: handle exception
				chatlist.remove(this);
				System.out.println("[ChatThread]run() IOException 발생");
				
			}
			
		} // end run

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiChatServer server = new MultiChatServer();
		server.start();
		
	}

}
