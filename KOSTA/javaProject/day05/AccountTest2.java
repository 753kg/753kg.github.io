package com.kosta.day05;

public class AccountTest2 {

	public static void main(String[] args) {
		//���°� �������ִ�.
		//1.�迭���� 
		Account[] arr = new Account[3];
		//2.��ü����
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Account(i+1+"����");
		}
		//3.��ü���� 
		for(Account acc:arr) {
			acc.save(10);
		}
		
		

	}

}
