package munjae;

import java.util.Scanner;

public class Sung {

	Scanner sc = new Scanner(System.in);

	// Record Ŭ���� student�� �迭 ����
	Record[] student;

	
	
	// �л� �� ��ũ �ν��Ͻ� ����
	public void input() {
		
		System.out.println("�л� �� �Է�: ");
		int input = sc.nextInt();
		student = new Record[input];
		
		for (int i = 0; i < student.length; i++) {

			student[i] = new Record();

		}

		

	}
	
	// �Է¹��� �л� �� ��ŭ ��,��,�� ���� �Է��ϰ� ���� �� ��� �� ���� ���ϱ�
	public void informationInput() {

		for(int i=0; i<student.length; i++) {
			
			System.out.printf("%d��° �л� �̸� �Է�: ", i+1);
			student[i].name = sc.next();
			
			for(int j=0; j<student[i].score.length; j++) {
				System.out.println(student[i].sub[j] + " ����: ");
				student[i].score[j] = sc.nextInt();
				//���� ���� ���
				student[i].sum += student[i].score[j];
			}
			// ��� ���
			student[i].avg = student[i].sum / 3.0;
			// rank �޼ҵ� ȣ�� -> ���� ���
			rank();
			System.out.println();
		}
		
		
	}
	
	// rank �޼ҵ�
	public void rank() {
		for(int i=0 ; i<student.length; i++) {
			student[i].rank = 1;
			for(int j=0; j<student.length; j++) {
				if(student[i].avg < student[j].avg)
				{
					student[i].rank++;
				}
			}
		}
		
		
	}
	
	public void print() {
		for(int i=0; i<student.length; i++) {
			System.out.println("===========================");
			System.out.println(student[i].name + "���� ���� ����");
			for(int j=0; j<student[i].score.length; j++) {
				System.out.printf("%s: %3d     ",student[i].sub[j] , student[i].score[j]);
			}
			System.out.println();
			System.out.printf("����: %3d    ���: %3.2f  ����: %d\n", student[i].sum, student[i].avg, student[i].rank);
			System.out.println("===========================");
			System.out.println();
		}
		
	}

}
