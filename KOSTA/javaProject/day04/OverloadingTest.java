package com.kosta.day04;

public class OverloadingTest {
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void sum(String a, String b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		sum(10, 20);			// �ڵ�����ȯ�ż� ���� �ȳ�. �ڵ����� double�ε�
		sum("�ڹ�", "���α׷�");
		sum(3.14, 10.5);
		sum(3.14f, 10.5f);		// float -> double�� �ڵ�����ȯ

	}

}
