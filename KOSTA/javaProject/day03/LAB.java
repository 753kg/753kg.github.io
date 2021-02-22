package com.kosta.day03;

import java.util.Arrays;

public class LAB {

	public static void main(String[] args) {
		// 4��LAB(switch,�迭)
		
		// ���� 1.
		// printSeasonSwitch(args[0]);	//����� �Ű�����
		// printSeasonArray(args[0]);
		
		// ���� 2.
		// abs(args[0], args[1]);
		
		// ���� 3.
		mySort();

	}

	private static void mySort() {
		int[] arr = {3, 24, 1, 55, 17, 43, 5};
		System.out.println("before: "+Arrays.toString(arr));
		// ��������
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("after: "+Arrays.toString(arr));
		
	}

	private static void abs(String s1, String s2) {
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		int result = num1>num2 ? (num1-num2):(num2-num1);
		System.out.println(result+"��ŭ ���̰� ����.");
		
	}

	private static void printSeasonArray(String month) {
		String spring = "��", summer = "����", fall = "����", winter = "�ܿ�";
		String[] message = {null, winter,winter,spring,spring,spring,
				summer,summer,summer,fall,fall,fall,winter};
		
		int mon = Integer.parseInt(month);
		if(mon == 0 || mon >= message.length)
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
		else
			System.out.println(message[mon]+"�¾");
		
	}

	private static void printSeasonSwitch(String month) {
		String message = null;
		switch (month) {
		case "3":
		case "4":
		case "5":
			message = "��";
			break;
		case "6":
		case "7":
		case "8":
			message = "����";
			break;
		case "9":
		case "10":
		case "11":
			message = "����";
			break;
		case "12":
		case "1":
		case "2":
			message = "�ܿ�";
			break;
		default:
			message = "1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.";
			System.out.println(message);
			return;		//�Լ� ������
		}
		
		System.out.println(message+"�� �¾�̳׿�.");
		
	}

}
