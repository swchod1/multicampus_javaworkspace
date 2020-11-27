package com.awtex;

import java.awt.*;

public class MenuEx extends Frame {
	
	// 
	MenuBar mb = new MenuBar();
		
	// 메뉴 생성
	private Menu file = new Menu("파일");
	private Menu edit = new Menu("도구");
	private Menu view = new Menu("보구");
	private Menu help = new Menu("도움말");
	
	// 바로 실행
	private MenuItem fnew = new MenuItem("새 파일");
	private MenuItem fopen = new MenuItem("파일 열기");
	private MenuItem fsave = new MenuItem("파일 저장");
	private MenuItem fsaveas = new MenuItem("다른 이름으로 저장");
	private MenuItem fexit = new MenuItem("나가기");
	
	// 메뉴 안에 메뉴
	private Menu ecolor = new Menu("색상");
	private Menu esize = new Menu("크기");
	
	private CheckboxMenuItem ecred = new CheckboxMenuItem("빨강");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("초록");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("파랑");
	
	private CheckboxMenuItem ec10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem ec20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem ec30 = new CheckboxMenuItem("30");
	
	
	
	
	
	
	public MenuEx() {
		// TODO Auto-generated constructor stub
		
		super("메뉴 만들기");
		
		setMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		ecolor.add(ecred);
		ecolor.add(ecgreen);
		ecolor.add(ecblue);
		
		esize.add(ec10);
		esize.add(ec20);
		esize.add(ec30);
		
		edit.add(ecolor); 
		edit.addSeparator(); // 분리선
		edit.add(esize);
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.add(fsaveas);
		file.addSeparator();
		file.add(fexit);
		
		// 레이아웃 설정
		
		setLayout(new BorderLayout());
		
		add("North", new Label("수고하삼....",Label.CENTER));
		
		add("Center", new TextArea());
		
		// 밑에 버튼 두개
		Panel p = new Panel(new GridLayout(1, 2));
		
		p.add(new Button("확인"));
		p.add(new Button("취소"));
		
		add("South", p);
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MenuEx();

	}

}
