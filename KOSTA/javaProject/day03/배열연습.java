package com.kosta.day03;

import java.util.Arrays;

// �迭 : �̸��� �ϳ�, ���� ����(Ÿ��)�� ���� ���� �� �����ϱ� ���� �ڷᱸ��
public class �迭���� {

	// args : �����(command) �Ű�����
	// >java �迭���� 100 200
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		
		System.out.println(args.length + "�� parameter�� ����");
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.println(args[0]+args[1]);	// "100"+"200"="100200"
		
		// ���ڿ� -> ���� ����
		// String Class = ���(�޼���) + �Ӽ�(����)
		// Integer Class = ���(�޼���) + �Ӽ�(����)
		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.parseInt(args[1]);
		
		System.out.println(su1 + su2);
		System.out.println(su1 - su2);
		System.out.println(su1 * su2);
		System.out.println(su1 / su2);
		System.out.println(su1 % su2);

	}

	private static void method3() {
		// �迭 ������ ������ �ʼ��̴�.
		// �ڵ� �ʱ�ȭ, null�� �ʱ�ȭ
		String[] arr = new String[5];
		
		// �ʱ�ȭ�ϸ鼭 ������, ���� ���� �ȵ�
		String[] arr2 = new String[] {"java","sql","html5","css3","javascript"};
		
		String[] arr3 = {"java","sql","html5","css3","javascript"};
		
		// �����ϰ�, ���� �ʱ�ȭ �� ��
		String[] arr4;
		arr4 = new String[] {"java","sql","html5","css3","javascript"};
		
		String[] arr5;
		//arr5 = {"java","sql","html5","css3","javascript"};	// �Ұ���
		
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		// Ȯ�� for, ���� for
		for(String s : arr4) {
			System.out.println(s);
		}
	}

	private static void method2() {
		int[] arr;
		arr = new int[10];	// �ڵ����� 0�� ��
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"��°:"+arr[i]);
		}
		System.out.println(Arrays.toString(arr));	//�ѹ��� ���� Ȯ��
		
		// �⺻���� �ƴ� ���� null�� �ʱ�ȭ
		String[] arr2 = new String[5];
		System.out.println(Arrays.toString(arr2));
		
		// ���� + ���� + �ʱ�ȭ
		int[] arr3 = new int[] {100, 99, 88, 50, 10};
		int[] arr4 = {100, 99, 88, 50, 10};
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		int total = 0;
		for(int i=0; i<arr3.length; i++) {
			total += arr3[i];
		}
		System.out.println(total);
	}

	private static void method1() {
		// 1. �迭 ���� ����
		int[] score1;
		double score2[];
		boolean[] pass;
		char[] grade;
		
		// 2. �迭 ���� ... heap������ ��������� ��ü�� �ڵ� �ʱ�ȭ�ȴ�.
		score1 = new int[30];	// int -> 4byte 30�� ����
		score2 = new double[5];
		pass = new boolean[30];
		grade = new char[30];
		
		// 3. �迭 ���
		// index(÷��)�� 0���� ����, ������ 30��. 0~29
		System.out.println(score1.length);
		System.out.println(score2.length);
		System.out.println(score1[0]);		// int 0���� �ʱ�ȭ
		System.out.println(score2[0]);		// double 0.0���� �ʱ�ȭ
		System.out.println(pass[0]);		// boolean false���� �ʱ�ȭ
		System.out.println("*"+grade[0]+"*");		// char �������� �ʱ�ȭ
		
		score1[1] = 100;
		score1[2] = 99;
		System.out.println(score1[1]);
	}

}
