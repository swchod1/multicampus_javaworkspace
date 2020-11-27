package com.homework180408practice;

import java.util.*;

public class TestMain01 {

	static int one, two, three;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread() {
			@Override

			public void run() {

				one = (int) (Math.random() * 10) + 1;
			}

		};

		t.start();

		Thread h = new Thread() {

			@Override

			public void run() {

				two = (int) (Math.random() * 10) + 1;

			}

		};

		h.start();

		Thread r = new Thread() {

			@Override

			public void run() {

				three = (int) (Math.random() * 10) + 1;

			}

		};

		r.start();

		try {

			t.join();

			h.join();

			r.join();

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		System.out.println(one + " " + two + " " + three);

		if (one == two) {

			if (two == three) {

				System.out.println("당첨");

			}

		}

	}

}
