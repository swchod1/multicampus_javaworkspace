package com.homework2;

import java.util.*;;

public class HapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x;
		HapImpl hi = new HapImpl();

		while (true) {

			do {
				System.out.print("||1.집합추가||2.집합수정||3.합치기||4.종료|| > ");
				x = sc.nextInt();

			} while (x < 1 || x > 4);

			switch (x) {
			case 1:
				hi.input();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;

			}

		}

	}

}
