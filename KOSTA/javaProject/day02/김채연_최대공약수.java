package com.kosta.day02;

public class ��ä��_�ִ����� {

	public static void main(String[] args) {
		// �ִ� ������� �� ���ڸ� ����� ���ڷ� ����� 
		// ��������  0�� �Ǵ� ���� ū �����ǹ��մϴ�.
		gcd(2, 5);
		gcd(5, 15);
		gcd(250, 30);

	}

	private static void gcd(int v1, int v2) {
		
		// 1. ���� �� ã��
		int min = (v1 < v2)? v1 : v2;
		
		// 2. ������ �������� ���� ū �� ã��
		//int gcd=1;
		for(int i=min; i>0; i--) {
			if(v1 % i == 0 && v2 % i == 0) {
				//gcd = i;
				System.out.println(i);
				break;
			}
		}
		//System.out.println(gcd);
		
	}

}
