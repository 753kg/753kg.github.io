package com.kosta.day04;

/*
 * Modifier(����������)
 * 1) public		: ��� ��Ű������ ���� ����
 * 2) protected
 * 3) ����(default)	: ���� ��Ű���� ���� ����
 * 4) private		: ���� Ŭ���� �������� ���� ���� (��������)
 */

public class Notebook extends Object{
	
	// �������: 
	// instance����
	private String macAddress;		// ��������, ĸ��ȭ
	public String model;
	int price;
	// class����
	private static int count;
	
	// �����ڸ޼���
	public Notebook(String macAddress, String model, int price) {
		super();	//�θ� ���� ���� �� �ڽ� ����
		this.macAddress = macAddress;
		this.model = model;
		this.price = price;
		count++;
	}
	
	// �Ϲݸ޼��� ...instance�޼���
	public String getMacAddress(){
		return macAddress.substring(0, 3) + "*****";
		
	}
	
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	// �Ϲݸ޼��� ...class�޼���
	// new ���ص� ȣ���� �� �ְ�
	public static int getCount() {
		return count;
	}

	// toString() ������. �ּ�X, ���ڰ� ��µǰ��Ϸ���
	// source > generate toSring()...
	@Override
	public String toString() {
		return "Notebook [macAddress=" + macAddress + ", model=" + model + ", price=" + price + "]";
	}
	
	
	
	
}
