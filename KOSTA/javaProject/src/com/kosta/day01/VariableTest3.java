package com.kosta.day01;

public class VariableTest3 {

	public static void main(String[] args) {
		byte a = 127;
		System.out.println("byte : -128 ~ 127 ����, " + "a= " + a);
		
		// 2byte
		short b = 32767;
		System.out.println("short : -32768 ~ 32767 ����, " + "b= " + b);
		
		// 2byte, ��ȣ ����. 0~65535
		char c = 'A';	//A : 65�� �����
		System.out.println(c);
		
		// 4byte
		int d = 2147483647;
		d++; d++; d++;		
		// ���� �Ѿ�� �ٽ� ���� ���� ���� ��. -2147483648
		// ������ ����� ���� �ҽǵȴ�.
		System.out.println(d);
		
		//3		0011	�������ϱ� 1100, 1���ϱ� --> -3	1101
		//-3	1101

	}

}
