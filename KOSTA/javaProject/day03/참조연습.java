package com.kosta.day03;

public class �������� {

	public static void main(String[] args) {
		//sample();
//		sample2();
		sample3();
	}

	private static void sample3() {
		// �������� �Ϲ������� null�� �ʱ�ȭ��
		// null : ���ǵ� �ٰ� ����. �����ϴ� ���� ����.
		String s = null;
		System.out.println(s);
		System.out.println(s == null);
		s = "�̰��� �ڹٴ�";
		System.out.println(s.length());	//���ڿ����̱��ϱ�
		
	}

	private static void sample2() {
		//���������� �ݵ�� �ʱ�ȭ�ϰ� ����Ѵ�.
		int a = 0;
		double d = 0.0;
		boolean b = false;
		char c = ' ';
		System.out.println(a + d);
		System.out.println(b);
		System.out.println(c);
		
	}

	private static void sample() {
		// �⺻��
		int a=10;
		int b=10;
		System.out.println(a == b);
		System.out.println(++a == ++b ? "����":"�ٸ���");
		
		// �������� �ּҸ� ��
		String s1 = "ȫ�浿";
		String s2 = "ȫ�浿";
		String s3 = new String("ȫ�浿��");
		String s4 = new String("ȫ�浿��");
		
		System.out.println(s1 == s2);	//true. �ּҰ� ����.
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		s1 = s1 + "��";	// ���ڿ��� ���� ������ ����. ���� �Ұ�
						// "ȫ�浿��"�� ���� �ּҸ� ����Ŵ.
		s2 = s2 + "��";
		
		System.out.println(s1 == s2);	//false. �ּҰ� �ٸ���.
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		// ������ ������ ������
		System.out.println(s1.equals(s4)?"�����̰���":"�����̴ٸ���"); // true
		
		
		System.out.println(s3 == s4);	//false
		
		// �ּ� ����
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	
		
	}

}
