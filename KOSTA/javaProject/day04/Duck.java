package com.kosta.day04;

public class Duck {
	String name;
	int legs;
	int length;
	
	void fly() {
		System.out.println("����("+name+")�� ���� �ʽ��ϴ�.");
	}
	void sing() {
		System.out.println("����("+name+")�� �Ҹ����� ��ϴ�.");
	}
	
	void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Duck [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
	
	
}
