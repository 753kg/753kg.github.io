package com.kosta.day03;

import java.util.Scanner;

/*
 *  >java Review
 *  1. Review class�� �޸𸮿� load�� .....byte code�� �޼��念���� ��
 *  2. main ȣ���
 */

public class Review {
	public static void test() {
		int a = 10;
		int b = 20;
	}
	public static void main(String[] args) {
		test();
		
		//4�� LAB scanner, datatype
		
		Scanner sc = new Scanner(System.in);
		System.out.print("[�� �Է��� ������ ������ -1�� �Է�] ");
		
		int count = 0;
		double total = 0;
		
		while(true) {
			
			System.out.print("������ �Է��Ͻʽÿ� : ");
			double score = sc.nextDouble();
			
			if(score == -1) break;
			
			count++;
			total += score;
			
		}
		
		double avg = total / count;
		System.out.println("�Էµ� �������� �� : " + count);
		System.out.println("�������� ���(double value) : " + avg);
		System.out.println("�������� ���(int value) : " + (int)avg);
		
		sc.close();

	}

}
