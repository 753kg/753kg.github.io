package com.kosta.day01;

public class OperatorTest {
	
	public static void main(String[] args) {
		method7();

	}

	private static void method7() {
		// 3�� ������
		int score = 85;
		int limit = 90;
		String result = (score >= limit) ? "�հ�" : "���հ�";
		System.out.println(result);
		
		if(score >= limit) {
			result = "�հ�";
		}else {
			result = "���հ�";
		}
		System.out.println(result);
	}

	private static void method6() {
		// || �ϳ��� ���̸� ���̴�. ���� ����� true�̸� �ڹ����� ���� ����.
		// | �ϳ��� ���̸� ���̴�. ������ ��� ���� �����Ѵ�.
		int a = 10;
		int b = 20;
		//boolean result = a >= 10 || ++b >= 20;
		boolean result = a >= 10 | ++b >= 20;
		System.out.println("result=" + result);
		System.out.println("b=" + b);
		
	}

	private static void method5() {
		// && : ��� ���̸� ���̴�. ���� ����� false�̸� �ڹ����� ���� ����.
		// & : ��� ���̸� ���̴�, ��� ���� ����.
		
		int a = 10;
		int b = 20;
		//boolean result = a < 10 && ++b >= 20;
		boolean result = a < 10 & ++b >= 20;
		System.out.println("result=" + result);
		System.out.println("b=" + b);
	}

	private static void method4() {
		int a = 10;
		int b = 20;
		// System.out.println(a = b); a�� b�� �ְ� a�� ���
		System.out.println(a == b);
		System.out.println(a != b);
		
		// "�ڹ�"��� ���ڴ� String Ŭ������ ������� (��ü)��ü�ΰ���?
		System.out.println("�ڹ�" instanceof String);
		
	}

	private static void method3() {
		int a = 10;
		int b = 20;
		int result = a++ + ++b;
		
		System.out.println("result = " + result);	//31
		System.out.println("a= " + a);	// 11
		System.out.println("b= " + b);	// 21
		
	}

	private static void method2() {
		// ���� ������
		int a = 10;
		a++;
		++a;
		a += 1;
		a = a + 1;
		// �����ϰ� ����Ѵ�. 15
		System.out.println("a= " + ++a);	// ���� ������
		// ����ϰ� �����Ѵ�. 15
		System.out.println("a= " + a++);	// ���� ������
		System.out.println(a);	// 16
		
	}

	private static void method1() {
		// ��� ������ : +, -, *, /, %
		int a = 10;
		int b = 3;
		System.out.println("��: " + a / b);
		System.out.println("������: " + a % b);
		System.out.println("�Ǽ����: " + a / (double)b);
		System.out.println("�Ǽ����: " + (double)a / b);
		System.out.println("�Ǽ����: " + 1.0*a / b);
		
	}

}
