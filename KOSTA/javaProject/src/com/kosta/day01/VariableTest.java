package com.kosta.day01;

public class VariableTest {
	
	// ���������� �ƴϸ� �ڵ����� 0���� �ʱ�ȭ��
	static int speed;
	static double speed2;
	
	// main�� ������ ���� ���� �Ұ��ϴ�.
	public static void main(String[] args) {
		
		System.out.println("speed= " + speed);
		System.out.println("speed2= " + speed2);
		
		System.out.println("������?");
		System.out.println("�������̸��̴�.");
		
		//10�� �����Ѵ�.
		//1. ���� ����
		int a; 
		
		//2. ������ ���� �Ҵ��Ѵ�
		a = 10;
		
		//3. ���� �о ����Ѵ�.
		System.out.println(a + 20);
		System.out.println(a + 30);
		
		//���� + �Ҵ�
		int score = 100;		// = �� ���Կ�����
		score = score + 10;
		score += 10;			// ���մ��Կ�����
		//����+����=>���� (���Ῥ����)
		System.out.println("������ " + score);
		
		// ��������(local variable)�� �ݵ�� �ʱ�ȭ�ϰ� ����ؾ��Ѵ�.
		int value = 0;
		int result = value + 10;
		System.out.println(result);
		
		
	}

}
