package com.assign;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubDialog extends JDialog {

	JLabel sjb1;
	JLabel sjb2;
	JLabel sjb3;

	 public SubDialog(JLabel jb1, JLabel jb2, JLabel jb3) {

		 
		setTitle("정보 확인");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		sjb1 = jb1;
		sjb2 = jb2;
		sjb3 = jb3;
		
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.CENTER, 7, 5));
		
		container.add(sjb1);
		container.add(sjb2);
		container.add(sjb3);
		
		
		setSize(190,190);
		setVisible(true);
	}

}
