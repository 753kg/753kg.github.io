package com.kosta.day04;

public class Coffee {
	
	// field : instance���� or class����
	// instance���� : new �� ������ �������. object���� ����. static �Ⱥ���
	// class���� : ��ü���� �����ϴ� ����, static �پ��ִ�.
	String menuName;
	int price;	
	static int count;	// instance���� �����ϴ� ����
	
	Coffee(String menuName){
		this(menuName, 1000);
	}
	
	Coffee(String menuName, int price){
		System.out.println("�����մϴ�.");
		this.menuName = menuName;
		this.price = price;
		count++;
	}
	
	void print() {
		System.out.println("----�ֹ���----");
		System.out.println("�޴� : " + menuName);
		System.out.println("���� : " + price);
	}
	
	// instance �޼���
	// new �ؾ߸� ��� ����
	// static �ƴѰͿ��� static �� �� �ִ�.
	int getCount() {
		System.out.println(menuName);	// ��� ����
		return count;
	}
	
	// class �޼���
	// new ���ص� ��� ����
	static int getCount2() {
		// System.out.println(menuName);	// static�ΰͿ��� static�ƴѰ��� ���Ұ���
		return count;
	}

}
