package com.kosta.day02;

public class Excercise03 {

	public static void main(String[] args) {
		// for������ 1~100���� 3�� ����� ���� ���ϱ�
		
		int total = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			total = total + i;
		}
		
		System.out.println(total);

	}

}
