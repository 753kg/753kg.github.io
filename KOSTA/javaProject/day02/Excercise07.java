package com.kosta.day02;

import java.util.Scanner;

public class Excercise07 {

	public static void main(String[] args) {
		// ����, ���, ��ȸ, ���� ���
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			
			int num = scanner.nextInt();
			if(num == 1) {
				System.out.print("���ݾ�> ");
				int input = scanner.nextInt();
				balance = balance + input;
			}else if(num == 2) {
				System.out.print("��ݾ�> ");
				int output = scanner.nextInt();
				if(output > balance) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else {
					balance = balance - output; 
				}
			}else if(num == 3) {
				System.out.println("�ܰ�> "+balance);
			}else if(num == 4) {
				break;
			}
		}
		
		System.out.println("���α׷� ����!!");

	}

}
