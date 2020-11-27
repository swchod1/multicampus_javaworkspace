package com.homework180418prac;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

import javax.swing.JFrame;



public class PersonalInformation extends JFrame  implements ActionListener , ItemListener  {
	
	// 
	
	// private JDialog d = new JDialog(this, "정보 확인", false);
	
	private Label l1 = new Label("아이디 입력 :", Label.CENTER);
	private Label l2 = new Label("비밀번호 입력 :", Label.CENTER);
	private Label l3 = new Label("비밀번호 재입역 :", Label.CENTER);
	Label l6 = new Label();
	
	private TextField tf1 = new TextField(10);
	private TextField tf2 = new TextField(10);
	private TextField tf3 = new TextField(10);
	
	private CheckboxGroup cg = new CheckboxGroup();
	
	private Checkbox man = new Checkbox("남자", cg, true);
	private Checkbox woman = new Checkbox("여자", cg, false);
	
	private JButton bt = new JButton("확인");
	
	
	public PersonalInformation() {
		// TODO Auto-generated constructor stub
		
		super("개인 정보");

		Container con = this.getContentPane();

		con.setLayout(new GridLayout(4, 1));
		
		bt.addActionListener(this);
		man.addItemListener(this);
		woman.addItemListener(this);
		
		
		Panel p1 = new Panel(new GridLayout(1, 2));
		
		p1.add(l1);
		p1.add(tf1);
		
		tf2.setEchoChar('*');
		tf3.setEchoChar('*');
		
		
		
		/*
		man.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l6 = new Label("Man");
				d.add(l6);
			}
		});
		
		woman.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l6 = new Label("Woman");
				d.add(l6);
				
			}
		});
		*/
		
			
		Panel p2 = new Panel(new GridLayout(1, 2));
		
		p2.add(l2);
		p2.add(tf2);
		
		Panel p3 = new Panel(new GridLayout(1, 2));
		
		p3.add(l3);
		p3.add(tf3);
		
		Panel p4 = new Panel(new FlowLayout());
		
		p4.add(man);
		p4.add(woman);
		p4.add(bt);
		
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add("Center", p4);

		setSize(250,130);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		// l6.setText(cg.getSelectedCheckbox().getLabel());

		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JDialog d = new JDialog(this, "정보 확인", false);
		if (e.getSource() == bt) {
			
			d.setLayout(new FlowLayout(FlowLayout.CENTER));

			String s1 = tf1.getText();
			String s2 = tf2.getText();
			// String s3 = tf3.getText();
			
			Label l4 = new Label(s1);
			Label l5 = new Label(s2);
			
			if(cg.getSelectedCheckbox().getLabel().equals("여자")) {
				l6.setText("Woman");
			} else {
				l6.setText("Man");
			}
			
			// l6.setText(cg.getSelectedCheckbox().getLabel());
			
			d.add(l4);
			d.add(l5);
			d.add(l6);
			
			
			
		
			
			d.setSize(250,130);
			d.setResizable(false);
			d.setVisible(true);
			d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


		}

	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new PersonalInformation();

	}

}
