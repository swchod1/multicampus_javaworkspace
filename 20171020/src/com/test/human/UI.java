package com.test.human;

import java.util.Scanner;

public class UI {
	private Scanner sc;			// ��ĳ��
	private Manager manager;	// ������ ����
	
	public UI() {
		sc = new Scanner(System.in);
		manager = new Manager();
	}
	
	public void start() {
		
		boolean exit = true;
		while (exit) {
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ��ü ���");
			System.out.print("�Է� >> ");
			
			int option = 0;
			try {
				option = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����� ������");
				/* 
				 * ���ۿ� �����ִ� �߸� �Էµ� ���ڸ� �����ϱ� ���Ͽ�
				 * sc.next(); �� ���ְ� �ȴ�
				 */
				sc.next();
				continue;
			}
			
			switch (option) {
			case 1: // ���
				insert();
				break;
				
			case 2: // �˻�
				select();
				break;
				
			case 3: // ����
				break;
				
			case 4: // ��ü���
				break;
				
			case 9: // ����
				break;

			default:
				break;
			}
		}
	} // method start
	
	private void insert() {
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("����: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("�ֹι�ȣ: ");
		String socialNumber = sc.nextLine();
		
		Human h = new Human(name, age, socialNumber);
		
		// �Ŵ����� ��ü�� �����Ͽ��� ����
		boolean canAdd = manager.insert(h);
		if (canAdd) {
			System.out.println("����� �Ϸ�Ǿ����ϴ�");
		} else {
			System.out.println("��Ͽ� �����Ͽ����ϴ�");
		}
	} // method insert
	
	private void select() {
		
		System.out.print("�ֹι�ȣ �Է�: ");
		String socialNumber = sc.nextLine();
		
		Human select = manager.select(socialNumber);
		
		if (select == null) {
			System.out.println("�ƹ� �͵� �� ã�Ҵ�");
		} else {
			System.out.println(select);
		}
		
	} // method select
	
}









