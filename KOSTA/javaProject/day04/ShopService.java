package com.kosta.day04;

public class ShopService {
	
	// �ڽ��� ��ü�� ������ �ʱ�ȭ
	// private : �ܺο��� ������ ȣ���� ����.
	private static ShopService ss = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return ss;
	}
	
}
