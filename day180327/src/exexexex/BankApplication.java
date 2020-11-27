package exexexex;


import java.util.*;


public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int count;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				creatAccount();
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
	
	
	
	// 계좌생성하기
	private static void creatAccount() {
		
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		
		if(ano != null && owner != null) {
		accountArray[count] = new Account(ano, owner, balance);
		System.out.println("결과 :  계좌가 생성되었습니다.");
		count++;
		} 
	}
	
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (int i = 0; i < count; i++) {
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() 
					+ "\t" + accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("입금액 : ");
		int balance = sc.nextInt();

		for (int i = 0; i < count; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				accountArray[i].setBalance(accountArray[i].getBalance() +balance);
				System.out.println("결과 : 예금이 성공되었습니다.");
			}
		}
		
	}
	
	private static void withdraw() {
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("출금액 : ");
		int balance = sc.nextInt();

		for (int i = 0; i < count; i++) {
			if (!accountArray[i].getAno().equals(ano)) {
				System.out.println("결과 : 일치하는 정보가 없습니다. 계좌번호를 다시 확인해 주세요");
			} else {				
				if (accountArray[i].getBalance() < balance) {
					System.out.println("결과 : 잔액이 부족합니다.");
					return;
				} else {					
					accountArray[i].setBalance(accountArray[i].getBalance() - balance);
					System.out.println("결과 : 출금이 성공되었습니다.");
				}
				
			}
		}
		
	}
	
	
	
	
	

}
