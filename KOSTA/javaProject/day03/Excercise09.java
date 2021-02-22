package com.kosta.day03;

import java.util.Scanner;

public class Excercise09 {

	public static void main(String[] args) {
		boolean run = true;
		
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);

		int studentCount = 0;
		int total;

		
		while(run) {
			
			System.out.println("----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentCount = scanner.nextInt();
				
			}else if(selectNo == 2) {
				scores = new int[studentCount];
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = scanner.nextInt();
				}
				
			}else if(selectNo == 3) {
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
				
			}else if(selectNo == 4) {
				//�ְ�����
				int max=0;
				for(int score:scores)
					if(score > max) max = score;
//				for(int i=0; i<scores.length-1; i++) {
//					max = scores[i] > scores[i+1] ? scores[i] : scores[i+1];
//				}
				
				//������� double
				total = 0;
				for(int i=0; i<scores.length; i++) {
					total += scores[i];
				}
				
				double avg = total / studentCount;
				System.out.println("�ְ� ����: "+max);
				System.out.println("��� ����: "+avg);
				
			}else if(selectNo == 5) {
				System.out.println("���α׷� ����!");
				run = false;
			}
			
			
		}
		
		scanner.close();

	}

}
