package com.employee;

/*
사원 전체를 보기 위한 TotalPane 클래스와 모델 객체

사원 전체를 보기 위해서는 JTable 클래스 사용 JTable에 출력할 데이터는 모델 객체로 설계함

클래스 명 : EmployModel 로 작성
*/




import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TotalPane extends JPanel {
	
	
	
	public TotalPane() {
		// TODO Auto-generated constructor stub
		
		JTable table = new JTable(new EmployModel());
		add(new JScrollPane(table));
		
	}
	
	
	
	

}
