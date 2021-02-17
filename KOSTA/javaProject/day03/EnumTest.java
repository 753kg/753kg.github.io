package com.kosta.day03;

import java.util.Calendar;
import java.util.Date;

public class EnumTest {
	
	// ��� final
	public static final String SUCCESS="OK";
	public static final String FAIL="NO";
	public static final String LOGIN="OK";

	public static void main(String[] args) {
		
//		method1();
//		method2();
//		method3();
//		System.out.println("****************");
//		Week w = Week.WEDNESDAY;
//		call(w);
		
		EnumWeekExample();
		

	}

	private static void EnumWeekExample() {
		// ������ ������������
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getYear()+1900);	// �����������
		
		Calendar cal = Calendar.getInstance();	// calender ���¹�
		System.out.println(cal.get(Calendar.YEAR)+"�⵵");
		System.out.println(cal.get(Calendar.MONTH)+1 +"��");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"����");	
		// 1(��),2(��),3,4,5,6,7(��)
		
		call2(cal.get(Calendar.DAY_OF_WEEK));
		
	}

	private static void call2(int dayNum) {
		Week w = null;
		switch (dayNum) {
		case 1:
			w = Week.SUNDAY; break;
		case 2:
			w = Week.MONDAY; break;
		case 3:
			w = Week.TUESDAY; break;
		case 4:
			w = Week.WEDNESDAY; break;
		case 5:
			w = Week.THURSDAY; break;
		case 6:
			w = Week.FRIDAY; break;
		case 7:
			w = Week.SATURDAY; break;

		default:
			break;
		}
		
		// �ѱ۷� ���
		call(w);
		
	}

	private static void call(Week w) {
		switch (w) {
		case MONDAY:
			System.out.println("������"); break;
		case TUESDAY:
			System.out.println("ȭ����");	break;
		case WEDNESDAY:
			System.out.println("������");	break;
		case THURSDAY:
			System.out.println("�����");	break;
		case FRIDAY:
			System.out.println("�ݿ���");	break;
		case SATURDAY:
			System.out.println("�����");	break;
		case SUNDAY:
			System.out.println("�Ͽ���");	break;

		//default: �ʿ������ �Ƚᵵ��
		}
		
	}

	private static void method3() {
		Week[] aa = Week.values();
		for(Week w:aa) {
			System.out.println(w);
		}
		
	}

	private static void method2() {
		//����Ÿ�� ����
		LoginResult result;
		//����Ÿ��.���
		result = LoginResult.LOGIN_SUCCESS;
		result = LoginResult.LOGIN_FAIL;
		
		if(result == LoginResult.LOGIN_FAIL) {
			System.out.println("�α��� ����");
		}
		
		// ��� ���� ��ü���� �迭�� ����
		LoginResult[] arr = LoginResult.values();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void method1() {
		String result = "OK";
		if(result == LOGIN) {
			System.out.println("�α��� ����");
		}else if(result == FAIL){
			System.out.println("�α��� ����");
		}
		
	}

}
