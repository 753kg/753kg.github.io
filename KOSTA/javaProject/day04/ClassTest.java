package com.kosta.day04;

import java.io.InputStream;
import java.util.Calendar;
import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		
		// 1. ��ü�������� ����
		String s1, s2, s3, s4;				// s1�� String�� ���� �� �ֽ��ϴ�.
		
		// 2. ��ü ����
		s1 = new String();
		s2 = new String("�ڹ�");
		byte[] b = {65, 66, 67};		//-128~127
		char[] c = {'a','b','c','d'};
		s3 = new String(b);				//65:A
		s4 = new String(c);				//
		
		// 3. ��ü ���
		System.out.println("*"+s1+"*");		//String�� �ּҰ� �ƴ϶� ���ڰ� ����.
		System.out.println("*"+s2+"*");	
		System.out.println("*"+s3+"*");	
		System.out.println("*"+s4+"*");	
		
		// Ű�����Է� : InputStream -> System.in
		
		
		InputStream aa = System.in;		//ǥ���Է¹ޱ�(Ű����)
		//aa.read();		// 1byte�� ����
		Scanner sc = new Scanner(aa);
		String s = sc.nextLine();		// �����Է¹ޱ�
		System.out.println("����� �Է���:"+s);
		
		// Calendar�� new ����.
		Calendar.getInstance();
		
		
	}

}
