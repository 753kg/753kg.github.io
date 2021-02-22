package com.kosta.day05;

//��������(business logic)����. 
//DTO(Data Transfer Object) : �����͸� �����ϱ����� ��ü 
//VO(Value Object) : ���� �ִ� �����̴�. 
//Beans���: ������  private����������, �޼���� public����������
//     getter/setter����,default�������ʼ�  
public class Book {
	private String title;
	private int price;
	public Book() {
		//default������ 
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}




