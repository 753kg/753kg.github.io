package com.kosta.day01;

/**
 * document �ּ�
 * @author KOSTA
 *
 */

/* 
 1. MyClass.java ����
 2. javac.exe�� ������ (jdk\bin �ȿ� �ִ�)
 	>javac MyClass.java
 3. .class ������ ������
 4. JVM(�ڹٰ���ӽ�..OS���� �ٸ���)�� java.exe�� .class�� ����
 5. >java MyClass ===> main ���۵ȴ�.
 */

// public class�� .java���� �̸��� ���� Ŭ�������� ����
// �ϳ��� .java ���� ���� Ŭ������ ���� �� ����.
// public class�� �ݵ�� �ϳ��� ����.
// main method�� ������ ��ü ���� �Ұ�
public class MyClass {
	
	public static void test() {
		System.out.println("MyClass�� test");
	}
	
	public static void main(String[] args) {
		
		ATest a = new ATest();	// ��ü ����
		a.method1();
		
		test();
	}
}

// MyClass ������ ������ ���� Ŭ����
class ATest{

	public void method1() {
		System.out.println("ATest�� method1");
		
	}
	
}

class BClass{
	
}
