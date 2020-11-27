package com.assign;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ExecuteFrame extends JFrame implements ActionListener {

	JLabel jb1 = new JLabel("���̵� �Է�:            ");
	JLabel jb2 = new JLabel("��й�ȣ �Է�:        ");
	JLabel jb3 = new JLabel("��й�ȣ ���Է�:    ");

	TextField tx1 = new TextField(20);
	TextField tx2 = new TextField(20);
	TextField tx3 = new TextField(20);

	ButtonGroup bg = new ButtonGroup();

	JRadioButton man = new JRadioButton("����", false);
	JRadioButton woman = new JRadioButton("����", false);

	JButton ok = new JButton("Ȯ��");

	JButton back = new JButton("���ư���");
	JButton exit = new JButton("����");

	JPanel[] jpanel = new JPanel[5];

	public ExecuteFrame() {

		this.setTitle("���� ����");
		Container container = this.getContentPane();
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, -5));

		for (int i = 0; i < jpanel.length; i++) {
			jpanel[i] = new JPanel();
			container.add(jpanel[i]);
		}

		bg.add(man);
		bg.add(woman);

		tx2.setEchoChar('*');
		tx3.setEchoChar('*');

		jpanel[0].setLayout(new FlowLayout());
		jpanel[0].add(jb1);
		jpanel[0].add(tx1);

		jpanel[1].setLayout(new FlowLayout());
		jpanel[1].add(jb2);
		jpanel[1].add(tx2);

		jpanel[2].setLayout(new FlowLayout());
		jpanel[2].add(jb3);
		jpanel[2].add(tx3);

		jpanel[3].setLayout(new FlowLayout());
		jpanel[3].add(man);
		jpanel[3].add(woman);
		jpanel[3].add(ok);

		jpanel[4].setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		jpanel[4].add(back);
		jpanel[4].add(exit);

		container.add(jpanel[0]);
		container.add(jpanel[1]);
		container.add(jpanel[2]);
		container.add(jpanel[3]);
		container.add(jpanel[4]);

		setSize(330, 250);
		setLocation(500, 500);
		setVisible(true);
		setResizable(false);

		back.addActionListener(this);
		exit.addActionListener(this);
		ok.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		SubDialog subDialog;

		if (e.getSource() == back)
			this.dispose();

		if (e.getSource() == exit)
			System.exit(0);

		if (e.getSource() == ok) {
			
			if (tx2.getText().equals(tx3.getText())) {

				subDialog = new SubDialog(new JLabel(tx1.getText()), new JLabel(tx2.getText()), new JLabel(""));

				if (man.isSelected()) {
					subDialog.sjb3.setText("Man");
				}
				if (woman.isSelected()) {
					subDialog.sjb3.setText("Woman");
				}
			}
			
			else {
				subDialog = new SubDialog(new JLabel(""), new JLabel("��й�ȣ ����ġ"), new JLabel(""));
			}

		}


	}

	public static void main(String[] args) {
		// new ExecuteFrame();
	
		
	}

}
