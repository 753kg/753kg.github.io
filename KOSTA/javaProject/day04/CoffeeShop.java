package com.kosta.day04;

public class CoffeeShop {

	public static void main(String[] args) {
		
		System.out.println(Coffee.count + "�� �ֹ���");	//new ���ص� ��� ����
		
		System.out.println(Coffee.getCount2());
		
		Coffee order1 = new Coffee("�Ƹ޸�ī��", 2000);
		Coffee order2 = new Coffee("ī���", 3000);		// shop���� ������ �޶� ���� ����.
		Coffee order3 = new Coffee("������ Ŀ��");			// ������ Ŀ�Ǵ� ������ ����������
		
		order1.print();		// ����� �ֹ��Ͻ� �޴��� �Ƹ޸�ī���̰�, ������ 2000�� �Դϴ�.
		order2.print();
		order3.print();
		
		System.out.println(order1.count);	// new�� �ؾ߸� ����� �� ����.
		System.out.println(order2.count);	// ���� ������ �ƴϴ�.
		System.out.println(order3.count);
		System.out.println(Coffee.count + "�� �ֹ���");	//static���� ȣ��� �ٶ����� ���
		
		System.out.println(order1.getCount());
		System.out.println(order1.getCount2());		// ���� ������ �ƴϴ�.
		System.out.println(Coffee.getCount2());		// ���� �����̴�.

	}

}
