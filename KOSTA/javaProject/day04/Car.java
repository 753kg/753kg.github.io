package com.kosta.day04;

// class : object�� ����� Ʋ�̴�. template, ���赵, �ؾƲ
//			Ŭ������ ������ �޼������ �����̴�.
// object : class�� �̿��ؼ� ���� ������ ��ü�̴�. ������ Ư¡�� ���� ����.
// instance : object ��ü. object=instance
public class Car {
	// 1. Ư¡ (�������, �ʵ�)
	// ��ü���� ���� ������.
	String model;
	int year;
	int price;
	String color;
	String company = "�����ڵ���";
	
	// 2. ������ �޼��� : ������(new) �ڵ����� �����. 
	// �����ڴ� �ݵ�� class �̸��� ���ƾ��Ѵ�.
	// return�� ���� �� ����. (���� ���°� �ƴ�)
	// ���� : ���� �ʱ�ȭ
	// �����ε�(�̸� ���� �Ű����� �ٸ�), ������(�̸��� �Ȱ����� ���°� ��������)
	// this : ���� ��ü�� �ǹ�. new�� ��ü�� model, price ..
	// �Ű������� �������(�ʵ�)�� �浹�Ǵ� ��� 
	// �����ڰ� ������ �ִ� -> �ϳ��� �����ڰ� �ٸ� �����ڸ� ȣ��.
	public Car(){
		// this() : ȣ��
		this("�𵨹̰���",2000);
		System.out.println("(default)�ڵ����� �����˴ϴ�.");
	}
	
	public Car(String model){
		this(model, 4000);
		System.out.println("(parameter1)�ڵ����� �����˴ϴ�.");
	}
	
	public Car(String model, int price){
		System.out.println("(parameter2)�ڵ����� �����˴ϴ�.");
		this.model = model;		// ���� ��ü�� model = �Ű�����
		this.price = price;
	}
	
	// 3. ��� (�޼���, �Լ�)
	void go() {
		System.out.println("�ڵ����� ������ ����.");
	}
	
	void back() {
		System.out.println("�ڵ����� �ڷ� ����.");
	}
	

}
