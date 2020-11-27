package com.prac;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class CardLayEx extends JFrame implements ActionListener {
	JPanel panel;
	Cards cards;

	public CardLayEx() {
		setTitle("Card 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);

		panel = new JPanel(new GridLayout(0, 5, 10, 0));
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);
		add(panel, "North");

		cards = new Cards();
		add(cards, "Center");

		setVisible(true);
	}

	// 버튼생성
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}

	// 카드 탭 10개 생성
	private class Cards extends JPanel {
		CardLayout layout;

		public Cards() {
			layout = new CardLayout();
			setLayout(layout);

			for (int i = 1; i <= 10; i++) {
				add(new JButton("현재 카드의 번호는" + i + "입니다"));
			}
		}
	}

	// 이벤트처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		} else if (e.getActionCommand().equals("<<")) {
			cards.layout.first(cards);
		} else if (e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		} else if (e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		} else if (e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	}

}

		/*


		class CardExe extends JFrame implements ActionListener {
		   JPanel panel;
		   Cards cards;

		   public CardExe() {
		      setTitle("Card 연습");
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setSize(400, 200);

		      panel = new JPanel(new GridLayout(0, 5, 10, 0));
		      addButton("<<", panel);
		      addButton("<", panel);
		      addButton(">", panel);
		      addButton(">>", panel);
		      addButton("종료", panel);
		      add(panel, "North");

		      cards = new Cards();
		      add(cards, "Center");

		      setVisible(true);
		   }

		   // 버튼생성
		   void addButton(String str, Container target) {
		      JButton button = new JButton(str);
		      button.addActionListener(this);
		      target.add(button);
		   }

		   // 카드 탭 10개 생성
		   private class Cards extends JPanel {
		      CardLayout layout;

		      public Cards() {
		         layout = new CardLayout();
		         setLayout(layout);

		         for (int i = 1; i <= 10; i++) {
		            add(new JButton("현재 카드의 번호는" + i + "입니다"));
		         }
		      }
		   }

		   // 이벤트처리
		   @Override
		   public void actionPerformed(ActionEvent e) {
		      if (e.getActionCommand().equals("종료")) {
		         System.exit(0);
		      } else if (e.getActionCommand().equals("<<")) {
		         cards.layout.first(cards);
		      } else if (e.getActionCommand().equals("<")) {
		         cards.layout.previous(cards);
		      } else if (e.getActionCommand().equals(">")) {
		         cards.layout.next(cards);
		      } else if (e.getActionCommand().equals(">>")) {
		         cards.layout.last(cards);
		      }
		   }

		}

		public class CardTest {
		   public static void main(String[] args) {
		      CardExe f = new CardExe();
		   }
		}*/

