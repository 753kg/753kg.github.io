package com.kosta.day01;

public class VariableTest2 {
	
	// class �ȿ� �� �� �ִ� ��?
	// 1. ������� ...�ڵ��ʱ�ȭ�ȴ�.
	static int speed;
	// 2. �޼���
	// 3. static block
	// 4. instance block
	// 5. inner class
	
	// System.out.println("a"); -> ����
	
	public static void main(String[] args) {
		// ���������� �ݵ�� �ʱ�ȭ �ؾ��Ѵ�.
		int speed2;
		// static int speed2; -> �̷��� �ȵ�
		
		System.out.println("aaaa");
		
		speed++;			// 1 ����
		speed = speed + 1;
		speed += 1;
		speed2 = 100;
		
		System.out.println(speed);
		System.out.println(speed2);
		
		//int a = 100;
		{
			int a = 10;
			System.out.println("a= " + a);
			
		}
		
		//System.out.println("a= " + a);
		
	}
}
