package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImagePrint extends JComponent implements Runnable { //JComponent ???
	
	private Image image;
	private int x, y, w, h;
	private MediaTracker mt = new MediaTracker(this);
	private Graphics graphics;
	
	
	public ImagePrint() {
		// TODO Auto-generated constructor stub
		
		image = Toolkit.getDefaultToolkit().getImage("src/img/icon005.jpg");
		
		mt.addImage(image, 0); // 0 ? 이미가 있는지 없는지???  // mt 트랙???
		w = image.getWidth(this);
		h = image.getHeight(this);
		
		new Thread(this).start();
		
	}
	
	public Graphics returnInfo() {
		
		return graphics;
		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			mt.checkID(0, true); // ? 이미지가 있는지 없는지???
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				// TODO: handle exception
				ie.printStackTrace();
			}
			
			repaint();
			
		}

	} // end run
	
	
	@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
		
		if(mt.checkID(0)) {
			
			g.drawImage(image, x, y, w, h, 0, 0,
					image.getWidth(null), image.getHeight(null), this);
			
		} else {
			
			g.drawString("Not yet!!!!!", 100, 100);
			
		}

		graphics = g;

	}
	
	public void setting(int x, int y, int w, int h) {
		
		this.x = x;
		this.y = y; 
		this.w = w; 
		this.h = h; 
		
	}
	
	public Image returnImage() {
		return image;
	}
	
	
	
	
	

}
