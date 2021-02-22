package com.kosta.day04;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int accountIndex = 0;
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.�Ա� | 4.��� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����!!");
		

	}

	private static void createAccount() {
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ: ");
		String accountNumber = scanner.nextLine();
		
		System.out.print("������: ");
		String accountOwner = scanner.nextLine();
		
		System.out.print("�ʱ��Աݾ�: ");
		int deposit = scanner.nextInt();
		
		accountArray[accountIndex] = new Account(accountNumber, accountOwner, deposit);
		accountIndex++;
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
		
	}

	private static void accountList() {
		System.out.println("-------");
		System.out.println("���¸��");
		System.out.println("-------");
		
		for(int i=0; i<accountIndex; i++) {
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
		
	}

	private static void deposit() {
		System.out.println("-------");
		System.out.println("����");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ: ");
		String aNo = scanner.nextLine();
		
		System.out.print("���ݾ�: ");
		int deposit = scanner.nextInt();
		
		Account ac = findAccount(aNo);
		int balance = ac.getBalance() + deposit;
		ac.setBalance(balance);
		
		System.out.println("���: ������ �����Ǿ����ϴ�.");
		
//		for(int i=0; i<accountIndex; i++) {
//			if(aNo.equals(accountArray[i].getAno())) {
//				int balance = accountArray[i].getBalance() + deposit;
//				accountArray[i].setBalance(balance);
//				System.out.println("���: ������ �����Ǿ����ϴ�.");
//				return;
//			}
//		}
//		System.out.println("��ġ�ϴ� ���¹�ȣ�� �����ϴ�.");
		
	}

	private static void withdraw() {
		System.out.println("-------");
		System.out.println("���");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ: ");
		String aNo = scanner.nextLine();
		
		System.out.print("��ݾ�: ");
		int withdraw = scanner.nextInt();
		
		Account ac = findAccount(aNo);
		int balance = ac.getBalance() - withdraw;
		ac.setBalance(balance);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
		
//		for(int i=0; i<accountIndex; i++) {
//			if(aNo.equals(accountArray[i].getAno())) {
//				int balance = accountArray[i].getBalance() - withdraw;
//				accountArray[i].setBalance(balance);
//				System.out.println("���: ����� �����Ǿ����ϴ�.");
//				return;
//			}
//		}
//		System.out.println("��ġ�ϴ� ���¹�ȣ�� �����ϴ�.");
//		
	}
	
	private static Account findAccount(String ano) {
		Account a = null;
		for(int i=0; i<accountIndex; i++) {
			if(ano.equals(accountArray[i].getAno())) {
				a = accountArray[i];
			}
		}
		return a;
	}

}