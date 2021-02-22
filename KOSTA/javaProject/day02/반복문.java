package com.kosta.day02;

// java.util ��Ű���� �ִ� Scanner Ŭ������ 
// �ݺ����̶�� class���� ��� ��� ����
import java.util.Scanner;

public class �ݺ��� {

	public static void main(String[] args) {
		//forTest();
		//whileTest();
		//dowhileTest();
		//sum();
		//sum2();
		//sum3();
		
		// ����ڰ� Ű����� ���� �Է��ϰ�, �Էµ� ���ڱ����� �հ踦 ���.
		// System.out : ǥ�� ���(�����)
		// System.in : ǥ�� �Է�(Ű����)
		// System.in.read -> 1byte���� ���� �� ����.
		// Scanner class : ǥ�� ������� ���� �ϵ��� ������.
		
		// java.lang ��Ű���� ����ִ� Ŭ������ ������ ��� ����.
		// �ٸ� ��Ű���� ����ִ� Ŭ������ import �ϰ� ���.
		
		Scanner sc = new Scanner(System.in);
		
		for(; ; ) {
			System.out.print("���ڸ� �Է��ϼ��� >> ");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("����!!");
				break;	// �ݺ������� ��������. if�� �ݺ��� �ƴ�
			}
			sum4(num);
		}
		
		sc.close();

	}
	
	// �Լ�: ���, ����
	// �Ķ����(argument), ����
	
	private static void sum4(int limit) {
		
		int i;
		int total = 0;
		for(i=1; i<=limit; i++) {
			total = total + i;
		}
		System.out.println(limit + "������ �հ�� " + total);
		
	}
	
	private static void sum3() {
		// TODO Auto-generated method stub
		int i=1;
		int total = 0;
		do {
			total = total + i;
			i++;
		}while(i<=10);
		System.out.println("�հ�� " + total);
	}

	private static void sum2() {
		// TODO Auto-generated method stub
		int i=1;
		int total = 0;
		while(i<=10) {
			total = total + i;
			i++;
		}
		System.out.println("�հ�� " + total);
	}

	private static void sum() {
		// 1~10���� ���ϱ�
		int i;
		int total = 0;
		for(i=1; i<=10; i++) {
			total = total + i;
		}
		System.out.println("�հ�� " + total);
		
	}

	private static void dowhileTest() {
		int i=0;
		do {
			System.out.println(i+":Hello");
			i++;
		}while(i > 5);
		System.out.println(i+":do-while end");
		
	}

	private static void whileTest() {
		int i=0;
		while(i < 5) {
			System.out.println(i+":Hello");
			i++;
		}
		System.out.println("while end");
		
	}

	private static void forTest() {
		System.out.println("for start!--------");
		int i;
		// 1. �ʱⰪ ���� (1�� �ݵ�� �����)
		// 2. ���ǹ� üũ, ���ǿ� ������ looping, �ȸ����� ��������
		// 3. for �ȿ� �ִ� ����� ����
		// 4. ���� ����
		// 5. 2������ ��. �ٽ� ���ǹ� üũ
		for(i=1; i<=5; i++) {
			System.out.println(i + ":Hello");
		}
		System.out.println(i + ":for end!---------");
		
		i=1;
		for(; ; ) {
			if(i > 5) {
				System.out.println("for ������ �����ϴ�.");
				break;
			}
			System.out.println(i + ":Hello");
			i++;
		}
		System.out.println(i + ":for end!---------");
	}

}
