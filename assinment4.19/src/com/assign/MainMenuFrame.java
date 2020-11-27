package com.assign;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MainMenuFrame extends JFrame implements ActionListener {

	MenuBar menu = new MenuBar();

	private Menu select = new Menu("����");

	private Menu login = new Menu("�α���");
	private MenuItem exit = new MenuItem("�����ϱ�");

	private MenuItem execute = new MenuItem("����");

	public MainMenuFrame() {
		this.setTitle("���� �޴�");

		setMenuBar(menu);

		menu.add(select);

		select.add(login);
		select.add(exit);

		login.add(execute);

		Container container = this.getContentPane();
		container.setLayout(new GridLayout(2, 1));

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		LineBorder lb1 = new LineBorder(Color.DARK_GRAY, 3);
		LineBorder lb2 = new LineBorder(Color.DARK_GRAY, 3);

		container.add(jp1);
		container.add(jp2);

		jp1.setBorder(lb1);
		jp2.setBorder(lb2);

		jp1.setBackground(Color.gray);
		jp2.setBackground(Color.WHITE);

		jp1.add(new JLabel("�׽�Ʈ �� �ʱ�ȭ��", JLabel.CENTER));
		jp2.add(new JLabel("����Ŵ ����", JLabel.CENTER));

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		exit.addActionListener(this);
		execute.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exit) {
			System.exit(0);
		}if(e.getSource() == execute) {
			new ExecuteFrame();
		}
		
	}

	public static void main(String[] args) {
		new MainMenuFrame();
	}

}
