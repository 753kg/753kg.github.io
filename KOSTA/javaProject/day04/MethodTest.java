package com.kosta.day04;

/*
 *  >java MethodTest
 *  MethodTest�� bytecode�� method������ load��
 *  static ���� �޼���, ������ �޸𸮿� �ö��
 *  static�� ���� �޼���, ������ new �ϸ� �ö�.
 */

public class MethodTest {
	
	// 1. �Ķ���� ����, return ����
	void sum() {
		System.out.println("1. �Ķ���� ����, return ����");
		sum(11,12);
		System.out.println("---------------------------");

	}
	
	// 2. �Ķ���� ����, return ����
	// �޼��� Overloading : �޼��� �̸� ���� �Ű����� ����� �ٸ���.
	void sum(int a, int b) {
		System.out.println("2. �Ķ���� ����, return ����");
		System.out.println(a + b);
		System.out.println("---------------------------");
	}
	
	void sum(String a, String b) {
		System.out.println("2. �Ķ���� ����, return ����");
		System.out.println(a + b);
		System.out.println("---------------------------");
	}
	
	// 3. �Ķ���� ����, return ����
	double sum(double a, double b, double c) {
		System.out.println("3. �Ķ���� ����, return ����");
		return a+b+c;
	}
	
	int gas;					//�ʵ�(�������), 0���� �ʱ�ȭ��
	boolean isLeftGas(int g) {	//�Ű�����
		int ga;					//��������
		if(gas == 0)
			return false;
		 
		return true;
	}
	
	public static void main(String[] args) {
		
		// static���� static�ƴ� �޼��� ȣ���Ҷ��� ��ü �����ؼ� ��.
		MethodTest a = new MethodTest();
		a.sum();
		// sum(); ===> �Ұ���
		a.sum(10, 20);
		a.sum("�ڹ�","���α׷���");
		double result = a.sum(10.5, 20.5, 30.5);
		System.out.println("result=" + result);
		
		boolean b = a.isLeftGas(0);
		System.out.println(b);

	}

}
