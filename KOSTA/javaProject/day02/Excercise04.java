package com.kosta.day02;

public class Excercise04 {

	public static void main(String[] args) {
		// �� ���� �ֻ����� ������ ��
		// (��1, ��2) ���·� ���
		// ���� ���� 5�� �ƴϸ� ��� ������, 5�� ���� ���߱�
		boolean run = true;
		while(run) {
		int dice1 = (int)(Math.random() * 6 + 1);
		int dice2 = (int)(Math.random() * 6 + 1);
		int diceSum = dice1 + dice2;
		
		System.out.println("("+dice1+", "+dice2+")");
		
		if(diceSum == 5) break;
		
		}

	}

}
