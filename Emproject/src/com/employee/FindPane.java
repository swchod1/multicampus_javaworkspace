package com.employee;

/*
사원 정보조회를 위한 UI와 검색 처리를 위한 FindPane 클래스 구성

생성자, actionPerformed()
*/


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class FindPane extends JPanel implements ActionListener {
	
	// 멤버 필드 구성
	
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb; // ok
	private JButton rsb; // 리셋
	
	String[] caption = {"사번", "이름", "직책", "부서", "메일"};
	
	
	public FindPane() {
		// TODO Auto-generated constructor stub
		
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size = caption.length;
		
		int i;
		for(i = 0; i < size; i++) {
			
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i] = new JPanel();
			
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			
			add(jp[i]);
			
			// 텍스트 필드 편집 불가
			tf[i].setEditable(false);
			
			// 단 사번과 이름으로 검색해야 입력 가능한 상태로 만듬
			if(i == 0 || i == 1) { // 0, 1은 인덱스
				tf[i].setEditable(true);
			}	
			
			
		}
		
		jp[size] = new JPanel();
		
		okb = new JButton("사원 정보 조회");
		okb.addActionListener(this);
		
		rsb = new JButton("다시 작성");
		rsb.addActionListener(this);
		
		jp[size].add(okb);
		jp[size].add(rsb);
		
		add(jp[size]);
		
		
	}	

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		
		// 이벤트가 발생한 버튼의 캡션 값을 가져옴
		String ae_type = ae.getActionCommand();
		// 검색한 사원 정보를 저장할 VO 객체 생성
		EmployeeVO evo = null;
		// 데이터베이스 처리를 위한 DAO 객체 생성
		EmployeeDAO edvo = null;
		
		
		if(ae_type.equals(okb.getText())) { // 사원 정보 조회 버튼이 클릭되었을 경우
			
			try {
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if(!sno.equals("") && !sname.equals("")) {
					
					// 사번과 이름 입력
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
					
				} else if(!sno.equals("") && sname.equals("")) {
					
					// 사번만 입력
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
					
				} else if(sno.equals("") && !sname.equals("")) {
					
					// 이름만 입력
					evo = edvo.getEmployeeName(sname);
				} 				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			// 해당 사원이 존재하지 않는다면 텍스트 필드 초기화
			
			if(evo != null) {
				
				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobGrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail() + "");
				
			} else {
				
				JOptionPane.showMessageDialog(this, "검색 실패");
				
			}
			
			
		} else if (ae_type.equals(rsb.getText())) {
			// 다시 작성 버튼을 클릭했을 경우
			// 텍스트 필드 초기화
			
			int size = caption.length;
			for (int i = 0; i < size; i++) {
				tf[i].setText("");
			}
			
		}
		
		

	}

}
