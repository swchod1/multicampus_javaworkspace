package com.chat;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;
 

public class MultiChatClient implements ActionListener, Runnable {
	
	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	// 로그인단
	// 로그인 패널
	private JPanel loginPanel;
	// 로그인 버튼
	private JButton loginButton;
	// 대화명 라벨
	private JLabel label1;
	// 대화명 입력 텍스트 필드
	private JTextField idInput;
	
	// 로그아웃단
	// 로그아웃 패널
	private JPanel logoutPanel;
	// 로그아웃 버튼
	private JButton logoutButton;
	// 대화명 출력 라벨 // ??
	private JLabel label2;
	
	// 입력단
	// 입력 패널
	private JPanel msgPanel;
	// 메시지 입력 텍스트 필드
	private JTextField msgInput;
	// 종료버튼
	private JButton exitButton;
	
	// 메인 윈도우
	private JFrame jframe;
	
	// 채팅 내용 출력창
	private JTextArea msgOut;
	
	// 카드 레이아웃 구성
	private Container tab;
	private CardLayout clayout;
	
	// 스레드
	private Thread thread;
	
	// 상태 플래그
	boolean status;
	
	public MultiChatClient(String ip) {
		// TODO Auto-generated constructor stub
		
		this.ip = ip;
		
		// 로그인 패널 구성
		loginPanel = new JPanel();
		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		// 입력
		idInput = new JTextField(15);
		// 로그인 버튼
		loginButton = new JButton("로그인");
		
		// 이벤트 등록
		loginButton.addActionListener(this);
		
		
		// 대화명 라벨
		label1 = new JLabel("대화명");
		
		
		// 패널 구성
		// 로그인 패널에 컴포넌트 등록
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		
		
		// 로그아웃 패널 구성
		logoutPanel = new JPanel();
		// 레이아웃 설정
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("로그아웃");
		
		// 이벤트 등록
		logoutButton.addActionListener(this);
		
		
		// 패널 구성
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		
		
		
		// 입력 패널 구성
		msgPanel = new JPanel();
		// 레이아웃 설정
		msgPanel.setLayout(new BorderLayout());
		
		msgInput = new JTextField(30);
		
		// 이벤트 등록
		msgInput.addActionListener(this);
		
		// 종료버튼 이벤트
		exitButton = new JButton("종료");
		exitButton.addActionListener(this);
		
		// 입력 패널 구성
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);
		
		
		// 로그인 / 로그아웃 패널 선택을 위한 카드 레이아웃 패널 구성
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");
		
		
		// 메인 프레임 구성
		jframe = new JFrame("멀티 채팅 프로그램");
		// 메시지 출력
		msgOut = new JTextArea("", 10, 30);
		// 출력 창의 내용을 수정하지 못하게 설정
		msgOut.setEditable(false);
		
		// 수직 스크롤 바는 항상 나타내고
		// 수평 스크롤 바는 필요할 때만 나타나게 함
		
		JScrollPane jsp = new JScrollPane(msgOut,
				// 수직은 항상
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				// 가로는 필요할 때만
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);
		
		// 로그인 패널을 우선적으로 보여줌
		clayout.show(tab, "login");
		
		// 프레임 자동 크기 설정
		jframe.pack();
		// 프레임 크기 조정 불가설정을 false로
		jframe.setResizable(false);
		// 프레임 보여줌
		jframe.setVisible(true);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void connectServer() {
		try {
			
			// 소켓 생성
			socket = new Socket(ip, 7000);
			System.out.println("[Client]Server 연결");
			
			// 입출력 스트림 생성
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(), true);
			
			// 서버에 로그인 메시지 전달
			outMsg.println(id + "/" + "login");
			
			// 메시지 수신을 위한 스레드 생성
			thread = new Thread(this);
			
			thread.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("[MultiChatClinet]connectServer() Exception 발생");
			
		}
	} // end connectServer()

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		// 수신메시지를 처리하는 변수 선언
		String msg;
		String[] rmsg;
		
		status = true;
		
		while(status) {
			
			try {
				
				// 메시지 수신과 파싱
				msg = inMsg.readLine();
				rmsg = msg.split("/");
				
				// JTextArea 에 수신한 메시지 추가
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");
				
				// 커서를 현재 대화 메시지에 표시함
				msgOut.setCaretPosition(msgOut.getDocument().getLength());
				
			} catch (IOException io) {
				// TODO: handle exception
				
				status = false;
				
			}		
			
		} //end while
		
		System.out.println("[MultiChatClient]" + thread.getName() + "종료");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object obj = e.getSource();
		
		// 종료 버튼 이벤트
		if(obj == exitButton) {
			System.exit(0);
		} else if(obj == loginButton) {
			id= idInput.getText();
			label2.setText("대화명 : " + id);
			clayout.show(tab, "logout");
			connectServer();
		} else if(obj == logoutButton) {
			// 로그 아웃 메시지 전송
			outMsg.println(id + "/" + "logout");
			// 대화창 클리어
			msgOut.setText("");
			
			// 로그인 패널로 전환
			clayout.show(tab, "login");
			outMsg.close();
			
			// 예외 처리
			try {
				inMsg.close();
				socket.close();
			} catch (IOException io) {
				// TODO: handle exception
				io.printStackTrace();
			}
			
			status = false;
			
		} else if(obj == msgInput) {
			// 메시지 전송
			
			outMsg.println(id + "/" + msgInput.getText());
			
			msgInput.setText("");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MultiChatClient("70.12.112.138");

	}

}
