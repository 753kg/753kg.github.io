package com.kosta.day02;

public class ���ǹ� {

	public static void main(String[] args) {
		System.out.println("main start");
		//ifTest();
		//ifElseTest();
		ifElseIfTest();
		System.out.println("main end");

	}
	
	private static void ifElseIfTest() {
		int score = 100;
		char grade = 'F';		
		if(score >= 90) {
			System.out.print("�� ���߽��ϴ�... A");
			if(score >= 95) {
				grade = '+';
			}else {
				grade = '-';				
			}
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}
//		else {
//			grade = 'F';
//		}
		// else�� ��� �ȴ�.
		System.out.println(grade + " �Դϴ�.");
		
	}

	private static void ifElseTest() {
		int score = 100;
		
		if(score >= 60) {
			//������ ����� ���� ��츸 ����
			System.out.println("�հ�");
		}else {
			//������ ����� ������ ��츸 ����
			System.out.println("���հ�");
		}
		
		//3�׿�����
		System.out.println(score>=60?"�հ�":"���հ�");
		
		System.out.println("if-else ��");
		
	}

	private static void ifTest() {
		int score = 99;
		
		// ���ǹ��� ���๮�� ���������̸� �ݵ�� ���� ����Ѵ�.
		if(score >= 90) {
			System.out.println("�հ�");
			System.out.println("�����մϴ�.");
		}
		
		//���ǹ��� ���๮�� 1������ ���, {} ���� ����
		if(score >= 90) 
			System.out.println("�հ�");
		
		//���׿�����
		System.out.println(score>=90?"�հ�":"");
		
		System.out.println("if ����");
	}

}
