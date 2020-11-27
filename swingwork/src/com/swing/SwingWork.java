package com.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SwingWork extends JFrame implements ActionListener {

	Font f1;
		
	private JLabel jlb1 = new JLabel("아이디 입력 :     ", JLabel.RIGHT);
	private JLabel jlb2 = new JLabel("비밀번호 입력 :     ", JLabel.RIGHT);
	private JLabel jlb3 = new JLabel("비밀번호 재입력 :     ", JLabel.RIGHT);
	
	private JTextField jtf1 = new JTextField(10);
	private JPasswordField jtf2 = new JPasswordField(10);
	private JPasswordField jtf3 = new JPasswordField(10);
	
	private CheckboxGroup cg = new CheckboxGroup();
	private Checkbox man =new Checkbox("남자", cg, true);
	private Checkbox woman =new Checkbox("여자", cg, false);
	private JButton bt = new JButton("확인");
	
	public SwingWork() {
	
		super("개인정보");
		
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
	
		con.add(jlb1);con.add(jtf1);
		con.add(jlb2);con.add(jtf2);
		con.add(jlb3);con.add(jtf3);
		
        jtf2.setEchoChar('*');jtf3.setEchoChar('*');

		f1 = new Font("굴림체", Font.BOLD, 14);
		man.setFont(f1);
		woman.setFont(f1);
				
		Panel sp = new Panel();
		sp.add(man);sp.add(woman);sp.add(bt);
		add(sp);
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jtf1.setBorder(sbb);jtf2.setBorder(sbb);jtf3.setBorder(sbb);
		
		bt.addActionListener(this);
		
		setLocation(300, 300);
		setSize(300, 300);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog d = new JDialog(this, "정보 확인", false);
		d.setLayout(new FlowLayout());
		
		if(e.getSource() == bt) {
			JLabel djlb1 = new JLabel(jtf1.getText());
			JLabel djlb2 = new JLabel(jtf2.getText());
			d.add(djlb1);
			d.add(djlb2);
		}
		if(man.getState() == true) {
			JLabel djlb3 =new JLabel("Man");
			d.add(djlb3);
		}else {
			JLabel djlb3 = new JLabel("Woman");
			d.add(djlb3);
		}
	
		d.setLocation(600, 400);
		d.setSize(200, 100);
		d.setResizable(false);
		d.setVisible(true);
		d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		new SwingWork();

	}

}
