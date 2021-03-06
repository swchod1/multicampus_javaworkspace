package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class JSliderEx extends JFrame {
	
	
	
	JSlider red = new JSlider(JSlider.HORIZONTAL, 0, 255, 0); // HORIZONTAL 수평 스크롤
	JSlider green = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	
	JLabel rgb = new JLabel("RGB(0,0,0)", JLabel.CENTER);
	
	JPanel p1 = new JPanel(new BorderLayout());
	JPanel west = new JPanel(new GridLayout(0, 1)); // 0의 의미??
	JPanel cen = new JPanel(new GridLayout(0, 1));
	JPanel p2 = new JPanel();
	
	int r, g, b;
	
	
	public JSliderEx() {
		// TODO Auto-generated constructor stub
		
		super("JSlider");
		
		red.setMajorTickSpacing(50); // 큰 눈끔?? 단위
		red.setMinorTickSpacing(5); // 세부 눈끔?? 단위
		red.setPaintTicks(true); // 색을 따라서 칠함 true
		red.setPaintLabels(true); // 라베을 눈 끔에 따라 변경 true
		
		green.setMajorTickSpacing(50); 
		green.setMinorTickSpacing(5);
		green.setPaintTicks(true);
		green.setPaintLabels(true); 
		
		blue.setMajorTickSpacing(50); 
		blue.setMinorTickSpacing(5);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true); 
		
		JLabel rlabel = new JLabel("red");
		JLabel glabel = new JLabel("green");
		JLabel blabel = new JLabel("blue");
		
		rlabel.setForeground(Color.red);
		glabel.setForeground(Color.green);
		blabel.setForeground(Color.blue);
		
		rgb.setFont(new Font("돋움체", Font.BOLD, 30));
		
		// 레이아웃에 추가
		
		west.add(rlabel);
		west.add(glabel);
		west.add(blabel);
		
		cen.add(red);
		cen.add(green);
		cen.add(blue);
		
		p1.add("West", west);
		p1.add("Center", cen);
		
		add("North", rgb);
		add("South", p1);
		add("Center", p2);
		
		
		setBounds(300, 200, 400, 300); // 좌표값 (x, y) + 크기(w, h) //	Bounds ????	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		red.addChangeListener(new Sevent());
		green.addChangeListener(new Sevent());
		blue.addChangeListener(new Sevent());
		
		
	}
	
	class Sevent implements ChangeListener {
		
		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			JSlider source = (JSlider)e.getSource();
			
			if(e.getSource() == red) {
				r = source.getValue();
			}
			if(e.getSource() == green) {
				g = source.getValue();
			}
			if(e.getSource() == blue) {
				b = source.getValue();
			}
			
			
			p2.setBackground(new Color(r, g, b));
			rgb.setText("RGB("+ r + "," + g + "," + b + ")");
		}
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JSliderEx();

	}

}
