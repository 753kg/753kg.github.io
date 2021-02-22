package com.kosta.day05;


class Calculator{
	//1.�������(field):non-static(instance����), static(class����)
	static double pi = 3.14;
	String color;
	//2.������
	//3.�޼���:non-static(instance�޼���), static(class�޼���)
	int plus(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	//4.static block, instance block(�����ڿ� ����) 
	{
		System.out.println("instance block....new�ÿ� �ڵ�����1");
	}
	{
		System.out.println("instance block....new�ÿ� �ڵ�����2");
	}
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
		System.out.println(pi);
		//instance���� ���Ұ� System.out.println(color);
		minus(10, 20);
		//instance�޼��� ��� �Ұ� plus(10,20);
		//this��� �Ұ�  this.pi = 3;
	}
	
	
	
	//5.inner class
}

public class StaticTest {
	public static void main(String[] args) {
		System.out.println(Calculator.pi); //����ǥ�� 
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		Calculator.pi = 3.141592;
		cal1.color = "red";
		cal2.color = "blue";
		System.out.println(cal1.pi);//�ٶ����� ���ƴ�
		System.out.println(cal2.pi);//�ٶ����� ���ƴ�
		System.out.println(Calculator.pi); //����ǥ�� 
		System.out.println(cal1.color + ":" + cal2.color);
		System.out.println("-------------------------");
		System.out.println("instace�޼��� ȣ��:"+ cal1.plus(10,20));
		System.out.println("static�޼��� ȣ��:"+ cal1.minus(10,20));//�ٶ����� ���ƴ�
		System.out.println("static�޼��� ȣ��:"+ 
		                    Calculator.minus(10,20));//����ǥ�� 

	}

}
