// �������̽��� �߻�Ŭ���� ������
// - �������̽� ������ ������ ���ȭ, �޼ҵ�� �߻�޼ҵ常
// - Ŭ������ �޸� ���� ��� ����(�θ� 2���̻� ����)

package com.inter;

public class InterExam2 implements Inter3 {

	int a = 100;

	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a+=1;
	}

	public static void main(String[] args) {

		InterExam2 ie2 = new InterExam2();
		
		Inter1 i1 = ie2;
		Inter2 i2 = ie2;
		Inter3 i3 = ie2;
		
		System.out.println(i1.getA());
		System.out.println(i2.getA());
		System.out.println(i3.getData());
	
		System.out.println(i1 instanceof Object); // Object Ŭ���� ���Ͽ��� �������̽� ��ü�� ��ü��!
		System.out.println(ie2 instanceof Inter1);
		System.out.println(ie2 instanceof Inter2);
		System.out.println(ie2 instanceof Inter3);
		
	}


}
