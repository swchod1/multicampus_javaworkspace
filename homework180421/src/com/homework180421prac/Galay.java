package com.homework180421prac;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Galay extends JFrame implements ActionListener {
	
	
	JLabel l1 = new JLabel("수입   ");
	JLabel l2 = new JLabel("금액");
	JLabel l3 = new JLabel("MEMO");
	JLabel l4 = new JLabel("지출   ");
	JLabel l5 = new JLabel("금액");
	JLabel l6 = new JLabel("MEMO");
	
	
	JTextField tf1= new JTextField(9);
	JTextField tf2= new JTextField(20);
	JTextField tf3= new JTextField(9);
	JTextField tf4= new JTextField(20);
	
	
	JComboBox combo1;
	JComboBox combo2 = new JComboBox();
	
	
	JButton jb1 = new JButton("INCOME");
	JButton jb2 = new JButton("EXPENSE");
		

	
	JTextArea ta1 = new JTextArea();
	JScrollPane js1 = new JScrollPane(ta1);
	JTextArea ta2 = new JTextArea();
	JScrollPane js2 = new JScrollPane(ta2);
	
	
	long won = 0;
	JLabel jl = new JLabel("현재 잔액 : " + won + "원", JLabel.CENTER);

	
	
	JMenuBar mb = new JMenuBar();

	JMenu m1 = new JMenu("기능(F)");
	JMenu m2 = new JMenu("계산기(C)");
	JMenu m3 = new JMenu("도움말(H)");

	JMenuItem m11 = new JMenuItem("저장하기(S)");
	JMenuItem m12 = new JMenuItem("불러오기(L)");
	JMenuItem m21 = new JMenuItem("실행하기(0)");
	JMenuItem m31 = new JMenuItem("정보(I)");
	
	
	public Galay() {
		// TODO Auto-generated constructor stub
		
		super("태희누나 가계부");

		Container con = this.getContentPane();
		con.setLayout(new GridLayout(1, 2));	
		
		JPanel p1 = new JPanel(new GridLayout(2, 1, 10, 10));
		
		Icon icon = new ImageIcon("src/img/icon1001.jpg");
		
		JLabel image = new JLabel(icon);
		
		JPanel p11 = new JPanel(new GridLayout(6, 1));
		
		JPanel p[] = new JPanel[6];
		
		for(int i = 0; i < p.length; i++) {
			p[i] = new JPanel(new FlowLayout());
		}
		
		String[] in = { "봉급", "주식", "이자", "기타수입" };
		combo1 = new JComboBox(in);

		DefaultComboBoxModel cmodel = new DefaultComboBoxModel();
		cmodel.addElement("문화생활");
		cmodel.addElement("식비");
		cmodel.addElement("주거비");
		cmodel.addElement("교통비");
		cmodel.addElement("전화요금");
		cmodel.addElement("기타지출");
		
		combo2.setModel(cmodel);
		
		
		p[0].add(l1); p[0].add(combo1); p[0].add(l2); p[0].add(tf1);
		p[1].add(l3); p[1].add(tf2);
		p[2].add(l4); p[2].add(combo2); p[2].add(l5); p[2].add(tf3);
		p[3].add(l6); p[3].add(tf4);
		p[5].add(jb1); p[5].add(jb2);

		for (int i = 0; i < p.length; i++) {
			p11.add(p[i]);
		}

		p1.add(image);
		p1.add(p11);
		
		Panel p2 = new Panel(new BorderLayout());
		
		Panel p22 = new Panel(new GridLayout(1, 2, 5, 5));
		
		p22.add(js1);
		p22.add(js2);
		
		p2.add("Center" ,p22);
		p2.add("South", jl);
		
		jl.setFont(new Font("돋음체", Font.BOLD, 13));
		// p2.add("South", new Label("현재 잔액 : " + s + "원", Label.CENTER));
		// p2.add("South", new Label("현재 잔액 : " + won + "원", Label.CENTER));
		
		con.add(p1);
		con.add(p2);
		/*
		jb1.addActionListener(new JBAct(jb1, combo1, tf1, tf2, ta1, jl, won));
		jb2.addActionListener(new JBAct(jb2, combo2, tf3, tf4, ta2, jl, won));
		*/
		

		
		setJMenuBar(mb);

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);

		m1.add(m11);
		m1.add(m12);
		m2.add(m21);
		m3.add(m31);
		
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		
		m11.addActionListener(this);
		m12.addActionListener(this);
		m21.addActionListener(this);
		m31.addActionListener(this);
		
		setSize(800, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ta1.setEditable(false);
		ta2.setEditable(false);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == jb1) {
			
			try {
				
				won += Long.parseLong(tf1.getText());
				
			} catch (NumberFormatException nfe) {
				// TODO: handle exception			
					JOptionPane.showMessageDialog(this, "입력형식에 맞지 않습니다.", "오류", JOptionPane.ERROR_MESSAGE);
					return;
			}
			
			ta1.append("\n" + combo1.getSelectedItem().toString() + "\t" + tf1.getText() + "원\n"
					+ tf2.getText() + "\n");
			//
			tf1.setText("");
			tf2.setText("");
			//
		} else if (e.getSource() == jb2) {
			
			try {
				if(won - Long.parseLong(tf3.getText()) < 0) {
					JOptionPane.showMessageDialog(this, "입력범위를 초과하였습니다.", "오류", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				won -= Long.parseLong(tf3.getText());
			} catch (NumberFormatException nfe) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this, "입력형식에 맞지 않습니다.", "오류", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			ta2.append(combo2.getSelectedItem().toString() + "\t" + tf3.getText() + "원\n"
					+ tf4.getText() + "\n\n");
			//
			tf3.setText("");
			tf4.setText("");
			//
		}
		
		jl.setText("현재 잔액 : " + won + "원");
		
		
		
		if(e.getSource() == m11) {
			new GaSave(ta1, ta2, jl);
		}

		if (e.getSource() == m12) {
			new GaLoad();
		}

		if (e.getSource() == m21) {
			// new GaCal4();
		}

		if (e.getSource() == m31) {
			new GaHelp();
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Galay();
		

	}

}
