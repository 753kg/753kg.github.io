package com.kosta.day02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);	// �Է��� ���� ���� ��
		System.out.print("�̸� >> ");		// ���� �ϸ� ���� ������ ��
		String name = sc.next();		// �ܾ�� ����. �������� �и�
		System.out.print("���� >> ");
		int age = sc.nextInt();

		sc.nextLine();					// ���� �� �� ������
		System.out.print("�ּ� >> ");
		String addr = sc.nextLine();	// 
		
		System.out.println(name + " �� ���̴� " + age);
		System.out.println("�ּҴ� " + addr);
		
		//next�� nextLine�� ���� �Ⱦ��� �� ����.
		
	}

}
