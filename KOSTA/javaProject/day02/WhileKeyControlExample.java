package com.kosta.day02;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControlExample {

	public static void main(String[] args) {
		
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("-------------------------");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("-------------------------");
			System.out.print("�����ϼ��� >> ");
			
			keycode = sc.nextInt();
			
			if(keycode == 1) {
				speed++;
			}else if(keycode == 2) {
				speed--;
			}else if(keycode == 3) {
				run = false;
			}
			
			System.out.println("����ӵ�: "+speed);
		}
		
		System.out.println("���α׷� ����!!");
		

	}

}
