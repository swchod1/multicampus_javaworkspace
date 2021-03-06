package com.swingex;

import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

public class JPMInputStreamEx extends JFrame implements ActionListener, Runnable {
	
	private JTextArea jta = new JTextArea();
	private JScrollPane jsp = new JScrollPane(jta); // Scrollpane ??
	private JButton jbt = new JButton("로딩");
	private JButton jbt1 = new JButton("종료");
	private JFileChooser jfc = new JFileChooser();
	// java.io
	private File f;
	private ProgressMonitorInputStream pmi;
	private BufferedInputStream bis;
	
	
	
	public JPMInputStreamEx() {
		// TODO Auto-generated constructor stub
		
		super("파일 로딩");
		
		setForm();
		jbt.addActionListener(this);
		jbt1.addActionListener(this);
		
	}
	
	public void setForm() {
		
		add("Center", jsp);
		// add("Center", jta);
		
		jsp.setBorder(new TitledBorder("Loading......................"));
		// jta.setBorder(new TitledBorder("Loading......................"));
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p.add(jbt);
		p.add(jbt1);
		
		add("South", p);
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize(); // 배열??? 
		// 모니터 화면 스크린 사이즈에 맞게
		
		setLocation(d.width/2-150, d.height/2-100);
		// setLocation(150, 100);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ProgressMonitor pm = pmi.getProgressMonitor();
		pm.setNote("Started");
		
		int imsi = 0;
		int kk = 0;
		
		jta.setText("");
		
		long size = f.length();
		
		jta.setCursor(new Cursor(Cursor.WAIT_CURSOR)); // 커서 깜빡이이기
		
		try {
			while((imsi = pmi.read()) != -1) {
				
				pm.setNote((int)(kk/(float)size*100)+"%");
				pm.setProgress(kk++);
				
				jta.append(""+(char)imsi);
				try {
					Thread.sleep(10);
				} catch (InterruptedException ie) {
					// TODO: handle exception
					ie.printStackTrace();
				}
				
			}// end while
			
		} catch (IOException io) {
			// TODO: handle exception
			io.printStackTrace();
		}
		
		pm.close();
		jta.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // 커서를 본위치로

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == jbt) {
			jfc.showOpenDialog(this); // 다이얼 로그 열기
			f = jfc.getSelectedFile();
			
			if(f == null) {
				return;
			}
			
			try {
				pmi = new ProgressMonitorInputStream(this, "Loading" + f.getName() + "...",
						new FileInputStream(f));
			} catch (IOException ii) {
				// TODO: handle exception
				ii.printStackTrace();;
			}
			
			new Thread(this).start();
			
		} else if(e.getSource() == jbt1) {
			
			System.exit(0);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JPMInputStreamEx();

	}

}
