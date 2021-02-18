package com.kosta.day04;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 2) {
				deposit();
			}else if(selectNo == 2) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료!!");
		

	}

	private static void createAccount() {
		// TODO Auto-generated method stub
		// accountArray[i] = new Account();
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

}
