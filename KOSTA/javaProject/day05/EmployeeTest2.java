package com.kosta.day05;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Employee emp = new Employee("123", "È«±æµ¿", 200);
		emp.setBaseSalary(300);
		double sal = emp.getSalary(1);
		System.out.println("±Þ¿©:" + sal);
		System.out.println(emp);
	}

}
