package com.kosta.day01;

public class VariableTest5 {
	
	// test 1 �Լ� ����
	public static void test1() {
		System.out.println("test1 ����");
		System.out.println("-----�ڵ�����ȯ-----");
		int i;
		byte b = 127;
		i = b;
		System.out.println("i= " + i);
	}
	
	// test 2 �Լ� ����
	public static void test2() {
		System.out.println("test2 ����");
		System.out.println("-----��������ȯ-----");
		int i = 2147483647;
		byte b;
		b = (byte) i;
		System.out.println("b= " + b);
	}
	
	public static void test3() {
		int a = 255;
		// Wrapper Class
		// �⺻�� ���(�� ����, ����, ��)
		// int + ����߰� -> Integer 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(a));	//2������
		System.out.println(Integer.toHexString(a));		//16����
		System.out.println(Integer.toOctalString(a));	//8����
	}
	
	public static void test4() {
		// ���� Ÿ���� ���� ==> ����� � Ÿ���ϱ�? ���� Ÿ���� ū Ÿ������ �ڵ� ����ȯ
		// ����Ŀ��� �ڵ����� ����ȯ
		int a = 10;
		double b = 3.14;
		
		double result = a + b;
		System.out.println("result= " + result);
		
		int result2 = (int)(a + b);
		System.out.println("result2= " + result2);
		
		char c = '��';
		String s1 = "�ڹٹ��ڿ�:";
		System.out.println(s1 + 10 + 20);
		System.out.println(s1 + (10 + 20));
		
		// ������ �켱������ ���ڰ� �� ����.
		int su1 = 10, su2 = 20;
		System.out.println("���ϱ�� " + (su1 + su2));
		System.out.println("����� " + (su1 - su2));
		System.out.println("���ϱ�� " + su1 * su2);
		System.out.println("������� " + su1 / su2);
	}

	// main �Լ� ����.. main�� �ڹ� ����ӽ��� �ڵ����� ȣ���Ѵ�.
	// ������ �Լ��� ȣ������ ����.
	// �����ڰ� main���� ȣ���ؾ��Ѵ�.
	public static void main(String[] args) {
		System.out.println("main ����");
		
		// test1(), test2() �Լ� ȣ��
		//test1();
		//test2();
		//test3();
		test4();
		
		System.out.println("main END");
	}

}
