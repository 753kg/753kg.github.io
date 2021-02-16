package com.kosta.day02;

import java.util.Scanner;

/*
 4��LAB(if,for,scanner)
 */

// ���� >java LAB
// JVM�� static load

public class LAB {

	public static void main(String[] args) {
		// ���� 1
		// test1();
		
		// ���� 2
		//hokeyGraphics('*', 3, true);
		//hokeyGraphics('&', 3, false);
		
		// ���� 3
		// triangle();
		
		// 4��LAB(For) ����2
		// primePrint();
		
		// 4��LAB(For) ����3
		factorialPrint();
	}
	
	
	private static void factorialPrint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");
		int num = sc.nextInt();		
		sc.close();
		
		if(num < 2 || num > 9) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}else {
			for(int i=1; i<=num; i++) {
				int total = 1;
				for(int j=1; j<=i; j++) {
					total *= j;
				}
				System.out.println(i+" ! = "+total);
			}
		}
		
		
		for(int i=1; i<=num; i++) {
			int total = 1;
			for(int j=1; j<=i; j++) {
				total *= j;
			}
			System.out.println(i+" ! = "+total);
		}
	}


	private static void primePrint() {
		// 50 ������ �Ҽ� ����ϱ�
		System.out.print(2+" ");			// 2�� �Ҽ��ϱ� �׳� ���
		AA:for(int i=3; i<50; i++) {	
			for(int j=2; j < i; j++) {
				if(i % j == 0) continue AA;	//3���� ������ �������� 4�� ���� �ʿ� ����
			}
			System.out.print(i+" ");
		}
		
		
	}


	private static void triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ﰢ�� ����� �� �� : ");
		int num = sc.nextInt();		
		sc.close();
		
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num+1-row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		for(int i=num; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}


	public static void hokeyGraphics(char cell, int size, boolean isRect){
		
		if(isRect) {	//true
			for(int low = 1; low <= size; low++) {	//��
				for(int col = 1; col <= size; col++) { //ĭ
					System.out.print(cell);
				}
				System.out.println();	//�ٹٲٱ�
			}
		}else {		//false
			for(int low = 1; low <= size; low++) {
				for(int col = 1; col <= low; col++) {
					System.out.print(cell);
				}
				System.out.println();
			}
		}
		
	}
	

	private static void test1() {
//		System.in �Է��� Scanner�� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int num = sc.nextInt();		
		sc.close();
		
		int start = 1;		// Ȧ���� 1���� ����
		if(num % 2 == 0) {	// ¦���� 0���� ����
			start = 0;
		}
		
		int total = 0;
		for(int i=start; i<=num; i+=2) {
						
			total += i;
			System.out.print(i);
			System.out.print(i==num?"=":"+");
		}
		System.out.println(total);
		
	}

}
