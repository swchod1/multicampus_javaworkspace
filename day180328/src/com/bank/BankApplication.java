package com.bank;

import java.util.*;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");

		System.out.print("계좌번호 : ");
		String ano = sc.next();

		System.out.print("계좌주 : ");
		String owner = sc.next();

		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();

		// 계좌 클래스의 래퍼런스 변수 선언
		Account newAccount = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			// accountArray 배열이 비어있다면
			if (accountArray[i] == null) {
				// 새로운 newAccoun를 추가
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		for (int i = 0; i < accountArray.length; i++) {

			Account account = accountArray[i];

			// 계좌가 존재한다면
			if (account != null) {

				System.out.print(account.getAno());
				System.out.println("   ");
				System.out.print(account.getOwner());
				System.out.println("   ");
				System.out.print(account.getBalance());
				System.out.println("   ");

			}

		}

	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");

		System.out.print("계좌번호 : ");
		String ano = sc.next();

		System.out.print("예금액 : ");
		int money = sc.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공되었습니다.");

	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");

		System.out.print("계좌번호 : ");
		String ano = sc.next();

		System.out.print("출금액 : ");
		int money = sc.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공되었습니다.");

	}

	private static Account findAccount(String ano) {

		Account account = null;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {

				String Ano = accountArray[i].getAno(); // accoutArray 배열에 있는 게좌 번호를 가져온다.

				if (Ano.equals(ano)) {
					account = accountArray[i];
					break;
				}

			}
		}

		return account;

	}

}
