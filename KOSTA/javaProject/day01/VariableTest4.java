package com.kosta.day01;

public class VariableTest4 {

	public static void main(String[] args) {
		// �ڹ��� �⺻Ÿ�� 8����
		// ������ Ÿ�� (������ ����)
		// 1. ���� byte(1) < short(2) < int(4) < long(8)
		//					char(2)
		// 2. �Ǽ� float(4) < double(8)
		// 3. �� boolean
		
		// �Ǽ��� �� ũ��.
		// byte < short < int < long < float < double
		
		byte b = 127;
		short s = 32767;
		char c = 65535;
		int i = 2147483647;		// 4�Ⱑ
		long lo = 2147483648L;	// ���� default�� int
		float f = 3.14f;
		double d = 3.14;		// �Ҽ��� default�� double
		boolean bo = 10 > 20;	// ��� true or false
		System.out.println(bo);
		i++;
		System.out.println(i);
		
		// data ����ȯ : �ڵ�, ����(�����)
		// 1. �ڵ� (ū�� = ������)
		byte aa = 127;
		short ss = 100;
		char cc = 'A';		//1000001
		cc = 'a';			//1100001
		int ii = ss;
		double dd = ii;
		// ss = cc;		char�� short�� �Ұ���. ������ �޶�
		ii = cc;
		
		System.out.println("ii= " + ii);
		System.out.println("dd= " + dd);
		
		// 2. ��������ȯ (������ = ū��)
		// ������ ����� ���� �սǵȴ�.
		byte b2 = 100;		// -128 ~ 127
		int i2 = 100;
		
		//i2 = b2;	(�ڵ�)
		b2 = (byte) i2;
		System.out.println(b2);
		
		// 97(a) 98 99 100(d)
		char c2 = (char) i2;
		System.out.println(c2);			// d
		
		System.out.println('A');
		System.out.println((int)'A');	//65

	}

}
