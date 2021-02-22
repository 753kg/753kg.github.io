package com.kosta.day05;

class Duck{
	//1.�������: instance����(non-static), class����(static) 
	private String name;
	static int legs = 2;
	int length;
	void fly() {
		System.out.println("����("+ name	+ ")�� ���� �ʽ��ϴ�.");
	}
	void sing() {
		System.out.println("����("
				+ name
				+ ")��  �Ҹ����� ��ϴ�.");
	}
	void setName(String name) {
		this.name = name;
	}
	 
	public String toString() {
		return "������ �̸��� "	+ name	+ " �Դϴ�.";
	}
 
}

class Sparrow{
	//1.�������: instance����(non-static), class����(static) 
	String name;
	static int legs = 2;
	int length;
	void fly() {
		System.out.println("����("+ name	+ ")�� ���ƴٴմϴ�.");
	}
	void sing() {
		System.out.println("����("
				+ name
				+ ")��  �Ҹ����� ��ϴ�.");
	}
	void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "������ �̸��� "	+ name	+ " �Դϴ�.";
	}
 
	
}



public class PlayBird {

	public static void main(String[] args) {
		
		//static�� ��ü����(new)�� �����ϴ�.
		System.out.println("������ �ٸ����� " + Duck.legs);
		System.out.println("������ �ٸ����� " + Sparrow.legs);
		
		Duck d = new Duck();
		d.setName("�в���2");
		d.fly();
		d.sing();
		String s = d.toString();
		System.out.println(s);
		System.out.println(d);
		
		Sparrow sparrow = new Sparrow();
		sparrow.name = "±±��";
		sparrow.setName("±±��2");
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow);
		System.out.println(sparrow.toString());
	}

}
