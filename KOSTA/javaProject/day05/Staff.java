package com.kosta.day05;

public class Staff {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	public Staff(String name, String title, int baseSalary) {
		super();
		this.name = name;
		this.title = title + "��";
		this.baseSalary = baseSalary;
	}
	public void getTotalSalary() {
		if(title.equals("�����")) {
			totalSalary = (int)( baseSalary + baseSalary * 0.25);
		}else if(title.equals("�����")) {
			totalSalary = (int)( baseSalary + baseSalary * 0.15);
		}else {
			totalSalary = (int)( baseSalary + baseSalary * 0.05);
		}
		
		switch (title) {
		case "�����":
			totalSalary = (int)( baseSalary + baseSalary * 0.25);
			break;
		case "�����":
			totalSalary = (int)( baseSalary + baseSalary * 0.15);
			break;
		default:
			totalSalary = (int)( baseSalary + baseSalary * 0.05);
			break;
		}
		
		
		
	}
	public void print() {
		getTotalSalary();
		System.out.println(title + " ������ "
				+ name
				+ "���� ������ "
				+ baseSalary
				+ " ���̰� �ѱ޿��� "
				+ totalSalary
				+ " ���Դϴ�.");
	}
 	public static void main(String[] args) {
 		Staff[] arr = new Staff[4];
 		
 		arr[0] = new Staff("�̺���", "����", 1500000);
 		arr[1] = new Staff("�����", "����", 1300000);
 		arr[2] = new Staff("�ִ븮", "�븮", 1200000);
 		arr[3] = new Staff("�ڻ��", "���", 1000000);
		
 		for(Staff emp :arr) {
 			emp.print();
 		}
		
		
	}
}
/*
���� ������ �̺��徾�� ������ 1500000 ���̰� �ѱ޿��� 1875000 ���Դϴ�.
���� ������ ����徾�� ������ 1300000 ���̰� �ѱ޿��� 1495000 ���Դϴ�.
�븮 ������ �ִ븮���� ������ 1200000 ���̰� �ѱ޿��� 1260000 ���Դϴ�.
��� ������ �ڻ������ ������ 1000000 ���̰� �ѱ޿��� 1050000 ���Դϴ�.

*/
