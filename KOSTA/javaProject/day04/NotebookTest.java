package com.kosta.day04;

public class NotebookTest {

	public static void main(String[] args) {
		
		String s = new String("�ڹ�");
		System.out.println(s);			// s = s.toString(), String�� ���� ��µ�
		
		System.out.println(Notebook.getCount()+"�� ����...�޼�������");
		// **private�� �ܺ����ٺҰ�
		// System.out.println(Notebook.count + "�� ����...�ʵ�����");
		
		Notebook n1 = new Notebook("abc12345", "gram123", 150);
		Notebook n2 = new Notebook("ggg12345", "samsung123", 250);
		Notebook n3 = new Notebook("hhh12345", "LG123", 100);
		
		System.out.println(Notebook.getCount()+"�� ����...�޼�������");
		
		System.out.println(n1.getMacAddress());
		n1.setMacAddress("ABCD12345");
		System.out.println(n1.getMacAddress());

		System.out.println(n1);				// �ּҰ� ��µ�
		System.out.println(n1.toString());	// n1 = n1.toString()

	}

}
