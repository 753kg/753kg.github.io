package com.kosta.day02;

public class IfTest {

	public static void main(String[] args) {
		//randomTest();
		//randomTest2();

	}

	private static void randomTest2() {
		// ������ �� �����
		int dice = (int)(Math.random() * 6 + 1);
		// ¦������ Ȧ������ �Ǵ�
		String result;
		if(dice % 2 == 0) {
			result = "¦��";
		}else {
			result = "Ȧ��";
		}
				
		System.out.println(dice + ", " + result+"�Դϴ�.");
		System.out.println(dice + ", " + (dice%2==0?"¦��":"Ȧ��")+"�Դϴ�.");
		
	}

	private static void randomTest() {
		// Math : ���а��Ŀ��� �ʿ��� ��ɵ��� ��Ƴ��� Ŭ����
		System.out.println(Math.PI);
		System.out.println(Math.random());	//0<=random<1
		
		System.out.println((int)(Math.random() * 10));	//0<=random*10<10
		System.out.println((int)(Math.random() * 10 + 1));	//1<=random*10<11
		// 1<=�ζ�<=45
		System.out.println((int)(Math.random() * 45 + 1));	//1<=random*10<11
		
	}

}
