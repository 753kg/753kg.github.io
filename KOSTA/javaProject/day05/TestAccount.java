package com.kosta.day05;


class Account{
	private String accNo;
	private int balance;
	
	Account(String accNo){
		this.accNo = accNo;
		String message =  " �����Ǿ����ϴ�.";		 
		print(message);
	}	
	void save(int amount) {
		balance += amount;		
		String message = amount + "������ �ԱݵǾ����ϴ�.";
		print(message);		
	}
	void deposit(int amount) {
		balance -= amount;
		String message =  amount + "������ ��ݵǾ����ϴ�.";
		print(message);
	}
	int getBalance(){
		return balance;
	}
	String getAccNo(){
		return accNo;
	}	
	void print(String message) {
		System.out.println(accNo + "���� " + message);
		//System.out.println(accNo + "������ �ܰ�� " + balance  + "�����Դϴ�.");
		System.out.println(getAccNo() + "������ �ܰ�� " + 
				getBalance()  + "�����Դϴ�.");		
	}
	
	
}

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account("078-3762-293");
		a.save(100);
		a.deposit(30);
		
		String s = new String("�ڹ�");
		System.out.println(s);
		System.out.println(s.toString());
		
		
		System.out.println(a);
		System.out.println(a.toString());
		
	}
   
}



