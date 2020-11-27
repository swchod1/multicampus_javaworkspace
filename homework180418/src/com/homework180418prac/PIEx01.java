package com.homework180418prac;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class PIEx01 extends JFrame implements ActionListener {
	
// private JDialog d = new JDialog(this, "정보 확인", false);
	
	private 	JLabel l1 = new JLabel("아이디 입력 :", JLabel.CENTER);
	private JLabel l2 = new JLabel("비밀번호 입력 :", JLabel.CENTER);
	private JLabel l3 = new JLabel("비밀번호 재입역 :", JLabel.CENTER);

	private JLabel dl1 = new JLabel();
	private JLabel dl2 = new JLabel();
	private JLabel dl3 = new JLabel();
	
	private TextField tf1 = new TextField(10);
	private TextField tf2 = new TextField(10);
	private TextField tf3 = new TextField(10);
	
	private CheckboxGroup cg = new CheckboxGroup();
	
	private Checkbox man = new Checkbox("남자", cg, true);
	private Checkbox woman = new Checkbox("여자", cg, false);
	
	private JButton bt = new JButton("확인");
	
	
	
	
	public PIEx01() {
		// TODO Auto-generated constructor stub

		super("개인 정보");

		Container con = this.getContentPane();

		con.setLayout(new GridLayout(4, 1));
		
		
		Panel p1 = new Panel(new GridLayout(1, 2));

		p1.add(l1);
		p1.add(tf1);

		Panel p2 = new Panel(new GridLayout(1, 2));

		p2.add(l2);
		p2.add(tf2);

		Panel p3 = new Panel(new GridLayout(1, 2));

		p3.add(l3);
		p3.add(tf3);

		Panel p4 = new Panel(new FlowLayout(FlowLayout.CENTER));

		p4.add(man);
		p4.add(woman);
		p4.add(bt);

		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		
		
		
		bt.addActionListener(this);

		tf2.setEchoChar('*');
		tf3.setEchoChar('*');
	
		
		
		tf1.setFont(new Font("굴림체", Font.BOLD, 15));
		tf2.setFont(new Font("굴림체", Font.BOLD, 15));
		tf3.setFont(new Font("굴림체", Font.BOLD, 15));
		
		setSize(250, 150);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		

	}
	
	
	@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
		JDialog d = new JDialog(this, "정보 확인", false);
		if (e.getSource() == bt) {
			
			d.setLayout(new FlowLayout(FlowLayout.CENTER));

			dl1.setText(tf1.getText());
			dl2.setText(tf2.getText());

			
			if(cg.getSelectedCheckbox().getLabel().equals("여자")) {
				dl3.setText("Woman");
			} else {
				dl3.setText("Man");
			}
			
			d.add(dl1);
			d.add(dl2);
			d.add(dl3);
			
			
			d.setSize(250, 130);
			d.setResizable(false);
			d.setVisible(true);
			d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PIEx01();

	}

}
