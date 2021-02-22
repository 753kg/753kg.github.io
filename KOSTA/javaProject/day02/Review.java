package com.kosta.day02;
/*
 * 2021.02.16 ��ä��
 * ����
 * 1. Review.java �ҽ� �ۼ�
 * 2. ������ > javac Review.java
 * 	(byte code�� ����, binary �ƴ�, �߰����, 
 * 	��������� ���
 * 	c = a+b	->	add a,b)
 * 3. JVM�� ���� > java Review
 * 	add a,b -> 011001010 (����� �ٲ�)
 */
public class Review {

	// main�� �ڹٰ���ӽ��� �ڵ����� ����
	// ���α׷��� main���� �����ؼ� main���� ����
	public static void main(String[] args) {
		System.out.println("main ����!");
		
		dataTypeTest();
		castTest();

		System.out.println("main ��!");
	}

	private static void castTest() {
		int i;
		char c = 'A';
		i = c;					// 'A'�� ���ڷ� ����
		System.out.println(i);	//65
		
		c = (char) i;					// 65�� ���ڷ� ����
		c++;
		System.out.println(c);	// B
		
	}

	private static void dataTypeTest() {
		// �⺻�� : byte(1), short(2), char(2), int(4), long(8), 
		//			float(4), double(8),
		// 			boolean(1)
		// ���� : ������ ����, ����, ��
		// Wrapper class : �⺻�� + ��� ==> class
		// 1. ���� ����
		int javaScore;
		long a = Integer.MAX_VALUE + 1L;	//long�� int ���ϸ� long��, �ڵ�����ȯ
		double pi = 3.141592;
		float pi2 = 3.141592f;
		// 2. �� �Ҵ�(����)
		javaScore = 100;
		// 3. ���
		System.out.println(javaScore + 10);
		System.out.println(a);
		System.out.println(pi);
		System.out.println(pi2);
		
		
	}

}

// ctrl+shift+F �ڵ� ����
// help -> show active keybindings