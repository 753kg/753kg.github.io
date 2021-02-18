package com.kosta.day04;

public class EmployeeTest {
	public static void main(String[] args) {
		// main�� static�̶�
		// static�� �ƴ� class ����� �� new ���
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(2, "ȫ�浿");
		Employee emp3 = new Employee(3, "��浿", "���ߺ�");
		Employee emp4 = new Employee(4, "�ڱ浿", "������", "010-8888-9999");
		
		// ������ ���� �ٲٱ�X, �Լ��� ���ؼ� ����(�� �ٶ���)
		// emp1.phone = "010-2222-3333" (X)
		emp1.changePhone("010-2222-3333");
		emp1.print();
		emp2.changePhone("010-5555-6666");
		emp2.print();
		
		String s = emp3.getEmpInfo();
		System.out.println(s);
		String s2 = emp4.getEmpInfo();
		System.out.println(s2);
		
		String s3 = emp4.changePhone2("010-1111-1111");
		System.out.println("������: "+s3);
		s2 = emp4.getEmpInfo();
		System.out.println(s2);
		
		
	}
}
