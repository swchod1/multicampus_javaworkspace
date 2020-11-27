package com.employee;
/*
화면 레이아웃
사용자로부터 입력을 받거나 처리된 결과를 보여주기 위한 어플리케이션 기능을 구현함.
사용자가 쉽게 사용할 수 있도록 UI(User Interface) 컴포넌트를 배열하고 네비게이션(Navigation) 을 활용함

AddPane(), actionPerformed() 메소드를 구현

AddPane() : 사원정보 입력 탭 객체는 정보를 입력 받기 위한 텍스트 필드 배열, 저장하기 버튼, 
다시 쓰기 버튼을 구성함.

actionPerformed() : 저장하기 버튼을 누르면 데이터베이스에 저장, 
다시 쓰기 버튼 을 누르면 텍스트 필드를 초기화함.



*/


import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;



// 패널로 사원 정보 입력을 위한 클래스 구성
public class AddPane extends JPanel implements ActionListener, ItemListener {
	
	// Swing 멤버 구성
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb; // ok
	private JButton rsb; // 리셋
	private int department = 10;
	
	// 입력 받을 항목  제목
	String[] caption = {"이름", "직책", "메일", "부서"};
	
	public AddPane() {
		// TODO Auto-generated constructor stub
		
		setLayout(new GridLayout(6, 1));
		EtchedBorder eb = new EtchedBorder(); // EtchedBorder??
		
		// 입력 받을 개수
		int size = caption.length;
		
		// 텍스트 필드와 레이블을 패널에 묶어서 AddPane에 붙임
		int i;
		for(i = 0; i < size-1; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
		}
		
		jp[i] = new JPanel();
		jl[i] = new JLabel(caption[i]);
		jp[i].add(jl[i]);
		add(jp[i]);
		
		JComboBox combo = new JComboBox();
		
		combo.addItem("부서번호를 선택하세요");
		
		for(int c = 1; c <= 5; c++) { // 부서번호 10~50 번 까지 10, 20, 30 ...
			
			combo.addItem(c*10); // 부서번호 추가함
			
			
			
		}
		
		jp[i].add(combo);
		
		combo.addItemListener(this);
		
		
		jp[size] = new JPanel();
		okb = new JButton("저장 하기");
		okb.addActionListener(this);
		rsb = new JButton("다시 작성");
		rsb.addActionListener(this);
		
		jp[size].add(okb);
		jp[size].add(rsb);
		
		add(jp[size]);
		
	}

	
	// 콤보 박스에 대한 이벤트 처리 
	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		
		if(ie.getStateChange() == ie.SELECTED) {
			department = Integer.parseInt(ie.getItem().toString());
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		
		if(ae_type.equals(okb.getText())) {
			
			// 저장하기 버튼이 클릭되었을 경우
			try {
				
				evo = new EmployeeVO(0, tf[0].getText(), tf[1].getText(),
						department, tf[2].getText());
				
				// 번호, 이름, 직책, 부서번호, 메일 
				
				// 입력받은 사원정보를 데이터베이스에 추가하기 위한 DAO 객체를 생성
				
				edvo = new EmployeeDAO();
				edvo.getEmployeeregiste(evo);
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();				
			} 
			
			if(edvo != null) {
				JOptionPane.showMessageDialog(this, tf[0].getText() + "님이 성공적으로 추가 되었습니다.");
			}
			
			
		} else if(ae_type.equals(rsb.getText())) {
			
			int size = caption.length;
			
			// 필드를 초기화
			for(int i = 0; i < size-1; i++) {
				tf[i].setText("");
			}
			
		}

	}
	
}
