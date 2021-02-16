package com.kosta.day02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// �⵵, ���� �ش��ϴ� ���� ���
		// 1. 4�� ����� �ش� ����
		// 2. 4�� ����̸鼭 100�� ����� �ش� ������ �ƴ�
		// 3. 100�� ����̸鼭 400�� ����� �ش� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ���(2000 2) >> ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		sc.close();
		
		ifTest(year, month);
		switchTest(year, month);

	}
	
	public static void switchTest(int year, int month) {
		
		int lastDay = 31;
		
		switch(month) {
		case 2:
			if(year % 4 == 0 && year % 100 != 0 ||
			year % 4 == 0 && year % 400 == 0) {
				lastDay = 28;
			} else {
				lastDay = 29;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30; break;
		}
		
		System.out.println(year+"�� "+month+"���� ������ "+lastDay+"�Դϴ�.");
	}
	
	public static void ifTest(int year, int month) {
		
		// 4�� �����, 100�� ����� �ƴϸ� ����
		// 4�� ����̰�, 400�� ����� ����
		// �����̸� 2���� 29��, �ƴϸ� 28��
		// 1, 3, 5, 7, 8, 10, 12 -> 31��
		// 4, 6, 9, 11 -> 30��
		int lastDay = 31;	// ���� �ִ� ������ �ʱ�ȭ
		
		// �켱������ ||���� &&�� ������.
		if(month == 2) {
			if(year % 4 == 0 && year % 100 != 0 || 
					year % 4 == 0 && year % 400 == 0) {
				lastDay = 28;
			}else {
				lastDay = 29;
			}
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			lastDay = 30;
		}
			System.out.println(year+"�� "+month+"���� ������ "+lastDay+"�Դϴ�.");
		
	}

}
