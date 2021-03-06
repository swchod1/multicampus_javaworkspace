package com.swingex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class JProgressBarEx extends JFrame implements Runnable, ActionListener {
	
	private JProgressBar jpb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100); // 방향, 시작, 끝
	
	private JButton jbt = new JButton("시작");
	private JButton jbt1 = new JButton("정지");
	
	
	public JProgressBarEx() {
		// TODO Auto-generated constructor stub
		
		super("프로그레스바");
		
		Container con = this.getContentPane();
		
		con.setLayout(new BorderLayout());
		con.add("North", new JLabel("This is JProgressBar......"));
		con.add("Center", jpb);
		jpb.setStringPainted(true); // 진행도 만큼 칠함
		jpb.setString("0%"); // 진행도 표기
		
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		jp.add(jbt);
		jp.add(jbt1);
		
		jbt.addActionListener(this);
		jbt1.addActionListener(this);
		
		
		con.add("South", jp);
		
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	private boolean bb = true;
	private static int ii;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(ii == 100) {
			ii = 0;
		}
		
		for(int i = ii; i <=100; i++) {
			if(!bb) {
				break;
			}
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException ie) {
				// TODO: handle exception
				
				ie.printStackTrace();
				
			}
			
			jpb.setValue(i);
			ii = i;
			jpb.setString(i + "%");
			
		}
		
		// 시작 정지 누를 때 마다 교대??
		
        jbt.setEnabled(true); 
		jbt1.setEnabled(false);
		

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource() == jbt) {
			
			bb = true;
			new Thread(this).start();
			
			jbt.setEnabled(false);
			jbt1.setEnabled(true);

		} else if (e.getSource() == jbt1) {

			bb = false;

			jbt.setEnabled(true);
			jbt1.setEnabled(false);

		}
		
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JProgressBarEx();

	}

}
