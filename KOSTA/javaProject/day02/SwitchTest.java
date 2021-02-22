package com.kosta.day02;

public class SwitchTest {

	public static void main(String[] args) {
		
		int score = (int)(Math.random() * 101);	// 0 ~ 100��
		String grade;
		
		// 90 <= score <= 100 : "A"
		// 80 <= score <= 89 : "B"
		// break; switch���� ����������
		// ����ð��� ����
		switch(score/10) {
		case 10:
		case 9: 
			grade = "A"; break;
		case 8: 
			grade = "B"; break;
		case 7: 
			grade = "C"; break;
		case 6: 
			grade = "D"; break;
		default: 
			grade = "F";			//�������� break ���ص���
		}
		System.out.println(score + " ==> " + grade);

	}

}
