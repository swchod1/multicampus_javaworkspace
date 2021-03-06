package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPopupEx extends JFrame implements MouseListener {
	
	private JTextField jtf = new JTextField("None");
	
	private JPopupMenu jpm = new JPopupMenu();
	
	private JMenuItem jmi = new JMenuItem("Copy");
	private JMenuItem jmi1 = new JMenuItem("Cut");
	private JMenuItem jmi2 = new JMenuItem("Paste");
	
	
	
	public JPopupEx() {
		// TODO Auto-generated constructor stub
		
		super("팝업창");
		
		jpm.add(jmi);
		jmi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				jtf.setText("Copy");
				// System.out.println("Copy");
				
			}
		});
		
		
		jpm.add(jmi1);
		jmi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				jtf.setText("Cut");
				
			}
		});
		
		jpm.add(new JSeparator());
		
		
		jpm.add(jmi2);
		jmi2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				jtf.setText("Paste");
				
			}
		});
		
		
		Container con = this.getContentPane();
		
		con.setLayout(new BorderLayout());
		
		con.add("North", jtf);
		
		this.addMouseListener(this);
		
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtf.setEditable(false);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == this) {
			
			if(e.isPopupTrigger()) { // 팝업인지 아닌지
				jpm.show(e.getComponent(), e.getX(), e.getY());
			}
			
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JPopupEx();

	}

}
