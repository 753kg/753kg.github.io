package com.kosta.day04;

public class Person {
	//5�� LAB(��ü���� Person)
	
	static int numberOfPersons;
	int age;
	String name;
	
	public Person(){
		this(12, "Anonymous");
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	void selfIntroduce() {
		System.out.println("�� �̸��� " + name + "�̸�, ���̴� " + age + "�� �Դϴ�.");
	}
	
	static int getPopulation() {
		return numberOfPersons;
	}
	
	public static void main(String[] args) {
		System.out.println(Person.getPopulation());
		Person p1 = new Person();
		Person p2 = new Person(3, "ö��");
		p1.selfIntroduce();
		p2.selfIntroduce();
		System.out.println(Person.getPopulation());
	}
	
}
