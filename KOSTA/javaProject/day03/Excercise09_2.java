package com.kosta.day03;

import java.util.Scanner;

public class Excercise09_2 {

	public static void main(String[] args) {
		
		quiz09();

	}

	private static void quiz09() {
		
		boolean run = true;
		int[] scores = null;
		int studentCount = 0;

		Scanner scanner = new Scanner(System.in);
		
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
				getMaxScore(scores);
				//�������
				getAvg(scores, studentCount);
				
			}else if(selectNo == 5) {
				System.out.println("���α׷� ����!");
				run = false;
			}	
		}
		scanner.close();
	}
	
	private static void getMaxScore(int[] scores) {
		int max=0;
		for(int i=0; i<scores.length-1; i++) {
			if(scores[i] > max) max = scores[i];
		}
		System.out.println("�ְ� ����: "+max);
	}
	
	private static void getAvg(int[] scores, int studentCount) {
		int total = 0;
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		double avg = total / studentCount;
		System.out.println("��� ����: "+avg);
	}

}
